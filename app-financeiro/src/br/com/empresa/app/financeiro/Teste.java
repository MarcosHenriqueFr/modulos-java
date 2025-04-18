package br.com.empresa.app.financeiro;

import br.com.empresa.app.calculo.Calculadora;
import br.com.empresa.app.calculo.interno.OperacoesAritmeticas;

import java.lang.reflect.Field;

public class Teste {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Valor da soma: " + calculadora.soma(3, 7, 20));

        OperacoesAritmeticas op = new OperacoesAritmeticas();
        System.out.println(op.soma(30, 7.8, 3.2, 8.5));

        // Acesso direto pelos metadados, abre - modifica - fecha
        // Se eu quiser modificar, a minha classe deve estar open
        // Seria como as transactions do JPA,
        // Os dados só são acessíveis quando especificado pelo programador
        Field id = null;
        try {
            // Consigo acessar e modificar os dados de um atributo privado a partir de uma instancia
            id = Calculadora.class.getDeclaredFields()[0];
            id.setAccessible(true);

            id.set(calculadora, "def");
            System.out.println(id.get(calculadora)); // Poderia ser via um get public

            id.setAccessible(false);

        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
