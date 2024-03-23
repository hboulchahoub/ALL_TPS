package ma.gov.licence.pfe.mappers;

import ma.gov.licence.pfe.dtos.ExamenReponseDto;
import ma.gov.licence.pfe.dtos.ExamenRequestDto;
import ma.gov.licence.pfe.entities.ExamEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ExamMapper {
    ExamenReponseDto map(ExamEntity entity);
    ExamEntity map(ExamenRequestDto dto);
    List<ExamenReponseDto> toDtos(List<ExamEntity> entities);
    List<ExamEntity> toEntities(List<ExamenRequestDto> dto);
}
