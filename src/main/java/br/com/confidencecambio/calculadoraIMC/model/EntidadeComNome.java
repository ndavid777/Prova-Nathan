package br.com.confidencecambio.calculadoraIMC.model;

public class EntidadeComNome {
    private String nome;

    public EntidadeComNome(String nome)
    {
        validaNome(nome);
        this.nome = nome;
    }


    public String validaNome(String nome) {
        if (nome == null || nome.isEmpty() || nome.isBlank())
        {
            throw new NullPointerException("O nome não pode estar vazio.");
        }
        else
        {
            return nome;
        }
    }
    public String getNome()
    {
        return nome;
    }

}
