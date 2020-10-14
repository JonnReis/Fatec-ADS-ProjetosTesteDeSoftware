package entrega_introducao;

import model.Calculadora;
import org.json.JSONObject;

public class App {
    public static void main(String[] args) {

        //Instância JSONObject para utilização da biblioteca json
        JSONObject jo = new JSONObject();
        jo.put("valorTotal", "100");
        jo.put("porcentagem", "10");
        System.out.println(jo.toString());

        JSONObject jo2 = new JSONObject();
        jo2.put("resultado", "30");
        jo2.put("valorTotal", "100");
        System.out.println(jo2.toString());

        //Istância da interface calculadora
        Calculadora c = new Calculadora();

        //Emprego do método para calcular a porcentagem sobre um valor total
        double resultado1 = c.parametroPorcentagem(jo.toString());
        JSONObject jo3 = new JSONObject();
        jo3.put("resultado", resultado1);

        //Emprego do método para calcular a porcentagem correspodente à um valor final sobre o valor total
        double resultado2 = c.parametroValorFinal(jo2.toString());
        jo3.put("porcentagem", resultado2);
        System.out.println(jo3.toString());
    }
}