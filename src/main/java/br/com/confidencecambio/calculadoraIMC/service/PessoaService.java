package br.com.confidencecambio.calculadoraIMC.service;

import br.com.confidencecambio.calculadoraIMC.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PessoaService {

    @Autowired
    private Pessoa pessoa;
    
}
