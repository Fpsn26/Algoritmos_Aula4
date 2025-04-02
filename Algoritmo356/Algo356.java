package Algoritmo356;
import java.util.Scanner;

public class Algo356 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DadosAlunos aluno = new DadosAlunos();

        for(int L = 0; L < 15; L++){
            System.out.println("Digite " + (L+1) + "º nome:");
            String nome = scan.nextLine();
            aluno.armazenarNome(nome, L);

            System.out.println("Digite a 1ª nota: ");
            double nota1 = scan.nextDouble();
            aluno.armazenarNota1(nota1, L);

            System.out.println("Digite a 2ª nota: ");
            double nota2 = scan.nextDouble();
            aluno.armazenarNota2(nota2, L);
            scan.nextLine(); // Consumir quebra de linha pendente

            aluno.analisarSituacao(L);
        }

        aluno.imprimir();
        scan.close();
    }
}
