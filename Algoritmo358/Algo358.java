package Algoritmo358;
import java.util.Scanner;

public class Algo358 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mercadoria m = new Mercadoria();

        for(int i = 0; i < 100; i++){
            System.out.println("Preço de compra: ");
            m.valorCompra(scan.nextDouble(), i);

            System.out.println("Preço de venda: ");
            m.valorVenda(scan.nextDouble(), i);

            m.calcularLucro(i);
        }

        m.imprimir();
        scan.close();
    }
}
