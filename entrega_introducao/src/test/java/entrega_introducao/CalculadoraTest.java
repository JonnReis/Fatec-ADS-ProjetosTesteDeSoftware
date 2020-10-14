package entrega_introducao;

import model.Calculadora;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {

    //Teste para a porcentagem sobre um valor total
    @Test
    public void testParametroPorcentagem() {
        JSONObject jo = new JSONObject();
        jo.put("valorTotal", "100");
        jo.put("porcentagem", "10");

        Calculadora c = new Calculadora();
        double resultado = c.parametroPorcentagem(jo.toString());
        assertEquals(10, resultado);
    }

    //Teste sobre qual a porcentagem correspondente de um valor final sobre o valor total
    @Test
    public void testParametroValorFinal() {
        JSONObject jo2 = new JSONObject();
        jo2.put("resultado", "30");
        jo2.put("valorTotal", "100");

        Calculadora c = new Calculadora();
        double resultado = c.parametroValorFinal(jo2.toString());
        assertEquals(30, resultado);
    }
}