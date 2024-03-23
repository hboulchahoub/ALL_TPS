package ma.gov.licence.pfe.dtos;

import lombok.Data;

@Data
public class UserResponseDto {
    private String code;
    private String message;
    private String role;
}
