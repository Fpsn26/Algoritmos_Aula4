package Algoritmo360;
import java.util.Scanner;

public class Algo360 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data;

        System.out.print("Digite sua data de nascimento (ddmm) ou 9999 para sair: ");
        while ((data = scanner.nextInt()) != 9999) {
            int dia = data / 100;
            int mes = data % 100;

            if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
                System.out.println("Data inválida! Tente novamente.");
            } else {
                System.out.println("Signo: " + Signo.descobrirSigno(dia, mes));
            }

            System.out.print("Digite sua data de nascimento (ddmm) ou 9999 para sair: ");
        }
        scanner.close();
    }
}
