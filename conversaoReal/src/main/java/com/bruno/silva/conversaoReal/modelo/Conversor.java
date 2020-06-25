package com.bruno.silva.conversaoReal.modelo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Conversor {
    @Getter @Setter
    private double real;

    public double conversorDolar(){
        return real/5.15;
    }

    public double conversorEuro(){
        return real/5.83;
    }
}
