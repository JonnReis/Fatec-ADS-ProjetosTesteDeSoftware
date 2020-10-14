package atividade_pratica_01;

import model.Calculadora;
import org.json.JSONObject;

public class App {
    public static void main(String[] args) {

        //Instância JSONObject para utilização da biblioteca json
        JSONObject jo = new JSONObject();
        jo.put("valorTotal", "100");
        jo.put("porcentagem", "120");
        System.out.println(jo.toString());

        //Istância da interface calculadora
        Calculadora c = new Calculadora();

        //Emprego do método para calcular a porcentagem sobre um valor total
        double resultado1 = c.parametroPorcentagem(jo.toString());
        JSONObject jo3 = new JSONObject();
        jo3.put("resultado", resultado1);
        System.out.println(jo3.toString());
    }
}