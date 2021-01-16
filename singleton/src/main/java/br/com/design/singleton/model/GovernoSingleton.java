package br.com.design.singleton.model;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class GovernoSingleton {
    private static GovernoSingleton instance;

    public String proximaEleicao = "2022";
    public String nomeDoPais = "Brasil";

    private GovernoSingleton(){}

    public static synchronized GovernoSingleton getInstance() {
        if (instance == null) instance = new GovernoSingleton();

        return instance;
    }

    public void realizarEleicao() {
        log.info("Realizando eleição!");
    }
}
