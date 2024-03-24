package ma.gov.licence.pfe.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import ma.gov.licence.pfe.dtos.HopitalDto;
import ma.gov.licence.pfe.entities.HopitalEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-24T13:23:38+0000",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@Component
public class HopitalMapperImpl implements HopitalMapper {

    @Override
    public HopitalEntity dtoToEntity(HopitalDto dto) {
        if ( dto == null ) {
            return null;
        }

        HopitalEntity hopitalEntity = new HopitalEntity();

        hopitalEntity.setId( dto.getId() );
        hopitalEntity.setCode( dto.getCode() );
        hopitalEntity.setLabel( dto.getLabel() );
        hopitalEntity.setCapacity( dto.getCapacity() );

        return hopitalEntity;
    }

    @Override
    public HopitalDto entityToDto(HopitalEntity entity) {
        if ( entity == null ) {
            return null;
        }

        HopitalDto hopitalDto = new HopitalDto();

        hopitalDto.setId( entity.getId() );
        hopitalDto.setCode( entity.getCode() );
        hopitalDto.setLabel( entity.getLabel() );
        hopitalDto.setCapacity( entity.getCapacity() );

        return hopitalDto;
    }

    @Override
    public List<HopitalEntity> dtosToEntities(List<HopitalDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<HopitalEntity> list = new ArrayList<HopitalEntity>( dtos.size() );
        for ( HopitalDto hopitalDto : dtos ) {
            list.add( dtoToEntity( hopitalDto ) );
        }

        return list;
    }

    @Override
    public List<HopitalDto> entitiesToDtos(List<HopitalEntity> entity) {
        if ( entity == null ) {
            return null;
        }

        List<HopitalDto> list = new ArrayList<HopitalDto>( entity.size() );
        for ( HopitalEntity hopitalEntity : entity ) {
            list.add( entityToDto( hopitalEntity ) );
        }

        return list;
    }
}
