package com.Kamal19612.DoMyHomework.services;

import com.Kamal19612.DoMyHomework.enums.StatutTache;
import com.Kamal19612.DoMyHomework.modeles.Taches;

import java.util.List;

public interface TachesServices {

    Taches creerTache(Taches t, Long utilisateurId);

    List<Taches> listerTaches();

    List<Taches> listerTachesParUtilisateur(Long utilisateurId);

    Taches trouverTacheParId(Long id);

    Taches mettreAJourTache(Long id, Taches nouvelleTache);

    void supprimerTache(Long id);

    Taches changerStatut(Long id, StatutTache nouveauStatut);
}
