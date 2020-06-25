package com.bruno.silva.Calculadora.modelo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Calculador {

    @Getter @Setter
    private double n1,n2;

    public double somar(){
        return n1+n2;
    }
    public double subtrair(){
        return n1-n2;
    }
    public double dividir(){
        return n1/n2;
    }
    public double multiplicar(){
        return n1*n2;
    }
}
