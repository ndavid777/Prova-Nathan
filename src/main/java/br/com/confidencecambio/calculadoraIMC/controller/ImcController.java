package br.com.confidencecambio.calculadoraIMC.controller;

import br.com.confidencecambio.calculadoraIMC.model.Pessoa;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.DecimalFormat;

@RestController
@RequestMapping("/imc")
public class ImcController {
    private Pessoa pessoa;

    private ImcController(Pessoa pessoa)
    {
        this.pessoa = pessoa;
    }


    @RequestMapping(value = "/calcular", method = RequestMethod.GET)
    public ResponseEntity<String> calcularIMC(@RequestBody final Pessoa body){
        final var imc = pessoa.calcularIMC(body.getPeso(),body.getAltura());
        DecimalFormat df = new DecimalFormat("#.##");

        var retorno = "O IMC é: "+ df.format(imc);
        return new ResponseEntity<>(retorno, HttpStatus.OK);
    }

}
