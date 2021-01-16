package br.com.design.facade;

public class Estoque {
    public static float retornarPrecoDeUmProdutoPeloID(int id) {
        float produto = 0;
        if(id == 10) produto = 1000f;
        return produto;
    }
}
