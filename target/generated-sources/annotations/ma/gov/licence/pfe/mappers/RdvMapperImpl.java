package ma.gov.licence.pfe.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import ma.gov.licence.pfe.dtos.RdvRequestDto;
import ma.gov.licence.pfe.dtos.RdvResponseDto;
import ma.gov.licence.pfe.entities.RdvEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-24T13:23:38+0000",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@Component
public class RdvMapperImpl implements RdvMapper {

    @Override
    public RdvEntity map(RdvRequestDto requestDto) {
        if ( requestDto == null ) {
            return null;
        }

        RdvEntity rdvEntity = new RdvEntity();

        rdvEntity.setId( requestDto.getId() );
        rdvEntity.setDateRdv( requestDto.getDateRdv() );
        rdvEntity.setHeureRdv( requestDto.getHeureRdv() );
        rdvEntity.setAdress( requestDto.getAdress() );

        return rdvEntity;
    }

    @Override
    public RdvResponseDto map(RdvEntity entity) {
        if ( entity == null ) {
            return null;
        }

        RdvResponseDto rdvResponseDto = new RdvResponseDto();

        rdvResponseDto.setId( entity.getId() );

        return rdvResponseDto;
    }

    @Override
    public List<RdvEntity> toEntities(List<RdvRequestDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<RdvEntity> list = new ArrayList<RdvEntity>( dtos.size() );
        for ( RdvRequestDto rdvRequestDto : dtos ) {
            list.add( map( rdvRequestDto ) );
        }

        return list;
    }

    @Override
    public List<RdvResponseDto> toDtos(List<RdvEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<RdvResponseDto> list = new ArrayList<RdvResponseDto>( entities.size() );
        for ( RdvEntity rdvEntity : entities ) {
            list.add( map( rdvEntity ) );
        }

        return list;
    }
}
