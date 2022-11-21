package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component //Informa que os seus objetos serão Beans
public class MyApp implements CommandLineRunner {
    @Autowired // Fizemos a injecção de independencia
    private Calculadora calculadora; // por conversão do Spring usamos deste jeito
    @Override
    public void run(String... args) throws Exception {
        System.out.println("O resultado da calculadora é: " + calculadora.soma(4,5));
    }
}
