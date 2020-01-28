
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RetanguloTest {

    Retangulo retangulo;

    @Test
    @DisplayName("nome um")
    public void testCalculaArea() {
        retangulo = new Retangulo(10, 2);
        int resultadoEsperado = 20;

        int resultado = retangulo.calcularArea();
        Assertions.assertEquals(resultadoEsperado, resultado);

    }


    @Test
    @DisplayName("nome dois")
    public void testCalcularPerimetro(){
        retangulo = new Retangulo(10,2);
        int resultdoEsperado = 24;

        int resultado = retangulo.calcularPerimetro();

        Assertions.assertEquals(88, resultado);

    }


}
