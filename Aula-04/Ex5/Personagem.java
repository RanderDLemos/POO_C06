public class Personagem {

    String nome;
    int pontos;
    int vida;
    Arma arma = new Arma();

    void usarArma(){

        System.out.println(arma.nome + " sendo usada...");
        arma.resistencia -= 2;
        pontos -= 2;

    }

    void tomarDano(){

        System.out.println(nome + " Tomou dano, -5 de vida");
        vida -= 5;

    }

}
