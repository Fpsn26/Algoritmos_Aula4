package Algoritmo351;
import java.util.Scanner;

public class Algo351 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RegistraNome n1 = new RegistraNome();

        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            n1.armazenar(scan.nextLine());
        }

        System.out.println("\nDigite o número da pessoa: ");
        n1.imprimirNome(scan.nextInt());
    }
}   