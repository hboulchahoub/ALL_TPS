package ma.gov.licence.pfe.mappers;

import ma.gov.licence.pfe.dtos.PatientDto;
import ma.gov.licence.pfe.entities.PatientEntity;
import org.mapstruct.Mapper;

@Mapper
public interface PatientMapper {
    PatientEntity dtoToEntity(PatientDto dto);
}
