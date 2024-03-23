package ma.gov.licence.pfe.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "T_EXAMS")
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@PrimaryKeyJoinColumn
public class ExamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String label;
    private String createdAt = "" + LocalDateTime.now();
    private Double duree;
    private String Date;
}
