package ma.gov.licence.pfe.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "T_EXAMS")
@Data
public class ExamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String label;
    private String createdAt = "" + LocalDateTime.now();
    private Double duree;
    private String Date;
}
