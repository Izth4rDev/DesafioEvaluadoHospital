package cl.praxis.proyectohospitalpostpandemia.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_patient", nullable = false, unique = true)
    private int idPatient;
    @Column(name = "patient_name", nullable = false, length = 50)
    private String patientName;
    @Column(name = "patient_lastName", nullable = false, length = 50)
    private String patienLastName;
    @Column(name = "age", nullable = false)
    private int age;
    @Column(name = "address", nullable = false, length = 50)
    private String address;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Diagnosis> diagnoses;
}
