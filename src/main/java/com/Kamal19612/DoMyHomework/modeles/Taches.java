package com.Kamal19612.DoMyHomework.modeles;

import com.Kamal19612.DoMyHomework.enums.CategorieTache;
import com.Kamal19612.DoMyHomework.enums.PrioriteTache;
import com.Kamal19612.DoMyHomework.enums.StatutTache;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name="Taches")
public class Taches {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTache;

    private String titre;

    private String description;

    private LocalDate dateCreation;

    private LocalDate dateDebut;

    private LocalDate dateEcheance;

    @Enumerated(EnumType.STRING)
    private StatutTache statut;

    @Enumerated(EnumType.STRING)
    private PrioriteTache priorite;

    @Enumerated(EnumType.STRING)
    private CategorieTache categorie;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "id_user")
    private Users user;
}
