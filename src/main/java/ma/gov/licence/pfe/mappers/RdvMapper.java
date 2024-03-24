package ma.gov.licence.pfe.mappers;

import ma.gov.licence.pfe.dtos.RdvRequestDto;
import ma.gov.licence.pfe.dtos.RdvResponseDto;
import ma.gov.licence.pfe.entities.RdvEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface RdvMapper {
    RdvEntity map(RdvRequestDto requestDto);
    RdvResponseDto map(RdvEntity entity);
    List<RdvEntity> toEntities(List<RdvRequestDto> dtos);
    List<RdvResponseDto> toDtos(List<RdvEntity> entities);
}
