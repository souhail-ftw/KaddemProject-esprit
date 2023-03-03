package tn.ey.dev.kaddemproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.ey.dev.kaddemproject.entities.Etudiant;
import tn.ey.dev.kaddemproject.repositories.EquipeRepository;
import tn.ey.dev.kaddemproject.repositories.EtudiantRepository;
import tn.ey.dev.kaddemproject.services.IEtudiantServiceImp;
import tn.ey.dev.kaddemproject.services.IEtudiantServices;

import java.util.List;

@RestController
@RequestMapping("etudiant")
@RequiredArgsConstructor
public class EtudiantController {

    IEtudiantServices iEtudiantServices;
    private final EquipeRepository equipeRepository;
    private final EtudiantRepository etudiantRepository;

    @GetMapping("sayhello")
    public String sayHello(){
        return "hello";
    }
    @GetMapping()
    public List<Etudiant> getAll(){
        return iEtudiantServices.getAllEtudiant();
    }
    @GetMapping("{id}")
    public Etudiant getById(@PathVariable int id){
        return iEtudiantServices.getByIdEtudiant(id);
    }
    @PostMapping()
    public void ajouterEtudiant(@RequestBody Etudiant e){
        iEtudiantServices.ajouterEtudiant(e);
    }

    @PutMapping("{etudiantId}/{departementId}")
    public void assignEtudiantToDepartement(@PathVariable Integer etudiantId, @PathVariable Integer departementId) {
        iEtudiantServices.assignEtudiantToDepartement(etudiantId,departementId);
    }
    @PostMapping("{idContrat}/{idEquipe}")
    public Etudiant addAndAssignEtudiantToEquipeAndContract(@RequestBody Etudiant e, @PathVariable Integer idContrat, @PathVariable Integer idEquipe) {
        return  iEtudiantServices.addAndAssignEtudiantToEquipeAndContract(e,idContrat,idContrat);
    }

}