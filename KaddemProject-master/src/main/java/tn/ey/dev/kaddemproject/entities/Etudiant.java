package tn.ey.dev.kaddemproject.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;


//@Table( name = "Etudiants")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idEtudaint;

    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option option;
    @ManyToOne
    Departement departement;
    @OneToMany(mappedBy = "etudiant")
    List<Contrat> contrats;
    @ManyToMany(mappedBy = "etudiants")
    List<Equipe> equipes;

}
