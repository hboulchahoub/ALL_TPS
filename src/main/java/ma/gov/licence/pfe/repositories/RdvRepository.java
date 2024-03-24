package ma.gov.licence.pfe.repositories;

import ma.gov.licence.pfe.entities.RdvEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RdvRepository extends JpaRepository<RdvEntity, Long> {
}
