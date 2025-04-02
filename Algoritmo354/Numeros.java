package Algoritmo354;

public class Numeros {
    int[] num = new int[15];
    int index = 0;

    void armazenarNumeros(int numero){
        if (index < num.length) {
            num[index] = numero;
            index++;
        } else {
            System.out.println("Vetor cheio!");
        }
    }

    void imprimirNumeros(){
        for (int i = 0; i < index; i++) {
            System.out.print((i+1) + " - " + num[i] + " é ");
            if (num[i] % 2 == 0){
                System.out.println("par");
            } else {
                System.out.println("ímpar");
            }
        }
    }
}
