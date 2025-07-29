package com.Kamal19612.DoMyHomework.controller;

import com.Kamal19612.DoMyHomework.modeles.Users;
import com.Kamal19612.DoMyHomework.repository.UsersRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    final UsersRepository usersRepository;

    public UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping
    public ResponseEntity<List<Users>> getAllUsers(){
        return new ResponseEntity<>(usersRepository.findAll(), HttpStatus.OK);
    }
}
