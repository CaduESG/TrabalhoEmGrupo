import java.time.LocalDate;

public class CodificadorPedro implements Codificador {
    public String getNome() {
        return "Codificador Pedro";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 03, 13);
    }

    public int getNivelSeguranca(){
        return 1;
    }

 public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char codificado = (char) ((c - base + 3) % 26 + base);
                encoded.append(codificado);
            } else {
                encoded.append(c); // mantém espaços e pontuação
            }
        }

        return encoded.toString();
    }

    public String decodifica(String str) {
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char decodificado = (char) ((c - base - 3 + 26) % 26 + base);
                encoded.append(decodificado);
            } else {
                encoded.append(c); // mantém espaços e pontuação
            }
        }

        return encoded.toString();
    }
}