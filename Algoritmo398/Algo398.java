package Algoritmo398;
import java.util.Scanner;

public class Algo398 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fabrica fabrica = new Fabrica();

        System.out.println("Cadastro de produtos (-1 para encerrar):");
        while (true) {
            System.out.print("Código: ");
            int codigo = scanner.nextInt();
            if (codigo == -1) break;
            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();
            System.out.print("Preço: ");
            double preco = scanner.nextDouble();
            fabrica.cadastrarProduto(codigo, quantidade, preco);
        }

        System.out.println("\nVendas (-1 para encerrar):");
        while (true) {
            System.out.print("Código do produto: ");
            int codigo = scanner.nextInt();
            if (codigo == -1) break;
            System.out.print("Quantidade desejada: ");
            int quantidade = scanner.nextInt();
            fabrica.venderProduto(codigo, quantidade);
        }

        fabrica.exibirRelatorio();
        scanner.close();
    }
}