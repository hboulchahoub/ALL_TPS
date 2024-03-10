package ma.gov.licence.pfe.services;

import ma.gov.licence.pfe.dtos.HopitalDto;
import ma.gov.licence.pfe.mappers.HopitalMapper;
import ma.gov.licence.pfe.repositories.HopitalRepository;
import org.springframework.stereotype.Service;

@Service
public class HopitalServiceImpl implements IHopitalService {

    private final HopitalRepository repository;

    private final HopitalMapper mapper;

    public HopitalServiceImpl(HopitalRepository repository, HopitalMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public HopitalDto create(HopitalDto hopitalDto) {
        return mapper.entityToDto(repository.save(mapper.dtoToEntity(hopitalDto)));
    }
}
