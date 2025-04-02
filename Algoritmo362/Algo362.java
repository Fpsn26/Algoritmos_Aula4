package Algoritmo362;
import java.util.Scanner;

public class Algo362 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Vetor v = new Vetor();

        System.out.println("Valores do vetor 1 (10 elementos)");
        for(int i = 0; i < 10; i++){
            System.out.print("Entre com " + (i+1) + "º elemento: ");
            v.armazenarVetor1(scan.nextInt(), i);
        }

        System.out.println("Valores do vetor 2 (20 elementos)");
        for(int i = 0; i < 20; i++){
            System.out.print("Entre com " + (i+1) + "º elemento: ");
            v.armazenarVetor2(scan.nextInt(), i);
        }
        
        System.out.println("Elementos comuns aos conjuntos sem repetição:");
        v.mostrarElementosComuns();
        scan.close();
    }
}
