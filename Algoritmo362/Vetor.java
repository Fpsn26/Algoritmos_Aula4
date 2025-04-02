package Algoritmo362;

public class Vetor {
    int[] vet1 = new int[10];
    int[] vet2 = new int[20];
    int[] comuns = new int[10];
    int tamanhoComuns = 0;
    
    void armazenarVetor1(int valor, int i){
        vet1[i] = valor;
    }

    void armazenarVetor2(int valor, int i){
        vet2[i] = valor;
    }

    void mostrarElementosComuns(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (vet1[i] == vet2[j] && !jaExiste(vet1[i])) {
                    comuns[tamanhoComuns] = vet1[i];
                    tamanhoComuns++;
                }
            }
        }

        for (int i = 0; i < tamanhoComuns; i++) {
            System.out.println(comuns[i]);
        }
    }

    boolean jaExiste(int valor) {
        for (int i = 0; i < tamanhoComuns; i++) {
            if (comuns[i] == valor) {
                return true;
            }
        }
        return false;
    }
}
