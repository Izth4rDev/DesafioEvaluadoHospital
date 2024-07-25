package cl.praxis.proyectohospitalpostpandemia.repository;
import cl.praxis.proyectohospitalpostpandemia.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPatient extends JpaRepository<Patient, Long> {
}
