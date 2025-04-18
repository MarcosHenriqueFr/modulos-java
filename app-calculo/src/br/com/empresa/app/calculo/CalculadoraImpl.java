package br.com.empresa.app.calculo;

import br.com.empresa.app.api.Calculadora;
import br.com.empresa.app.calculo.interno.OperacoesAritmeticas;
import br.com.empresa.app.logging.Logger;

public class CalculadoraImpl implements Calculadora {

    private String id = "abc";
    // Simplesmente delega as funções para outra classe
    private OperacoesAritmeticas op = new OperacoesAritmeticas();

    public double soma(double... nums) {
        Logger.info("Atividade de Soma");
        return op.soma(nums);
    }

    @Override
    public String getId() {
        return id;
    }
}
