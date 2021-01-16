package br.com.design.facade;

public class CompraFacade {

    public static void finalizarCompra(int idProduto, String endereco, String cep, String transportadora, int meioDePagamento) {
        float precoDoProduto = Estoque.retornarPrecoDeUmProdutoPeloID(idProduto);

        Entrega correios = new Entrega();
        correios.endereco = endereco;
        correios.cep = cep;
        correios.transportadora = transportadora;

        float precoDoFrete = correios.calcularFrete();

        if (meioDePagamento == 1) {
            Pagamento.pagarPeloCartao(precoDoProduto + precoDoFrete);
        }
        else {
            Pagamento.pagarPeloBoleto(precoDoProduto + precoDoFrete);
        }
    }
}
