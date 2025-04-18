module app.financeiro {

    // Depende diretamente da API e não da Implementação dela
    requires app.api;
    uses br.com.empresa.app.api.Calculadora;
}