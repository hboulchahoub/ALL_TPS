package ma.gov.licence.pfe.entities;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class ExamTechniqueEntity extends ExamEntity {
    private int numLabo;
}
