package com.miempresa.tutorial.mi_primer_spring_boot;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public String findUserName(){
        return "Santiago López";
    }
}
