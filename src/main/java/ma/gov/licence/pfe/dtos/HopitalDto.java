package ma.gov.licence.pfe.dtos;

import lombok.Data;

@Data
public class HopitalDto {
    private Long id;
    private String code;
    private String label;
    private int capacity;
}
