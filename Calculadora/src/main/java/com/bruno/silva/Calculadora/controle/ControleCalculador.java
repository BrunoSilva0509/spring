package com.bruno.silva.Calculadora.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bruno.silva.Calculadora.modelo.Calculador;

@RestController
public class ControleCalculador {

    @GetMapping("/")
    public String calcular(){
        Calculador cal = new Calculador();

        cal.setN1(5);
        cal.setN2(10);

        return "A soma dos dois números equivale a "+cal.somar()+"a subtração entre os dois números equivale a "+cal.subtrair()+
                "a divisão entre os dois números equivale a "+cal.dividir()+"a multiplicação entre os dois números equivale a "+
                cal.multiplicar();
    }
}
