package com.conversaoidade.conversaoIdade.controle;

import com.conversaoidade.conversaoIdade.modelo.Conversor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controleConversor {

    @GetMapping("/")
    public String conversao(){
        Conversor con = new Conversor();
        con.setIdade(2);
        return "Conversão dos anos para Dias: "+con.conversorDias()+"      Conversão dos anos para Semanas: "+con.conversorSemanas()+
                "      Conversão dos anos para Meses: "+con.conversorMeses();
    }

}
