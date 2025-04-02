package Algoritmo356;

public class DadosAlunos {
    private int[] media = new int[15];
    private String[] nomes = new String[15];
    private String[] situacao = new String[15];
    private Double[] nota1 = new Double[15];
    private Double[] nota2 = new Double[15];

    void armazenarNome(String nome, int L) {
        nomes[L] = nome;
    }

    void armazenarNota1(double nota, int L){
        nota1[L] = nota;
    }

    void armazenarNota2(double nota, int L){
        nota2[L] = nota;
    }

    void analisarSituacao(int L){
        media[L] = (int) Math.round((nota1[L] + nota2[L]) / 2.0);
        situacao[L] = (media[L] < 6) ? "Reprovado" : "Aprovado";
    }

    void imprimir(){
        System.out.println("Nome\tNota1\tNota2\tMédia\tSituação");
        for(int L = 0; L < 15; L++){
            System.out.println(nomes[L] + "\t" + nota1[L] + "\t" + nota2[L] + "\t" + media[L] + "\t" + situacao[L]);
        }
    }
}
