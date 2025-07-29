package com.Kamal19612.DoMyHomework.services;

import com.Kamal19612.DoMyHomework.enums.StatutTache;
import com.Kamal19612.DoMyHomework.modeles.Taches;

import java.util.List;

public class TachesImplService implements TachesServices{

    @Override
    public Taches creerTache(Taches t, Long utilisateurId) {
        return null;
    }

    @Override
    public List<Taches> listerTaches() {
        return List.of();
    }

    @Override
    public List<Taches> listerTachesParUtilisateur(Long utilisateurId) {
        return List.of();
    }

    @Override
    public Taches trouverTacheParId(Long id) {
        return null;
    }

    @Override
    public Taches mettreAJourTache(Long id, Taches nouvelleTache) {
        return null;
    }

    @Override
    public void supprimerTache(Long id) {

    }

    @Override
    public Taches changerStatut(Long id, StatutTache nouveauStatut) {
        return null;
    }
}
