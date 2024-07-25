package cl.praxis.proyectohospitalpostpandemia.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Diagnosis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_diagnosis", nullable = false, unique = true)
    private int id;
    @Column(name = "diagnosis", length = 200)
    private String diagnosis;

    @ManyToOne
    @JoinColumn(name = "id_patient")
    private Patient patient;
}
