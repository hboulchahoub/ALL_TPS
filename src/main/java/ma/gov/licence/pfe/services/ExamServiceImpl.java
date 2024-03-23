package ma.gov.licence.pfe.services;

import ma.gov.licence.pfe.dtos.ExamenReponseDto;
import ma.gov.licence.pfe.dtos.ExamenRequestDto;
import ma.gov.licence.pfe.mappers.ExamMapper;
import ma.gov.licence.pfe.repositories.ExamRepository;
import org.springframework.stereotype.Service;

@Service
public class ExamServiceImpl implements IExamService{

    private final ExamRepository examRepository;
    private final ExamMapper examMapper;

    public ExamServiceImpl(ExamRepository examRepository, ExamMapper examMapper) {
        this.examRepository = examRepository;
        this.examMapper = examMapper;
    }

    public ExamenReponseDto create (ExamenRequestDto requestDto){
        ExamenReponseDto examenReponseDto=new ExamenReponseDto();
        try{
            examenReponseDto =examMapper.map(examRepository.save(examMapper.map(requestDto)));
            examenReponseDto.setConfirmation(true);
        }catch (Exception e){
            examenReponseDto.setConfirmation(false);
        }
        return examenReponseDto;
    }
}
