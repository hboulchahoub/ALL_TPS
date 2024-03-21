package ma.gov.licence.pfe.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "T_PATIENT")
@Getter
@Setter
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String adresse;

}
