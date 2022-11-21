package com.consumindocep.app;

import com.google.gson.Gson;
import org.springframework.context.annotation.Configuration;

@Configuration // Em algumas versão não será necessário colocar o configuration
public class Beans {
    public Gson gson(){
        return new Gson();
    }
}
