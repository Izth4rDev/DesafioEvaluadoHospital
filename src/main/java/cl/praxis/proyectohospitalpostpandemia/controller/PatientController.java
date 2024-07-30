package cl.praxis.proyectohospitalpostpandemia.controller;
import cl.praxis.proyectohospitalpostpandemia.entity.Patient;
import cl.praxis.proyectohospitalpostpandemia.service.serviceImp.PatientServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

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
    @GetMapping("/patient/edit/{id}")
    public String editPatient(@PathVariable("id") Long id, Model model){
        Optional<Patient> patient = patientServiceImp.findPatientById(id);
        if(patient.isPresent()){
            model.addAttribute("newPatient",patient.get());
            return "editUser";
        }else{
            LOG.error("Paciente con: " +id+  " no encontrado");
            return "redirect:/";
        }
    }
    @PostMapping("/patient/update")
    public String updatePatient(@ModelAttribute("newPatient") Patient patient){
        patientServiceImp.savePatient(patient);
        System.out.println("hola editando");
        LOG.info("paciente editado");
        return "redirect:/";
    }
    @GetMapping("/patient/delete/{id}")
    public String deletePatient(@PathVariable("id") Long id, Model model){
        patientServiceImp.deletePatient(id);
        LOG.info("paciente eliminado");
        return"redirect:/";
    }
}
