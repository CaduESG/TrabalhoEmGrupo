
import java.time.LocalDate;

public class CodificadorMathz implements Codificador {
    

    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            encoded.append((char) (c - 3));
        }

        return encoded.toString();
    }

    public String decodifica(String str) {
        StringBuilder encoded = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            encoded.append((char) (c + 3));
        }
        
        return encoded.toString();
    }

    @Override
    public String getNome() {
        return "Codificador Mathz";
    }

    @Override
    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 8, 9); // Data de criação fictícia
    }

    @Override
    public int getNivelSeguranca() {
        return 5;
    }
}