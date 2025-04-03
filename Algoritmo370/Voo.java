package Algoritmo370;

public class Voo {
    private int numVoo;
    private String[] nomeVoo = new String[1000];
    private int[] lugaresDisponiveis = new int[1000];

    public int getNumVoo() {
        return numVoo;
    }

    public void setNumVoo(int numVoo) {
        this.numVoo = numVoo;
    }

    public String getNomeVoo(int index) {
        return nomeVoo[index];
    }

    public void setNomeVoo(String nome, int index) {
        this.nomeVoo[index] = nome;
    }

    public int getLugaresDisponiveis(int index) {
        return lugaresDisponiveis[index];
    }

    public void setLugaresDisponiveis(int lugares, int index) {
        this.lugaresDisponiveis[index] = lugares;
    }

    public boolean reservarPassagem(String idCliente, int numVooDesejado) {
        for (int i = 0; i < numVoo; i++) {
            if (i == numVooDesejado) {
                if (lugaresDisponiveis[i] > 0) {
                    lugaresDisponiveis[i]--;
                    System.out.println("Reserva confirmada! Cliente " + idCliente + 
                                       " reservado no voo " + nomeVoo[i]);
                    return true;
                } else {
                    System.out.println("Desculpe, o voo " + nomeVoo[i] + " está lotado.");
                    return false;
                }
            }
        }
        System.out.println("Voo não encontrado.");
        return false;
    }
}
