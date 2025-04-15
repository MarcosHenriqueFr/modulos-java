package br.com.empresa.app.calculo;

import br.com.empresa.app.calculo.interno.OperacoesAritmeticas;

public class Calculadora {

    // Simplesmente delega as funções para outra classe
    private OperacoesAritmeticas op = new OperacoesAritmeticas();

    public double soma(double... nums) {
        return op.soma(nums);
    }
}
