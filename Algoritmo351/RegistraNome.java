package Algoritmo351;

public class RegistraNome {
    int numero = 0;
    private String[] nomes = new String[5];

    void armazenar(String nome) {
        if (numero < 5) {
            nomes[numero] = nome;
            numero++;
        }
    }

    void posicaoNome() {
        for (int i = 0; i < numero; i++) {
            System.out.println("Nome " + (i + 1) + ": " + nomes[i]);
        }
    }

    void imprimirNome(int valor){
        if(valor < 1 || valor > 5){
            System.out.println("Selecione um número válido!");
        }else{
            System.out.println(nomes[valor -1]);
        }
        
    }
}