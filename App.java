public class App {
    public static void main(String[] args) throws Exception {
        Codificador cod = new CodificadorPedro();

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
