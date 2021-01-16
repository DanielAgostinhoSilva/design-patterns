package br.com.design.singleton;

import br.com.design.singleton.model.GovernoSingleton;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SingletonApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void quando_chamar_um_metodo_getInstance_deve_retornar_uma_instancia_de_GovernoSingleton() {
        Assert.notNull(GovernoSingleton.getInstance(), "A intancia de GovernoSingleton não pode ser nula");
    }

}
