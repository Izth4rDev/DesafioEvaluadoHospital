package cl.praxis.proyectohospitalpostpandemia.service.serviceImp;
import cl.praxis.proyectohospitalpostpandemia.entity.Patient;
import cl.praxis.proyectohospitalpostpandemia.repository.IPatient;
import cl.praxis.proyectohospitalpostpandemia.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImp implements IPatientService {

    @Autowired
    private IPatient iPatient;

    @Override
    public List<Patient> getAllPatients() {
        return iPatient.findAll();
    }
    @Override
    public Optional<Patient> findPatientById(Long id) {
        return iPatient.findById(id);
    }
    @Override
    public Patient savePatient(Patient patient) {
        return iPatient.save(patient);
    }
    @Override
    public void deletePatient(Long id) {
        iPatient.deleteById(id);
    }
}
