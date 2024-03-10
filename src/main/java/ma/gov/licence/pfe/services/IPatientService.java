package ma.gov.licence.pfe.services;

import ma.gov.licence.pfe.dtos.PatientDto;

public interface IPatientService {
    boolean checkCreatePatient(PatientDto patientDto);
}
