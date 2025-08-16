package com.Kamal19612.DoMyHomework.controller;

import com.Kamal19612.DoMyHomework.modeles.Taches;
import com.Kamal19612.DoMyHomework.services.TachesServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/API")
@AllArgsConstructor
public class TachesController {

    private final TachesServices tachesServices;

    @PostMapping("/create")
    public Taches create(@RequestBody Taches tache){
        return tachesServices.creerTache(tache);
    }


    @GetMapping()

    /*
    @PutMapping()

    @DeleteMapping()

     */
}
