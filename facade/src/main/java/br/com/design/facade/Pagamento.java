package br.com.design.facade;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Pagamento {
    public static void pagarPeloCartao(float total) {
        log.info("Pago pelo cartão no valor total de {}", total);
    }

    public static void pagarPeloBoleto(float total) {
        log.info("Pago pelo boleto no valor total de {}", total);
    }
}
