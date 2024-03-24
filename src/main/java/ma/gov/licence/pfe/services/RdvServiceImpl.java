package ma.gov.licence.pfe.services;

import ma.gov.licence.pfe.dtos.RdvRequestDto;
import ma.gov.licence.pfe.dtos.RdvResponseDto;
import ma.gov.licence.pfe.mappers.RdvMapper;
import ma.gov.licence.pfe.repositories.RdvRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RdvServiceImpl implements IRdvService {


    private final RdvRepository rdvRepository;
    private final RdvMapper mapper;

    public RdvServiceImpl(RdvRepository rdvRepository, RdvMapper mapper) {
        System.out.println("INSTANCIATION SERVICE ...");
        this.rdvRepository = rdvRepository;
        this.mapper = mapper;
    }

    @Override
    public RdvResponseDto create(RdvRequestDto requestDto) {
        RdvResponseDto responseDto = new RdvResponseDto();
        try {
            responseDto = mapper.map(rdvRepository.save(mapper.map(requestDto)));
            responseDto.setConfirmation("SUCESS");
            responseDto.setCreatedAt("" + LocalDateTime.now());

        } catch (Exception e) {
            responseDto.setConfirmation("ERROR CREATION");
        }

        return responseDto;
    }

    @Override
    public RdvResponseDto update(RdvRequestDto requestDto) {
        return mapper.map(rdvRepository.save(mapper.map(requestDto)));
    }

    @Override
    public void delete(Long id) {
        rdvRepository.deleteById(id);
    }

    @Override
    public List<RdvResponseDto> findAll() {
        return mapper.toDtos(rdvRepository.findAll());
    }
}
