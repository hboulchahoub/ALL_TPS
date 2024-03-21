package ma.gov.licence.pfe.mappers;

import ma.gov.licence.pfe.dtos.ConsultationRequestDto;
import ma.gov.licence.pfe.dtos.ConsultationResponseDto;
import ma.gov.licence.pfe.entities.ConsultationEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ConsultationMapper {
    ConsultationEntity map(ConsultationRequestDto dto);
    ConsultationResponseDto map(ConsultationEntity dto);
    List<ConsultationResponseDto> map(List<ConsultationEntity> dto);
}
