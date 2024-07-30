package cl.praxis.proyectohospitalpostpandemia.service;
import cl.praxis.proyectohospitalpostpandemia.entity.Patient;
import java.util.List;
import java.util.Optional;

public interface IPatientService {
    List<Patient> getAllPatients();
    Optional<Patient> findPatientById(Long id);
    Patient savePatient(Patient patient);
     void deletePatient(Long id);
}
