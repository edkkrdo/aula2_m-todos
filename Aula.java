public class Aula {
    public static void main (String[] args) throws Exception {
        // Iphone 12, tela de 6.1", 256gb
        // Galaxy Note 20 ultra, tela de 6.9", 256gb
        // Xiaomi Mi 11 Pro, tela de 6.81", 128gb
        // <tipoVariavel> nomeVariavel = valor;

        //Declarando um objetio do tipo Celular = Instanciando um objeto
        Celular celularA = new Celular(); 
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "iOs";

        Celular celularB = new Celular(); // objeto celularB
        celularB.nome = "Galaxy Note 20 Ultra"; // com estado de nome dewfinido para "Galaxy Note 20 Ultra"
        celularB.tamanhoTela = 6.9f;
        celularB.espacoArmazenamento = 256;
        celularB.sistemaOperacional = "Android";

        Celular celularC; // Declarando um objeto chamado celularC
        celularC = new Celular();
        celularC.nome = "Xiaomi Mi 11 Pro";
        celularC.tamanhoTela = 6.81f;
        celularC.espacoArmazenamento = 128;
        celularC.sistemaOperacional = "Android";


        
    
        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s", celularC.nome, celularC.tamanhoTela, celularC.espacoArmazenamento, celularC.sistemaOperacional);
    }     
}
