package Algoritmo370;
import java.util.Scanner;

public class Algo370 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Voo v1 = new Voo();

        System.out.print("Entre com o número de voos: ");
        int totalVoos = scan.nextInt();
        scan.nextLine();

        v1.setNumVoo(totalVoos);

        for (int i = 0; i < totalVoos; i++) {
            System.out.print("Entre com a identificação do voo " + (i + 1) + ": ");
            String nome = scan.nextLine();
            v1.setNomeVoo(nome, i);

            System.out.print("Entre com a quantidade de lugares disponíveis no voo " + nome + ": ");
            int lugares = scan.nextInt();
            scan.nextLine();
            v1.setLugaresDisponiveis(lugares, i);
        }

        while (true) {
            System.out.print("Digite o número da identidade do cliente (ou 'sair' para encerrar): ");
            String idCliente = scan.nextLine();
            if (idCliente.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o número do voo desejado (0 a " + (totalVoos - 1) + "): ");
            int numVooDesejado = scan.nextInt();
            scan.nextLine();

            v1.reservarPassagem(idCliente, numVooDesejado);
        }

        System.out.println("Encerrando sistema de reservas.");
        scan.close();
    }
}
