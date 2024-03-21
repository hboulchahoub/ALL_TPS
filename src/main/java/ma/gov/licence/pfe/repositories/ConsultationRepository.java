package ma.gov.licence.pfe.repositories;

import ma.gov.licence.pfe.entities.ConsultationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsultationRepository extends JpaRepository<ConsultationEntity,Long> {

    List<ConsultationEntity> findByTemps (Double temps);

}
