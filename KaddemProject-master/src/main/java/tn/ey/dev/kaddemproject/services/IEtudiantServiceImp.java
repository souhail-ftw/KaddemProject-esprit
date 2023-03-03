package tn.ey.dev.kaddemproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.ey.dev.kaddemproject.entities.Contrat;
import tn.ey.dev.kaddemproject.entities.Departement;
import tn.ey.dev.kaddemproject.entities.Equipe;
import tn.ey.dev.kaddemproject.entities.Etudiant;
import tn.ey.dev.kaddemproject.repositories.ContratRepository;
import tn.ey.dev.kaddemproject.repositories.DepartementRepository;
import tn.ey.dev.kaddemproject.repositories.EquipeRepository;
import tn.ey.dev.kaddemproject.repositories.EtudiantRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IEtudiantServiceImp implements IEtudiantServices{
    //injection
    private EtudiantRepository etudiantRepository;

    private final DepartementRepository departementRepository;
    private final ContratRepository contratRepository;
    private final EquipeRepository equipeRepository;

    @Override
    public void ajouterEtudiant(Etudiant e) {
        etudiantRepository.save(e);
    }

    @Override
    public void updateEtudiant(Etudiant e) {
        etudiantRepository.save(e);
    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant getByIdEtudiant(Integer id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteEtudiant(Integer id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
        // recuperation des objets
        // Etudiant etudiant = this.getByIdEtudiant(etudiantId);
        Etudiant etudiant = etudiantRepository.findById(etudiantId).orElse(null);
        Departement departement = departementRepository.findById(departementId).orElse(null);

        // verification des objets
        if(etudiant != null && departement != null ){

            etudiant.setDepartement(departement);
            etudiantRepository.save(etudiant);

        }

    }

    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {
        // managed entites
        Contrat contrat = contratRepository.findById(idContrat).orElse(null);
        Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
        Assert.notNull(contrat,"universte must not be null");
        Assert.notNull(equipe,"universte must not be null");
        Assert.notNull(e,"universte must not be null");
        contrat.setEtudiant(e);
        equipe.getEtudiants().add(e);
        equipeRepository.saveAndFlush(equipe);

        contratRepository.save(contrat);


        return e;
    }
}