package ma.gov.licence.pfe.services;

import ma.gov.licence.pfe.dtos.ExamenReponseDto;
import ma.gov.licence.pfe.dtos.ExamenRequestDto;

public interface IExamService {
    ExamenReponseDto create (ExamenRequestDto requestDto);
}
