package com.Kamal19612.DoMyHomework.services;

import com.Kamal19612.DoMyHomework.modeles.Users;

import java.util.List;

public interface UsersServices {

    void connecter(Users nom, Users prenom, Users motDePasse);

    Users creerUser(Users user);

    List<Users> listerUsers();

    Users trouverUserParID(Long idUser);

    void mettreAJourUser(Long id, Users user);

    void suprimerUnUser(Long idUser);

    String authentifier(String eMail, String motDePasse);

}
