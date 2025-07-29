package com.Kamal19612.DoMyHomework.modeles;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="Users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUser;

    @Column(length = 15)
    private String nom;

    @Column(length= 20)
    private String prenom;

    @Column(length = 50)
    private String eMail;

    @Column(length = 20)
    private String motDePasse;

    private LocalDate dateInscription;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Taches> taches;
}
