package Algoritmo346;

class ManipuladorDeFrase {
    private String frase;
    
    public ManipuladorDeFrase(String frase) {
        this.frase = frase;
    }
    
    public int getComprimento() {
        return frase.length();
    }
    
    public String getExtremos() {
        if (frase.length() < 2) {
            return "Frase muito curta";
        }
        return frase.substring(0, 2) + frase.substring(frase.length() - 2);
    }
    
    public String getEspelhada() {
        return new StringBuilder(frase).reverse().toString();
    }
}


