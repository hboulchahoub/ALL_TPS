package ma.gov.licence.pfe.services;

import ma.gov.licence.pfe.dtos.ConsultationRequestDto;
import ma.gov.licence.pfe.dtos.ConsultationResponseDto;

import java.util.List;

public interface ConsultationService {
    ConsultationResponseDto create(ConsultationRequestDto requestDto);
    ConsultationResponseDto update(ConsultationRequestDto requestDto);
    void delete(Long id);
    List<ConsultationResponseDto> selectAll();
}
