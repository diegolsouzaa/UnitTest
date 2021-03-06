
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RetanguloTest {

    Retangulo retangulo;

    @Test
    public void testCalculaArea() {
        retangulo = new Retangulo(10, 2);
        int resultadoEsperado = 20;

        int resultado = retangulo.calcularArea();
        Assertions.assertEquals(resultadoEsperado, resultado);

    }


    @Test
    public void testCalcularPerimetro(){
        retangulo = new Retangulo(10,2);
        int resultdoEsperado = 24;

        int resultado = retangulo.calcularPerimetro();

        Assertions.assertEquals(24, resultado);

    }


}
