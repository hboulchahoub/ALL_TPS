package ma.gov.licence.pfe.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import ma.gov.licence.pfe.dtos.ExamenReponseDto;
import ma.gov.licence.pfe.dtos.ExamenRequestDto;
import ma.gov.licence.pfe.entities.ExamEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-23T11:13:42+0000",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@Component
public class ExamMapperImpl implements ExamMapper {

    @Override
    public ExamenReponseDto map(ExamEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ExamenReponseDto examenReponseDto = new ExamenReponseDto();

        examenReponseDto.setId( entity.getId() );
        examenReponseDto.setLabel( entity.getLabel() );
        examenReponseDto.setCreatedAt( entity.getCreatedAt() );

        return examenReponseDto;
    }

    @Override
    public ExamEntity map(ExamenRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        ExamEntity examEntity = new ExamEntity();

        examEntity.setId( dto.getId() );
        examEntity.setLabel( dto.getLabel() );
        examEntity.setDuree( dto.getDuree() );
        examEntity.setDate( dto.getDate() );

        return examEntity;
    }

    @Override
    public List<ExamenReponseDto> toDtos(List<ExamEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ExamenReponseDto> list = new ArrayList<ExamenReponseDto>( entities.size() );
        for ( ExamEntity examEntity : entities ) {
            list.add( map( examEntity ) );
        }

        return list;
    }

    @Override
    public List<ExamEntity> toEntities(List<ExamenRequestDto> dto) {
        if ( dto == null ) {
            return null;
        }

        List<ExamEntity> list = new ArrayList<ExamEntity>( dto.size() );
        for ( ExamenRequestDto examenRequestDto : dto ) {
            list.add( map( examenRequestDto ) );
        }

        return list;
    }
}
