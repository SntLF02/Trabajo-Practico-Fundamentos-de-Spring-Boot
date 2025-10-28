package com.miempresa.tutorial.mi_primer_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MiPrimerSpringBootApplication {

	public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MiPrimerSpringBootApplication.class, args);

        //Obtener el bean de SaludoService
        SaludoService saludo = context.getBean(SaludoService.class);
        System.out.println(saludo.saludar());
	}

}
