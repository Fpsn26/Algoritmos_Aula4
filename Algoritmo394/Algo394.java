package Algoritmo394;
import java.util.Scanner;

public class Algo394 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DadosAlunos aluno = new DadosAlunos();

        while(aluno.getOp() != 6){
            System.out.println("MENU");
            System.out.println("1- ENTRAR NOMES");
            System.out.println("2- ENTRAR 1ª NOTA");
            System.out.println("3- ENTRAR 2ª NOTA");
            System.out.println("4- CALCULAR MEDIA");
            System.out.println("5- LISTAR NO DISPLAY");
            System.out.println("6- SAIR");
            System.out.println("OPCAO");
            aluno.setOp(scan.nextInt());
            scan.nextLine();

            if(aluno.getOp() == 1){
                aluno.setFlag(1);
                for (int i = 0; i < 50; i++){
                    System.out.println("Digite " + (i+1) + "º nome: ");
                    aluno.armazenarNome(scan.nextLine(), i);
                }
            }else if (aluno.getOp() == 2){
                if(aluno.getFlag() == 0){
                    System.out.println("Não tem nome cadastrado!");
                }else{
                    for (int i = 0; i < 50; i++){
                        System.out.println("Digite a 1ª nota: ");
                        aluno.armazenarNota1(scan.nextDouble(), i);
                        scan.nextLine();
                        aluno.setFlag1(1);
                    }
                }
            }else if (aluno.getOp() == 3){
                if(aluno.getFlag() == 0){
                    System.out.println("Não tem nome cadastrado!");
                }else{
                    for (int i = 0; i < 50; i++){
                        System.out.println("Digite a 2ª nota: ");
                        aluno.armazenarNota2(scan.nextDouble(), i);
                        scan.nextLine();
                        aluno.setFlag2(1);
                    }
                }
            }else if (aluno.getOp() == 4){
                if(aluno.getFlag() == 0 || aluno.getFlag1() == 0 || aluno.getFlag2() == 0){
                    System.out.println("Não tem todos os dados cadastrados!");
                }else{
                    for (int i = 0; i < 50; i++){
                        aluno.calcularMedia(i);
                    }
                }
            }else if (aluno.getOp() == 5){
                if(aluno.getFlag() == 0 || aluno.getFlag1() == 0 || aluno.getFlag2() == 0){
                    System.out.println("Não tem todos os dados cadastrados!");
                }else{
                    aluno.imprimir();
                }
            }else{
                System.out.println("Opção não disponível!");
            }
        }
        scan.close();
    }
}
