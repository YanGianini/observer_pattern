import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteCliente {

    @Test
    void deveNotificarCliente() {
        Fatura fatura = new Fatura(200, "10/05/2023", "Compras muito bacanas");
        Cliente cliente = new Cliente("Yan", 1);
        cliente.addCartao(fatura);
        fatura.fecharFatura();
        assertEquals("Yan, sua fatura foi fechada, detalhes: Fatura{valor=200dataVencimento='10/05/2023detalhes=Compras muito bacanas}", cliente.getUltimaFatura());
    }

    @Test
    void naoDeveNotificarCliente() {
        Fatura fatura = new Fatura(200, "10/05/2023", "Compras muito bacanas");
        Cliente cliente = new Cliente("Yan", 1);;
        fatura.fecharFatura();
        assertEquals(null, cliente.getUltimaFatura());
    }

}
