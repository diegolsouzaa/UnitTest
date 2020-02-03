public class CreditoService implements ICredito {


    @Override
    public double getLimite(String cpf) {
        System.out.println("Consultando admnistradora de cartoes...");
        return 1500;
    }
}
