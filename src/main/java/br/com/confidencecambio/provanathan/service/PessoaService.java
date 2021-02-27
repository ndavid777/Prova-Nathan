package br.com.confidencecambio.provanathan.service;

import br.com.confidencecambio.provanathan.model.IPessoa;
import br.com.confidencecambio.provanathan.model.Pessoa;
import org.springframework.stereotype.Component;

@Component
public class PessoaService implements IPessoa {

    private static Pessoa pessoa;


    @Override
    public void registraPessoa(Pessoa pessoa) {
       if (validaPessoa(pessoa))
            PessoaService.pessoa = pessoa;
    }

    @Override
    public boolean validaPessoa(Pessoa pessoa){
        if(pessoa.getPeso() >=1 && pessoa.getAltura() >=1)
        {
          pessoa.calcularIMC(pessoa.getPeso(), pessoa.getAltura());
          return true;
        }
        else {
            throw new IllegalArgumentException("Apenas números positivos");
        }

    }


}
