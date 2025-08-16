package com.Kamal19612.DoMyHomework.controller;

import com.Kamal19612.DoMyHomework.modeles.Taches;
import com.Kamal19612.DoMyHomework.services.TachesServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/API")
@AllArgsConstructor
public class TachesController {

    private final TachesServices tachesServices;

    @PostMapping("/create")
    public Taches create(@RequestBody Taches tache){
        return tachesServices.creerTache(tache);
    }


    @GetMapping("/read")
    public List<Taches> lire(){
        return tachesServices.listerTaches();
    }

    @PutMapping("update/{id}")
    public Taches update(@PathVariable Long id, @RequestBody Taches tache){
        return tachesServices.mettreAJourTache(id, tache);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return tachesServices.supprimerTache(id);

    }

}
