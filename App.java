public class App {
    public static void main(String[] args) throws Exception {
        Codificador pedro = new CodificadorPedro();
        Codificador matheus = new CodificadorMathz();
        Codificador carlos = new CodificadorCarlos();
        String texto = "aaaaa", codificado, decodificado;

        System.out.println("Testes para funcionamento dos codificadores.");        

        // Codificador Pedro
        System.out.println("Codificador: " + pedro.getNome());
        System.out.println("Versao: " + pedro.getDataCriacao());
        System.out.println("Nivel de segurança: " + pedro.getNivelSeguranca());
        System.out.println("Texto original: " + texto);
        codificado = pedro.codifica(texto);
        System.out.println("Texto codificado: " + codificado);
        decodificado = pedro.decodifica(codificado);
        System.out.println("Texto decodificado: " + decodificado);

        System.out.println("\n==================================\n");
        
        // Codificador Matheus
        System.out.println("Codificador: " + matheus.getNome());
        System.out.println("Versao: " + matheus.getDataCriacao());
        System.out.println("Nivel de segurança: " + matheus.getNivelSeguranca());
        System.out.println("Texto original: " + texto);
        codificado = matheus.codifica(texto);
        System.out.println("Texto codificado: " + codificado);
        decodificado = matheus.decodifica(codificado);
        System.out.println("Texto decodificado: " + decodificado);
        
        System.out.println("\n==================================\n");


        // Codificador Carlos
        System.out.println("Codificador: " + carlos.getNome());
        System.out.println("Versao: " + carlos.getDataCriacao());
        System.out.println("Nivel de segurança: " + carlos.getNivelSeguranca());
        System.out.println("Texto original: " + texto);
        codificado = carlos.codifica(texto);
        System.out.println("Texto codificado: " + codificado);
        decodificado = carlos.decodifica(codificado);
        System.out.println("Texto decodificado: " + decodificado);
    }
}
