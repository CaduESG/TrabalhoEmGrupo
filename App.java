public class App {
    public static void main(String[] args) throws Exception {
        Codificador cod = new CodificadorPedro();
        CodificadorMathz cod2 = new CodificadorMathz();

        System.out.println(cod2.codifica("Teste"));
        System.out.println(cod2.decodifica("Qbpqb"));
        

        System.out.println("Codificador: "+cod.getNome());
        System.out.println("Versao: "+cod.getDataCriacao());
        System.out.println("Nivel de segurança: "+cod.getNivelSeguranca());
        
        String texto = "zzz";
        String codificado = cod.codifica(texto);
        String decodificado = cod.decodifica(codificado);

        System.out.println("Texto original: "+texto);
        System.out.println("Texto codificado: "+codificado);
        System.out.println("Texto decodificado: "+decodificado);
    }
}
