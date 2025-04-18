module app.calculo {
    // Exporta somente as classes que estão visiveis, não as subpastas
    // Dependencia em módulo e build path
    requires app.logging;

    // Uma implementação de uma interface descrita diretamente
    // Diz que precisa, e diz como usa
    requires app.api;
    provides br.com.empresa.app.api.Calculadora
            with br.com.empresa.app.calculo.CalculadoraImpl;

    exports br.com.empresa.app.calculo;
    opens br.com.empresa.app.calculo;
}