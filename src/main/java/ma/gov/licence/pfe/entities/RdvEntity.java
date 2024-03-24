package ma.gov.licence.pfe.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "T_RDV")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public class RdvEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private Date dateRdv;
    private String heureRdv;
    private String adress;

}
