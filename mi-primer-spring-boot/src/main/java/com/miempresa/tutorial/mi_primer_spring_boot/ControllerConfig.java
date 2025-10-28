package com.miempresa.tutorial.mi_primer_spring_boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerConfig {

    //@Value("${spring.application.name}")
    //private String appName;

    //@Value("${server.port}")
    //private int port;

    private final AppInfoProperties info;

    public ControllerConfig (AppInfoProperties info){
        this.info = info;
    }

    @GetMapping("/config")
    public String showConfig(){
        //return "App: " + " corriendo en puerto " + port;
        return "App: " + info.getNombre() + " v" + info.getVersion();
    }
}
