import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class VendaTest {

    @Test
    public void testCheckoutClienteComLimite(){
        Cliente cliente = new Cliente("123","joao");
        ICredito creditoService = Mockito.mock(ICredito.class);
                Mockito.when(creditoService.getLimite(cliente.getCpf())).thenReturn(2500d);
        Venda venda = new Venda(2000,cliente, creditoService);
        venda.setPagamentoAPrazo();

        boolean resultado = venda.checkout();

        Assertions.assertTrue(resultado);

    }

    @Test
    public void testCheckoutClienteSemLimite(){
        Cliente cliente = new Cliente("123","joao");
        ICredito creditoService = Mockito.mock(ICredito.class);
        Mockito.when(creditoService.getLimite(cliente.getCpf())).thenReturn(1000d);
        Venda venda = new Venda(2000,cliente, creditoService);
        venda.setPagamentoAPrazo();

        boolean resultado = venda.checkout();

        Assertions.assertFalse(resultado);

    }
    @Test
    public void testCheckoutVendaAVistaNaoVerificaCredito(){
        Cliente cliente = new Cliente("123","joao");
        ICredito creditoService = Mockito.mock(ICredito.class);
        Mockito.when(creditoService.getLimite(cliente.getCpf())).thenReturn(1000d);
        Venda venda = new Venda(2000,cliente, creditoService);

        verify(creditoService, never()).getLimite(cliente.getCpf());
    }

    @Test
    public void testCheckoutVendaNaoConcluidaSeClienteServiceFalhar(){
        Cliente cliente = new Cliente("123","joao");
        ICredito creditoService = Mockito.mock(ICredito.class);
        Mockito.when(creditoService.getLimite(cliente.getCpf())).thenThrow( new RuntimeException());
        Venda venda = new Venda(2000,cliente, creditoService);
        venda.setPagamentoAPrazo();

        boolean resultado = venda.checkout();

        Assertions.assertFalse(resultado);

    }

}

