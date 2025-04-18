module app.calculo {
    // Exporta somente as classes que estão visiveis, não as subpastas
    requires app.logging;
    exports br.com.empresa.app.calculo;

    // Export especifico
    exports br.com.empresa.app.calculo.interno
            to app.financeiro;

    opens br.com.empresa.app.calculo;
}