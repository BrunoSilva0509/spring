package com.bruno.silva.conversaoReal.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bruno.silva.conversaoReal.modelo.Conversor;

@RestController
public class ControleConversor {

    @GetMapping("/")
    public String conversao(){
        Conversor con= new Conversor();
        con.setReal(1);

        return "Real convertido para Euro fica £ "+con.conversorEuro()+"   Real convertido para Dolar fica $ "+con.conversorDolar();
    }
}
