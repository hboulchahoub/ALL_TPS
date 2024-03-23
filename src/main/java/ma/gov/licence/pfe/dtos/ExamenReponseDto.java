package ma.gov.licence.pfe.dtos;

import lombok.Data;

@Data
public class ExamenReponseDto {
    private Long id;
    private String label;
    private Boolean confirmation;
    private String createdAt;
}
