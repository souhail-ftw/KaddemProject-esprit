package tn.ey.dev.kaddemproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.ey.dev.kaddemproject.entities.Departement;
import tn.ey.dev.kaddemproject.entities.Etudiant;
import tn.ey.dev.kaddemproject.entities.Universite;
import tn.ey.dev.kaddemproject.repositories.DepartementRepository;
import tn.ey.dev.kaddemproject.repositories.UniversiteRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IUniversiteServicesImp implements IUniversiteServices{
    //injection
    private UniversiteRepository universiteRepository;
    private DepartementRepository departementRepository;
    @Override
    public void ajoutUniversite(Universite u) {
        universiteRepository.save(u);
    }

    @Override
    public void updateUniversite(Universite u) {
        universiteRepository.save(u);
    }

    @Override
    public List<Universite> getAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite getByIdUniversite(Integer id) {
        return universiteRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUniversite(Integer id) {
        universiteRepository.deleteById(id);
    }

    @Override
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
        // recuperation des objets
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        Departement departement = departementRepository.findById(idDepartement).orElse(null);

        // verification des objets
        if (universite != null && departement != null) {
            // traitement
            // affection d'universite dans le departement
            universite.getDepartement().add(departement);

            universiteRepository.save(universite);
        }
    }
}
