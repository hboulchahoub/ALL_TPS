package ma.gov.licence.pfe.presentation;

import lombok.extern.slf4j.Slf4j;
import ma.gov.licence.pfe.dtos.ConsultationRequestDto;
import ma.gov.licence.pfe.dtos.ConsultationResponseDto;
import ma.gov.licence.pfe.services.ConsultationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consultation")
@Slf4j
public class ConsultationController {

    private final ConsultationService consultationService;

    public ConsultationController(ConsultationService consultationService) {
        this.consultationService = consultationService;
    }

    @PostMapping
    public ConsultationResponseDto create(@RequestBody ConsultationRequestDto requestDto) {
       log.debug(" request ConsultationRequestDto {} ",requestDto);
        return consultationService.create(requestDto);
    }
}
