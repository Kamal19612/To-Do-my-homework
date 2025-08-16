package com.Kamal19612.DoMyHomework.services;

import com.Kamal19612.DoMyHomework.enums.StatutTache;
import com.Kamal19612.DoMyHomework.modeles.Taches;

import java.util.List;

public interface TachesServices {

    public Taches creerTache(Taches t);

    public List<Taches> listerTaches();

    public Object trouverTacheParId(Long id);

    public Taches mettreAJourTache(Long id, Taches nouvelleTache);

    public String supprimerTache(Long id);

    // public Taches changerStatut(Long id, StatutTache nouveauStatut);
}
