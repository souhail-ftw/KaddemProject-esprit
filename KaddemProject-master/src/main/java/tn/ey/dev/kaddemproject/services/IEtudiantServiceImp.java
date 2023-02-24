package tn.ey.dev.kaddemproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.ey.dev.kaddemproject.entities.Departement;
import tn.ey.dev.kaddemproject.entities.Etudiant;
import tn.ey.dev.kaddemproject.repositories.DepartementRepository;
import tn.ey.dev.kaddemproject.repositories.EtudiantRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IEtudiantServiceImp implements IEtudiantServices{
    //injection
    private EtudiantRepository etudiantRepository;

    private final DepartementRepository departementRepository;

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
            // traitement
            // affection d'etudiant dans le departement par etudiant ki tabda mapped by fel etudiant
            etudiant.setDepartement(departement);
            // ou affection d'etudiant dans le departement par departement
          // departement.getEtudiants().add(etudiant);
           //departementRepository.save(departement);
            etudiantRepository.save(etudiant);

        }

    }
}
