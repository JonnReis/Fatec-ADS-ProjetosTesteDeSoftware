package entrega_introducao;

import model.Calculadora;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {

    // Caso de teste para os números menores que 0
    @Test
    public void testIntervaloInvalido1(){
        JSONObject jo = new JSONObject();
        jo.put("valorTotal", "100");
        jo.put("porcentagem", "-10");

        Calculadora c = new Calculadora();
        double resultado = c.parametroPorcentagem(jo.toString());
        assertEquals(0, resultado);
    }

    // Caso de teste para os números maiores que 100
    @Test
    public void testIntervaloInvalido2(){
        JSONObject jo = new JSONObject();
        jo.put("valorTotal", "100");
        jo.put("porcentagem", "120");

        Calculadora c = new Calculadora();
        double resultado = c.parametroPorcentagem(jo.toString());
        assertEquals(0, resultado);
        }

    // Caso de teste para os números dentro do intervalo de 0 à 100
    @Test
    public void testJsonSaidaValida(){
        JSONObject jo = new JSONObject();
        jo.put("valorTotal", "430");
        jo.put("porcentagem", "33");

        Calculadora c = new Calculadora();
        double resultado = c.parametroPorcentagem(jo.toString());
        assertEquals(141.9, resultado);
        }
    }