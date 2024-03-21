package ma.gov.licence.pfe.services;

import lombok.extern.slf4j.Slf4j;
import ma.gov.licence.pfe.dtos.ConsultationRequestDto;
import ma.gov.licence.pfe.dtos.ConsultationResponseDto;
import ma.gov.licence.pfe.entities.ConsultationEntity;
import ma.gov.licence.pfe.mappers.ConsultationMapper;
import ma.gov.licence.pfe.repositories.ConsultationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ConsultationServiceImpl implements ConsultationService {

    private final ConsultationRepository repository;
    private final ConsultationMapper mapper;

    public ConsultationServiceImpl(
            ConsultationRepository repository,
            ConsultationMapper mapper) {
        this.repository = repository;
        this.mapper=mapper;
    }

    @Override
    public ConsultationResponseDto create(ConsultationRequestDto requestDto) {
        log.debug(" request ConsultationRequestDto {} ",requestDto);
        return mapper.map(repository.save(mapper.map(requestDto)));
    }

    @Override
    public ConsultationResponseDto update(ConsultationRequestDto requestDto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<ConsultationResponseDto> selectAll() {
        return null;
    }
}
