package br.com.confidencecambio.calculadoraIMC.service;

import br.com.confidencecambio.calculadoraIMC.model.IPessoa;
import br.com.confidencecambio.calculadoraIMC.model.Pessoa;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Optional;

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
