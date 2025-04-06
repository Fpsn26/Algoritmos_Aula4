package Algoritmo400;
import java.util.ArrayList;
import java.util.Scanner;

class HotelFazenda{
    static Scanner input = new Scanner(System.in);
    static ArrayList<Quarto> quartos = new ArrayList<>();

    static void cadastrarQuarto() {
        System.out.print("Número de leitos: ");
        int leitos = input.nextInt();
        System.out.print("Preço da diária: ");
        double preco = input.nextDouble();
        int numero = quartos.size() + 1;
        Quarto q = new Quarto(numero, leitos, preco);
        quartos.add(q);
        System.out.println("Quarto cadastrado com sucesso!");
    }

    static void listarQuartos() {
        if (quartos.isEmpty()) {
            System.out.println("Nenhum quarto cadastrado.");
        } else {
            for (Quarto q : quartos) {
                q.mostrarInfo();
            }
        }
    }

    static void listarOcupados() {
        boolean achou = false;
        for (Quarto q : quartos) {
            if (q.situacao.equals("alugado")) {
                q.mostrarInfo();
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Nenhum quarto ocupado.");
        }
    }

    static void alugarQuarto() {
        System.out.print("Número do quarto: ");
        int num = input.nextInt();
        if (num >= 1 && num <= quartos.size()) {
            Quarto q = quartos.get(num - 1);
            if (q.situacao.equals("livre")) {
                System.out.print("Número de diárias: ");
                q.diarias = input.nextInt();
                q.situacao = "alugado";
                System.out.println("Quarto alugado com sucesso!");
            } else {
                System.out.println("Quarto não está livre.");
            }
        } else {
            System.out.println("Quarto não encontrado.");
        }
    }

    static void inserirDespesa() {
        System.out.print("Número do quarto: ");
        int num = input.nextInt();
        if (num >= 1 && num <= quartos.size()) {
            System.out.print("Valor da despesa: ");
            double valor = input.nextDouble();
            quartos.get(num - 1).despesasExtras += valor;
            System.out.println("Despesa adicionada.");
        } else {
            System.out.println("Quarto não encontrado.");
        }
    }

    static void calcularTotal() {
        System.out.print("Número do quarto: ");
        int num = input.nextInt();
        if (num >= 1 && num <= quartos.size()) {
            double total = quartos.get(num - 1).calcularTotal();
            System.out.println("Total a pagar: R$" + total);
        } else {
            System.out.println("Quarto não encontrado.");
        }
    }
}