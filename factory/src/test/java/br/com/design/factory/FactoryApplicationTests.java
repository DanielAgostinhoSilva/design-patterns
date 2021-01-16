package br.com.design.factory;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.util.Assert;

@SpringBootTest
class FactoryApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void quando_passar_parametro_id_1_deve_retorna_uma_pizza_de_portuguesa() {
        PizzaFactory pizzaFactory = new PizzaFactory();

        Assert.isInstanceOf(Pizza.class, pizzaFactory.criarComida(1));
    }

}
