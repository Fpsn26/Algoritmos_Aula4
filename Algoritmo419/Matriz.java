package Algoritmo419;

public class Matriz {
    int[][] n1 = new int[5][5];
    int[][] n2 = new int[5][5];
    int[][] dif = new int[5][5];

    public void armazenarMatriz1(int L, int C, int valor){
        n1[L][C] = valor;
    }

    public void armazenarMatriz2(int L, int C, int valor){
        n2[L][C] = valor;
    }

    public void calcularDiferenca() {
        for (int L = 0; L < dif.length; L++) {
            for (int C = 0; C < dif[L].length; C++) {
                dif[L][C] = n1[L][C] - n2[L][C];
            }
        }
    }

    public void imprimirDiferenca() {
        System.out.println("Matriz Diferença:");
        for (int L = 0; L < dif.length; L++) {
            for (int C = 0; C < dif[L].length; C++) {
                System.out.print(dif[L][C] + "\t");
            }
            System.out.println();
        }
    }

}