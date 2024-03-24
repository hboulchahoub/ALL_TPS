package ma.gov.licence.pfe.mappers;

import javax.annotation.Generated;
import ma.gov.licence.pfe.dtos.PatientDto;
import ma.gov.licence.pfe.entities.PatientEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-24T13:23:38+0000",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@Component
public class PatientMapperImpl implements PatientMapper {

    @Override
    public PatientEntity dtoToEntity(PatientDto dto) {
        if ( dto == null ) {
            return null;
        }

        PatientEntity patientEntity = new PatientEntity();

        patientEntity.setId( dto.getId() );
        patientEntity.setName( dto.getName() );
        patientEntity.setAdresse( dto.getAdresse() );

        return patientEntity;
    }
}
