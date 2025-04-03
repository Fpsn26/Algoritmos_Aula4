package Algoritmo394;

public class DadosAlunos {
    private int[] media = new int[50];
    private String[] nomes = new String[50];
    private Double[] nota1 = new Double[50];
    private Double[] nota2 = new Double[50];
    int flag;
    int flag1;
    int flag2;
    int op;

    public void setOp(int op){
        this.op = op;
    }

    public int getOp(){
        return op;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getFlag1() {
        return flag1;
    }

    public void setFlag1(int flag1) {
        this.flag1 = flag1;
    }

    public int getFlag2() {
        return flag2;
    }

    public void setFlag2(int flag2) {
        this.flag2 = flag2;
    }

    void armazenarNome(String nome, int L) {
        nomes[L] = nome;
    }

    void armazenarNota1(double nota, int L){
        nota1[L] = nota;
    }

    void armazenarNota2(double nota, int L){
        nota2[L] = nota;
    }
    

    void calcularMedia(int L){
        media[L] = (int) Math.round((nota1[L] * 3 + nota2[L] * 7) / 10.0);
    }

    void imprimir(){
        System.out.println("Nome\tNota1\tNota2\tMédia\tSituação");
        for(int L = 0; L < 15; L++){
            System.out.println(nomes[L] + "\t" + nota1[L] + "\t" + nota2[L] + "\t" + media[L]);
        }
    }
}