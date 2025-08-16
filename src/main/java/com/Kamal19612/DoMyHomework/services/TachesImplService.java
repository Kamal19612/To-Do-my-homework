package com.Kamal19612.DoMyHomework.services;

import com.Kamal19612.DoMyHomework.enums.StatutTache;
import com.Kamal19612.DoMyHomework.modeles.Taches;
import com.Kamal19612.DoMyHomework.repository.TachesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.hibernate.Hibernate.map;

@Service
@AllArgsConstructor
public class TachesImplService implements TachesServices{

    private final TachesRepository tachesRepository;

    @Override
    public Taches creerTache(Taches t) {
        return tachesRepository.save(t);
    }

    @Override
    public List<Taches> listerTaches() {
        return tachesRepository.findAll();
    }

    @Override
    public Object trouverTacheParId(Long id) {
        return tachesRepository.findById(id);
    }

    @Override
    public Taches mettreAJourTache(Long id, Taches nouvelleTache) {
        return tachesRepository.findById(id)
            .map(t ->{
                t.setTitre(nouvelleTache.getTitre());
                t.setDescription(nouvelleTache.getDescription());
                t.setDateCreation(nouvelleTache.getDateCreation());
                t.setDateDebut(nouvelleTache.getDateDebut());
                t.setDateEcheance(nouvelleTache.getDateEcheance());
                t.setDateEcheance(nouvelleTache.getDateEcheance());
                t.setStatut(nouvelleTache.getStatut());
                t.setPriorite(nouvelleTache.getPriorite());
                t.setCategorie(nouvelleTache.getCategorie());
                return tachesRepository.save(t);
            }).orElseThrow(() -> new RuntimeException("la tache n'existe pas"));
    }

    @Override
    public String supprimerTache(Long id) {
        tachesRepository.deleteById(id);
        return "la tache a été supprimé!";
    }

    /*
    @Override
    public Taches changerStatut(Long id, StatutTache nouveauStatut) {
        return null;
    }
     */

}
