package ma.gov.licence.pfe.presentation;

import ma.gov.licence.pfe.dtos.ExamenReponseDto;
import ma.gov.licence.pfe.dtos.ExamenRequestDto;
import ma.gov.licence.pfe.services.IExamService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exams")
public class ExamenController {
    private final IExamService examService;

    public ExamenController(IExamService examService) {
        this.examService = examService;
    }

    @PostMapping
    public ExamenReponseDto create(@RequestBody  ExamenRequestDto requestDto){
        return examService.create(requestDto);
    }
}
