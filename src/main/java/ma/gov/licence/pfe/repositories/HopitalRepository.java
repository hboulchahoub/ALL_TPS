package ma.gov.licence.pfe.repositories;


import ma.gov.licence.pfe.entities.HopitalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HopitalRepository extends JpaRepository<HopitalEntity,Long> {
}
