package tn.ey.dev.kaddemproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE) // n'est pas autorisé la modification sur l'id
    private int idContrat;
    private LocalDate dateDebutContrat;

    private LocalDate dateFinContrat;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private boolean archive;
    private int montantContrat;

    @JsonIgnore
    @ManyToOne
    Etudiant etudiant;


}
