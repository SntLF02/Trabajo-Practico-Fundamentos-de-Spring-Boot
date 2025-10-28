package com.miempresa.tutorial.mi_primer_spring_boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String hello() {

        logger.trace("Este es un mensaje de trace");
        logger.debug("Ingresando al endpoint //hello, debug");
        logger.info("Devolviendo un mensaje de saludo. info");
        logger.warn("Este es un mensaje de warn");
        logger.error("Este es un mensaje de Error");

        return "Hola, Spring Boot autoconfigurado!";
    }
}
