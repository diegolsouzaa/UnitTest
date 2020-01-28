import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class CalculadoraTest {

    @Test
    public void SomarTest(){
        Calculadora calculadora = new Calculadora(5, 5);

        long resultado = calculadora.Somar();

        Assertions.assertEquals(10, resultado);
    }

    @Test
    public void SomarNumerosNegativosTest(){

        Calculadora calculadora = new Calculadora(-3,-2);
        long resultado = calculadora.Somar();

        Assertions.assertEquals(-5, resultado);
    }

    @Test
    public void DividirTest(){
        Calculadora calculadora = new Calculadora(10,2);

        long resultado = calculadora.Dividir();
        Assertions.assertEquals(5, resultado);
    }

    @Test
    public void DividirPorZeroTest(){

        Calculadora calculadora = new Calculadora(10,0);
        Assertions.assertThrows(ArithmeticException.class, () -> {calculadora.Dividir();});
    }
}
