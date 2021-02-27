package br.com.confidencecambio.calculadoraIMC.service;


import br.com.confidencecambio.calculadoraIMC.model.Pessoa;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PessoaServiceTest {

@Test
    public void quandoCrioUmaPessoaComDadosCorretos(){

    var pessoa = mock(Pessoa.class);

    var pessoaService = mock(PessoaService.class);
        when(pessoa.getPeso()).thenReturn(75.0);
        when(pessoa.getAltura()).thenReturn(1.68);
        when(pessoaService.validaPessoa(pessoa)).thenCallRealMethod();
        Assert.assertTrue(pessoaService.validaPessoa(pessoa));

    }

    @Test(expected = IllegalArgumentException.class)
    public void quandoCrioUmaPessoaComDadosIncorretosQueroUmaException(){

        var pessoa = mock(Pessoa.class);

        var pessoaService = mock(PessoaService.class);
        when(pessoa.getPeso()).thenReturn(-75.0);
        when(pessoa.getAltura()).thenReturn(-1.68);
        when(pessoaService.validaPessoa(pessoa)).thenCallRealMethod();
        pessoaService.validaPessoa(pessoa);

    }



}