package Algoritmo346;
import java.util.Scanner;

public class MenuFrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        
        ManipuladorDeFrase manipulador = new ManipuladorDeFrase(frase);
        
        int opcao;
        do {
            System.out.println("\nMENU");
            System.out.println("1 - Imprime o comprimento da frase");
            System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase");
            System.out.println("3 - Imprime a frase espelhada");
            System.out.println("4 - Termina o algoritmo");
            System.out.print("OPCAO: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Comprimento da frase: " + manipulador.getComprimento());
                    break;
                case 2:
                    System.out.println("Dois primeiros e dois últimos caracteres: " + manipulador.getExtremos());
                    break;
                case 3:
                    System.out.println("Frase espelhada: " + manipulador.getEspelhada());
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
        
        scanner.close();
    }
}