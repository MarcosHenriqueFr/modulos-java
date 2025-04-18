package br.com.empresa.app.financeiro;

import br.com.empresa.app.api.Calculadora;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

public class Teste {

    public static void main(String[] args) {
        // Uma classe específica que lida com o load de diversos serviços/implementações
        // Depende inteiramente da interface
        Calculadora calculadora = ServiceLoader
                .load(Calculadora.class)
                .findFirst()
                .get();
        System.out.println("Valor da soma: " + calculadora.soma(3, 7, 20));

        // Uso de Java Reflect
        try {
            Field id = calculadora.getClass().getDeclaredFields()[0];
            id.setAccessible(true);
            id.set(calculadora, "teste");
            id.setAccessible(false);

            // Valor modificado
            System.out.println(calculadora.getId());
        } catch (IllegalAccessException e){
            e.getStackTrace();
        }
    }
}
