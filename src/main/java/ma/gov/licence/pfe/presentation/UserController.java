package ma.gov.licence.pfe.presentation;

import ma.gov.licence.pfe.dtos.UserRequestDto;
import ma.gov.licence.pfe.dtos.UserResponseDto;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final AuthenticationProvider authenticationProvider;

    public UserController(AuthenticationProvider authenticationProvider) {
        this.authenticationProvider = authenticationProvider;
    }

    @PostMapping
    public UserResponseDto authenticate(@RequestBody UserRequestDto requestDto) {
        Authentication authentication = new UsernamePasswordAuthenticationToken(requestDto.getUserName(), requestDto.getPassword());
        UserResponseDto responseDto = new UserResponseDto();
        try {
            Authentication authenticationResult = authenticationProvider.authenticate(authentication);
            responseDto.setCode("200");
            responseDto.setMessage("Success authentication");
            responseDto.setRole("" + authenticationResult.getAuthorities());
            SecurityContext sc= SecurityContextHolder.getContext();
            sc.setAuthentication(authenticationResult);
        } catch (AuthenticationException e) {
            responseDto.setCode("401");
            responseDto.setMessage("fail authentication");
        }
        return responseDto;
    }
}
