package ma.gov.licence.pfe.services;

import ma.gov.licence.pfe.dtos.RdvRequestDto;
import ma.gov.licence.pfe.dtos.RdvResponseDto;

import java.util.List;

public interface IRdvService {
    RdvResponseDto create(RdvRequestDto requestDto);
    RdvResponseDto update(RdvRequestDto requestDto);
    void delete(Long id);
    List<RdvResponseDto> findAll();
}
