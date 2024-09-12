import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    // void -> significa que não está retornando nada
    void mostrarStatus() {
        System.out.format("Personagem: %s (lvl %d) com força de %d\n", nome, nivel, forca);
    }

    int calcularDano() {
        Random gerador = new Random();
    // 1.....20
    // nextInt(): 0...19 (se colocasse 19 no nextInt)
    // nextInt(): 0 + 1 = 1 ou, 19 + 1 = 20
        int dado20Faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20Faces;
        return dano;
    }

    // método que não retorna nada e recebe um parâmetro alvo que é do tipo String
    void atacar(String alvo, String habilidade) {
        // "" o tamanho (.length) é igual a 0
        int danoCausado = calcularDano();
        if (habilidade.length() == 0){
            System.out.format("%s atacou %s e causou %d de dano.\n", nome, alvo, danoCausado);  
        } else {
            System.out.format("%s usou '%s' contra %s e causou %d de dano.\n"
                                        , nome, habilidade, alvo, danoCausado);

        }
        
    }
}