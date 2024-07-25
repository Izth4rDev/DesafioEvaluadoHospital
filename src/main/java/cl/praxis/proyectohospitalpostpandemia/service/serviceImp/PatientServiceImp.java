package cl.praxis.proyectohospitalpostpandemia.service.serviceImp;
import cl.praxis.proyectohospitalpostpandemia.entity.Patient;
import cl.praxis.proyectohospitalpostpandemia.repository.IPatient;
import cl.praxis.proyectohospitalpostpandemia.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientServiceImp implements IPatientService {

    @Autowired
    private IPatient iPatient;

    @Override
    public List<Patient> getAllPatients() {
        return iPatient.findAll();
    }
}
