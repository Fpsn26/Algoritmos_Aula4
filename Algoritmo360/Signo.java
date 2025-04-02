package Algoritmo360;

public class Signo {
    private static final String[] signos = { "Capricórnio", "Aquário", "Peixes", "Áries", "Touro", "Gêmeos",
            "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário" };

    private static final int[] ultimosDias = { 20, 19, 20, 20, 20, 20, 21, 22, 22, 22, 21, 21 };

    public static String descobrirSigno(int dia, int mes) {
        mes--; 
        if (dia > ultimosDias[mes]) {
            mes = (mes + 1) % 12; 
        }
        return signos[mes];
    }
}
