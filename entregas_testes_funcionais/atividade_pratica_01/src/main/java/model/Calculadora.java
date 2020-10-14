package model;

import org.json.JSONObject;

public class Calculadora {

    //Método para calcular a porcentagem de um valor total
    public double parametroPorcentagem(String json){
        JSONObject percent = new JSONObject(json);
        double valorTotal = percent.getDouble("valorTotal");
        double porcentagem = percent.getDouble("porcentagem");
        if(porcentagem >= 0 && porcentagem <= 100) return (valorTotal * porcentagem) / 100;
        else return 0;
    }
}