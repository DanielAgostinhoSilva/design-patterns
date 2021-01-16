package br.com.design.facade;

public class Entrega {
    public String endereco;
    public String cep;
    public String transportadora;

    public float calcularFrete() {
        return 200f;
    }
}
