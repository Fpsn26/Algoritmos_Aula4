package Algoritmo413;

public class Matriz {
    int[][] n = new int[5][5];
    int soma = 0;

    public void armazenarMatriz(int L, int C, int valor){
        n[L][C] = valor;
    }

    public void imprimir() {
        for (int L = 0; L < n.length; L++) {
            for (int C = 0; C < n[L].length; C++) {
                System.out.print(n[L][C] + "\t");
            }
            System.out.println();
        }
    }
    
    public void soma(){
        int somaQuadrados = 0;
    
        for (int L = 0; L < 5; L++) {
            for (int C = 0; C < 5; C++) {
                if (L + C > 4 && n[L][C] % 2 != 0) {
                    somaQuadrados += n[L][C] * n[L][C];
                }
            }
        }
    
        double raiz = Math.sqrt(somaQuadrados);
        System.out.printf("Raiz quadrada da soma dos quadrados dos ímpares abaixo da DS: %.2f\n", raiz);
    }
}
