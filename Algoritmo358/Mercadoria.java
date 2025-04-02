package Algoritmo358;

public class Mercadoria {
    Double[] precoCompra = new Double[100];
    Double[] precoVenda = new Double[100];
    Double lucro;
    int totalLucroMenor10 = 0;
    int totalLucroMenor20 = 0;
    int totalLucroMaior20 = 0;

    void valorCompra(Double compra, int i){
        precoCompra[i] = compra;
    }

    void valorVenda(Double venda, int i){
        precoVenda[i] = venda;
    }

    void calcularLucro(int i){
        double percentualLucro = ((precoVenda[i] - precoCompra[i]) / precoCompra[i]) * 100;
        
        if (percentualLucro < 10.0){
            totalLucroMenor10++;
        } else if (percentualLucro <= 20.0){
            totalLucroMenor20++;
        } else {
            totalLucroMaior20++;
        }
    }

    void imprimir(){
        System.out.println("Total de mercadorias com lucro menor que 10%: "+totalLucroMenor10);
        System.out.println("Total de mercadorias com lucro maior ou igual a 10% e menor ou igual a 20%: "+totalLucroMenor20);
        System.out.println("Total de mercadorias com lucro maior que 20%: "+totalLucroMaior20);

    }
}
