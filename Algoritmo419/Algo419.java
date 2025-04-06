package Algoritmo419;
import java.util.Scanner;

public class Algo419 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Matriz matriz = new Matriz();

        for(int L = 0; L < 5; L++){
            for(int C = 0; C < 5; C++){
                System.out.println("Digite o elemento " + (L+1) + " - " + (C+1) + ":");
                int valor = scan.nextInt();
                matriz.armazenarMatriz1(L, C, valor);
            }
        }

        for(int L = 0; L < 5; L++){
            for(int C = 0; C < 5; C++){
                System.out.println("Digite o elemento " + (L+1) + " - " + (C+1) + ":");
                int valor = scan.nextInt();
                matriz.armazenarMatriz2(L, C, valor);
            }
        }
        
        matriz.calcularDiferenca();
        matriz.imprimirDiferenca();
        scan.close();
    }
}
