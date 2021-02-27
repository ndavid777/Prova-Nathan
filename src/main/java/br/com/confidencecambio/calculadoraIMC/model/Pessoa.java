package br.com.confidencecambio.calculadoraIMC.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Repository;

@Repository
public class Pessoa {

    @JsonProperty("altura")
    private double altura;
    @JsonProperty("peso")
    private double peso;
/*
    public Pessoa(double altura, double peso)
    { this.altura = altura;
    this.peso = peso;}


 */
    private double imc;

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularIMC(double peso, double altura)
    {
    return imc = peso/Math.pow(altura,2);
    }
}
