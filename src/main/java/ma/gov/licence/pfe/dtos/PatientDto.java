package ma.gov.licence.pfe.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PatientDto {
    private Long id;
    private String name;
    private String adresse;
}
