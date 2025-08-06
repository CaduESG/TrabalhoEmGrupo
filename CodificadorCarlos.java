import java.time.LocalDate;

public class CodificadorCarlos implements Codificador {
    public int getNivelSeguranca(){
        return 10;
    }

    public String getNome() {
        return "Codificador Carlos";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 03, 13);
    }

    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();

        int soma = 1;
        for (char c : str.toCharArray()) {
            encoded.append((char) (c + soma));
            soma++;
        }

        return encoded.toString();
    }

    public String decodifica(String str) {
        StringBuilder encoded = new StringBuilder();
        
        int soma = 1;
        for (char c : str.toCharArray()) {
            encoded.append((char) (c - soma));
            soma++;
        }
        
        return encoded.toString();
    }
}