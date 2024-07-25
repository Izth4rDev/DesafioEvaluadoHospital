package cl.praxis.proyectohospitalpostpandemia.repository;
import cl.praxis.proyectohospitalpostpandemia.entity.Diagnosis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDiagnosis extends JpaRepository<Diagnosis,Long>{
}
