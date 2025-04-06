package Algoritmo400;

class Quarto {
    int numero;
    int leitos;
    double preco;
    String situacao;
    int diarias;
    double despesasExtras;

    Quarto(int numero, int leitos, double preco) {
        this.numero = numero;
        this.leitos = leitos;
        this.preco = preco;
        this.situacao = "livre";
        this.diarias = 0;
        this.despesasExtras = 0.0;
    }

    double calcularTotal() {
        return diarias * preco + despesasExtras;
    }

    void mostrarInfo() {
        System.out.println("Quarto " + numero + " | Leitos: " + leitos + " | Preço: R$" + preco +
                " | Situação: " + situacao + " | Diárias: " + diarias +
                " | Despesas: R$" + despesasExtras);
    }
}