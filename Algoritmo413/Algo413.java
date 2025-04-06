package Algoritmo413;
import java.util.Scanner;

public class Algo413 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Matriz matriz = new Matriz();

        for(int L = 0; L < 5; L++){
            for(int C = 0; C < 5; C++){
                System.out.println("Digite o elemento " + (L+1) + " - " + (C+1) + ":");
                int valor = scan.nextInt();
                matriz.armazenarMatriz(L, C, valor);
            }
        }

        matriz.imprimir();
        matriz.soma();
        scan.close();
    }
}
