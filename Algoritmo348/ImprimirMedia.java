package Algoritmo348;
import java.util.Scanner;

public class ImprimirMedia {
    String[] nomes = new String[5];
    double[] nota1 = new double[5];
    double[] nota2 = new double[5];
    double[] media = new double[5];
    int i;
    Scanner scan = new Scanner(System.in);

    public String[] getNomes() {
        return nomes;
    }
    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }
    public double[] getNota1() {
        return nota1;
    }
    public void setNota1(double[] nota1) {
        this.nota1 = nota1;
    }
    public double[] getNota2() {
        return nota2;
    }
    public void setNota2(double[] nota2) {
        this.nota2 = nota2;
    }
    public double[] getMedia() {
        return media;
    }
    public void setMedia(double[] media) {
        this.media = media;
    }

    void calculo(){
        for (i = 0; i <= 4; i++){
            System.out.println("Digite "+ (i + 1) +" nome: ");
            this.nomes[i] = scan.nextLine();

            System.out.println("Digite a 1ª nota: ");
            this.nota1[i] = scan.nextDouble();

            System.out.println("Digite a 2ª nota: ");
            this.nota2[i] = scan.nextDouble();;

            this.media[i] = (this.nota1[i] + this.nota2[i])/2;
        }
    }
    
    void imprimir (){
        System.out.println("RELAÇÃO FINAL");
        for (i = 0; i <= 4; i++){
            System.out.println((i + 1) + "-" + this.nomes[i]);
            System.out.println(this.nota1[i] +" "+ this.nota2[i] +" "+ this.media[i]);
        }
    }
}
