package com.springboot;

import org.springframework.stereotype.Component;


@Component// Informamos que a calculadora é componente
public class Calculadora {
     public int soma( int num, int num1){
        return num + num1;
    }
}
