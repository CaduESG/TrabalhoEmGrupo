public class CodificadorMathz{
    private String texto;
    
    public CodificadorMathz(String texto){
        this.texto = texto;
    }

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
}