package ma.gov.licence.pfe.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import ma.gov.licence.pfe.dtos.ConsultationRequestDto;
import ma.gov.licence.pfe.dtos.ConsultationResponseDto;
import ma.gov.licence.pfe.entities.ConsultationEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-17T12:02:55+0000",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@Component
public class ConsultationMapperImpl implements ConsultationMapper {

    @Override
    public ConsultationEntity map(ConsultationRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        ConsultationEntity consultationEntity = new ConsultationEntity();

        consultationEntity.setDescription( dto.getDescription() );
        consultationEntity.setTemps( dto.getTemps() );

        return consultationEntity;
    }

    @Override
    public ConsultationResponseDto map(ConsultationEntity dto) {
        if ( dto == null ) {
            return null;
        }

        ConsultationResponseDto consultationResponseDto = new ConsultationResponseDto();

        consultationResponseDto.setDescription( dto.getDescription() );
        consultationResponseDto.setTemps( dto.getTemps() );
        consultationResponseDto.setCode( dto.getCode() );
        consultationResponseDto.setCreatedAt( dto.getCreatedAt() );

        return consultationResponseDto;
    }

    @Override
    public List<ConsultationResponseDto> map(List<ConsultationEntity> dto) {
        if ( dto == null ) {
            return null;
        }

        List<ConsultationResponseDto> list = new ArrayList<ConsultationResponseDto>( dto.size() );
        for ( ConsultationEntity consultationEntity : dto ) {
            list.add( map( consultationEntity ) );
        }

        return list;
    }
}
