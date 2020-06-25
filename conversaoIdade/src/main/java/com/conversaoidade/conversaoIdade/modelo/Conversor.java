package com.conversaoidade.conversaoIdade.modelo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Conversor {
    @Getter
    @Setter
    private int idade;

    public int conversorDias(){
        return idade*365;
    }
    public int conversorSemanas(){
        return idade*52;
    }
    public int conversorMeses(){
        return idade*12;
    }
}
