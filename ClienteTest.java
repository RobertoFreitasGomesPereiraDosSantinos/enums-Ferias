package enumeração;

import enumeração.Cliente.TypePay;

public class ClienteTest {
    public static void main(String... args) {
        Cliente cli = new Cliente("Aninha",TipoCliente.P_JUR, TypePay.APRAZO);
        cli.println();
    }
}
