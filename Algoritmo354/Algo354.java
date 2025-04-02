package Algoritmo354;
import java.util.Scanner;

public class Algo354 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Numeros n1 = new Numeros();

        for(int i = 0; i < 15; i++){
            System.out.print("\nDigite " + (i+1) + "º número: ");
            n1.armazenarNumeros(scan.nextInt());
        }
        
        n1.imprimirNumeros();
        
        scan.close();
    }
}
