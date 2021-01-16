package br.com.design.factory;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PizzaFactory implements ComidaFactory{

    @Override
    public Comida criarComida(int id) {

        Pizza pizza = new Pizza();

        if (id == 1) {
            pizza.nome = "Pizza portuguesa";
            pizza.bordaComRecheio = true;
            pizza.sabor1 = "Ovo";
            pizza.sabor2 = "Presunto";
            pizza.comPalmito = true;
        } else if (id == 2) {
            pizza.nome = "Pizza de calabresa";
            pizza.bordaComRecheio = true;
            pizza.sabor1 = "Calabresa";
            pizza.sabor2 = "Queijo";
            pizza.comPalmito = false;
        } else {
            pizza.nome = "Pizza mista";
            pizza.bordaComRecheio = false;
            pizza.sabor1 = "Quiejo";
            pizza.sabor2 = "Presunto";
            pizza.comPalmito = false;
        }

        log.info("preparando {}", pizza.nome);

        return pizza;
    }
}
