import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class VendaTest {

    @Test
    public void testCheckout(){
        Cliente cliente = new Cliente("123","joao");
        ICredito creditoService = mock(ICredito.class);
                when(creditoService.getLimite(cliente.getCpf())).thenReturn(2500d);
        Venda venda = new Venda(2000,cliente, creditoService);

        boolean resultado = venda.checkout();

        Assertions.assertTrue(resultado);

    }

}

