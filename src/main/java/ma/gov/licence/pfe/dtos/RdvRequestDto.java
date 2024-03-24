package ma.gov.licence.pfe.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RdvRequestDto {
    private Long id;
    private String dateRdv;
    private String heureRdv;
    private String adress;
}
