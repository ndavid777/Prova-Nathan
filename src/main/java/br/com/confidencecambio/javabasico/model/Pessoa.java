package br.com.confidencecambio.javabasico.model;


public class Pessoa {

    private long Altura;
    private long Peso;
    private long Imc;

    public long getPeso() {
        return Peso;
    }

    public void setPeso(long peso) {
        Peso = peso;
    }

    public long getAltura() {
        return Altura;
    }

    public void setAltura(long altura) {
        Altura = altura;
    }

    public long getImc() {
        return Imc;
    }

    public void setImc(long imc) {
        Imc = imc;
    }
}
