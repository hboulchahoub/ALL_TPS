package ma.gov.licence.pfe.dtos;

import lombok.Data;

// Champs que j'aurai dans le formulaire HTML
@Data
public class ExamenRequestDto {
    private Long id;
    private String label;
    private Double duree;
    private String Date;
}
