package com.miempresa.tutorial.mi_primer_spring_boot;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repository;

    //Inyección por consstructor
    public UserService(UserRepository repository){
        this.repository = repository;
    }

    public String gerUserGreeting(){
        return "Hola, " + repository.findUserName();
    }
}
