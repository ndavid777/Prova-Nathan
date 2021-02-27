package br.com.confidencecambio.provanathan.model;


public class Cliente extends EntidadeComNome implements IValidaNome{

    public Cliente(String nome) {
        super(nome.trim());
    }

    @Override
    public String getNome() {
        return super.getNome();
    }



    @Override
    public String pegarPrimeiroNome(){
        String primeiroNome = super.getNome().split(" ")[0];
        return primeiroNome;
    }

    @Override
    public String pegarUltimoNome() {
        int quantidadeNome = super.getNome().split(" ").length;
        String sobrenome = super.getNome().split(" ")[quantidadeNome-1];
        return sobrenome;
    }

    @Override
    public String nomeEmLetrasMaiusculas() {
        var nomeMaiusculo =super.getNome().toUpperCase();
        return nomeMaiusculo;
    }

    @Override
    public String abreviarNome() {
        var nomeDoMeio = "";
        var nomes = super.getNome().split(" ");
        for (int i = 1; i < super.getNome().split(" ").length -1;i++)
        {
            if (!nomes[i].matches("[Dd](?:[ao]s?|e)"))
            {
                nomeDoMeio += nomes[i].charAt(0) + ". ";
        }
        else
            {
                nomeDoMeio+= nomes[i]+" ";
            }
        }
        var nomeAbreviado = pegarPrimeiroNome()+" "+nomeDoMeio+pegarUltimoNome();
        return nomeAbreviado;
    }
}