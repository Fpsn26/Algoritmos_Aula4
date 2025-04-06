package Algoritmo400;
import java.util.Scanner;

public class Algo400 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Hotel-Fazenda Sucesso ---");
            System.out.println("1. Cadastrar quarto");
            System.out.println("2. Listar todos os quartos");
            System.out.println("3. Listar quartos ocupados");
            System.out.println("4. Alugar/reservar quarto");
            System.out.println("5. Inserir despesas extras");
            System.out.println("6. Calcular total do quarto");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> HotelFazenda.cadastrarQuarto();
                case 2 -> HotelFazenda.listarQuartos();
                case 3 -> HotelFazenda.listarOcupados();
                case 4 -> HotelFazenda.alugarQuarto();
                case 5 -> HotelFazenda.inserirDespesa();
                case 6 -> HotelFazenda.calcularTotal();
                case 7 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 7);

        input.close();
    }
}
