package tn.ey.dev.kaddemproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idEquipe;
    String nomEquipe;
    @Enumerated(EnumType.STRING)
    Niveau niveau;
    @OneToOne(mappedBy = "equipe")
    DetailEquipe detailEquipe;
    @JsonIgnore
    @ManyToMany
    List<Etudiant> etudiants;
}
