package Algoritmo398;

class Fabrica {
    private int[] codigos = new int[50];
    private int[] quantidades = new int[50];
    private double[] precos = new double[50];
    private int totalProdutos = 0;
    private double totalVendas = 0;

    public void cadastrarProduto(int codigo, int quantidade, double preco) {
        if (totalProdutos >= 50) {
            System.out.println("Limite máximo de produtos atingido.");
            return;
        }
        codigos[totalProdutos] = codigo;
        quantidades[totalProdutos] = quantidade;
        precos[totalProdutos] = preco;
        totalProdutos++;
    }

    public void venderProduto(int codigo, int quantidadeVendida) {
        for (int i = 0; i < totalProdutos; i++) {
            if (codigos[i] == codigo) {
                if (quantidades[i] >= quantidadeVendida) {
                    quantidades[i] -= quantidadeVendida;
                    totalVendas += quantidadeVendida * precos[i];
                    System.out.println("Venda realizada com sucesso!");
                } else {
                    System.out.println("Estoque Insuficiente.");
                }
                return;
            }
        }
        System.out.println("Produto Não-Cadastrado.");
    }

    public void exibirRelatorio() {
        System.out.println("\nTotal de vendas do dia: R$" + totalVendas);
        System.out.println("Produtos em estoque:");

        for (int i = 0; i < totalProdutos - 1; i++) {
            for (int j = 0; j < totalProdutos - i - 1; j++) {
                if (quantidades[j] < quantidades[j + 1]) {
                    int tempCod = codigos[j];
                    codigos[j] = codigos[j + 1];
                    codigos[j + 1] = tempCod;

                    int tempQtd = quantidades[j];
                    quantidades[j] = quantidades[j + 1];
                    quantidades[j + 1] = tempQtd;

                    double tempPreco = precos[j];
                    precos[j] = precos[j + 1];
                    precos[j + 1] = tempPreco;
                }
            }
        }

        for (int i = 0; i < totalProdutos; i++) {
            System.out.println("Código: " + codigos[i] + ", Quantidade: " + quantidades[i]);
        }
    }
}