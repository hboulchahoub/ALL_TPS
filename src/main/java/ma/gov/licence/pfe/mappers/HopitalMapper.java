package ma.gov.licence.pfe.mappers;

import ma.gov.licence.pfe.dtos.HopitalDto;
import ma.gov.licence.pfe.entities.HopitalEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface HopitalMapper {
    HopitalEntity dtoToEntity(HopitalDto dto);
    HopitalDto entityToDto(HopitalEntity entity);
    List<HopitalEntity> dtosToEntities(List<HopitalDto> dtos);
    List<HopitalDto> entitiesToDtos(List<HopitalEntity> entity);
}
