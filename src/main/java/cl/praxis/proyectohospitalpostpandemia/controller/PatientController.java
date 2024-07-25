package cl.praxis.proyectohospitalpostpandemia.controller;
import cl.praxis.proyectohospitalpostpandemia.service.serviceImp.PatientServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatientController {
    public static final Logger LOG = LoggerFactory.getLogger(PatientController.class);

    @Autowired
    private PatientServiceImp patientServiceImp;

    @GetMapping("/")
    public String obtainPatient(Model model){
        model.addAttribute("patients", patientServiceImp.getAllPatients());
        LOG.info("Pacientes obtenidos");
        return "index";
    }
}
