package br.com.empresa.app.financeiro;

import br.com.empresa.app.calculo.Calculadora;

public class Teste {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        System.out.println("Valor da soma: " + calculadora.soma(3, 7, 20));

        System.out.println(calculadora.getLoggerClass());
    }
}
