package com.rest.config;


import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

//визначає шлях до ресурсів аплікації
@ApplicationPath("resources")
public class JaxRsConfig extends Application {
    {
        System.out.println("GOOD");
    }
}

