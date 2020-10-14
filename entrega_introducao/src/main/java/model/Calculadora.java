package model;

import org.json.JSONObject;

public class Calculadora {

    //Método para calcular a porcentagem de um valor total
    public double parametroPorcentagem(String json){
        JSONObject percent = new JSONObject(json);
        double valorTotal = percent.getDouble("valorTotal");
        double porcentagem = percent.getDouble("porcentagem");
        return (valorTotal * porcentagem) / 100;
    }

    //Método para calcular a porcentagem correspondente de um valor final sobre um valor total
    public double parametroValorFinal(String json) {
        JSONObject total = new JSONObject(json);
        double resultado = total.getDouble("resultado");
        double valorTotal = total.getDouble("valorTotal");
        return (resultado * 100) / valorTotal;
    }
}