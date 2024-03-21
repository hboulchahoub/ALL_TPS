package ma.gov.licence.pfe.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class ConsultationResponseDto {
    private String description;
    private Double temps;
    private Long code;
    private String createdAt;
}
