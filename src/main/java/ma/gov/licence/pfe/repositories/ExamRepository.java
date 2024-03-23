package ma.gov.licence.pfe.repositories;

import ma.gov.licence.pfe.entities.ExamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<ExamEntity,Long> {

}
