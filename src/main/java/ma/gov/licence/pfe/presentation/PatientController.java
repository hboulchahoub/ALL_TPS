package ma.gov.licence.pfe.presentation;

import ma.gov.licence.pfe.dtos.PatientDto;
import ma.gov.licence.pfe.services.IPatientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final Logger LOGGER = LoggerFactory.getLogger(PatientController.class);
    @Autowired
    private IPatientService service;

    @PostMapping
    public PatientDto createPatient(@RequestBody PatientDto patientDto) {
        LOGGER.debug(" request create patient. patientDto : {} ", patientDto);
        LOGGER.debug(" service attribute : {} ", service);
        service.checkCreatePatient(patientDto);
        return patientDto;
    }
}
