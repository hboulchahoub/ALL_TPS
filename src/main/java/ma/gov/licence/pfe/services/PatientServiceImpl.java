package ma.gov.licence.pfe.services;

import ma.gov.licence.pfe.dtos.PatientDto;
import ma.gov.licence.pfe.mappers.PatientMapper;
import ma.gov.licence.pfe.repositories.PatientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements IPatientService {
    private final Logger LOGGER = LoggerFactory.getLogger(PatientServiceImpl.class);
    @Autowired // PatientRepository doit etre annoté @Repository
    private PatientRepository repository;
    @Autowired // PatientMapper doit etre annoté par @Component
    private PatientMapper mapper;

    @Override
    public boolean checkCreatePatient(PatientDto patientDto) {
        LOGGER.debug(" service checkCreatePatient {}", patientDto);
        LOGGER.debug(" repository attribute : {} ", repository);
        LOGGER.debug(" mapper attribute : {} ", mapper);
        if ("CASA".equals(patientDto.getAdresse())) {
            repository.save(mapper.dtoToEntity(patientDto));
            return true;
        }
        return false;
    }
}
