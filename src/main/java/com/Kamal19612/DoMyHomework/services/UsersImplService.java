package com.Kamal19612.DoMyHomework.services;

import com.Kamal19612.DoMyHomework.modeles.Users;

import java.util.List;

public class UsersImplService implements UsersServices{

    @Override
    public void connecter(Users nom, Users prenom, Users motDePasse) {

    }

    @Override
    public Users creerUser(Users user) {
        return null;
    }

    @Override
    public List<Users> listerUsers() {
        return List.of();
    }

    @Override
    public Users trouverUserParID(Long idUser) {
        return null;
    }

    @Override
    public void mettreAJourUser(Long id, Users user) {

    }

    @Override
    public void suprimerUnUser(Long idUser) {

    }

    @Override
    public String authentifier(String eMail, String motDePasse) {
        return "";
    }
}
