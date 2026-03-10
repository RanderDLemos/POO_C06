public class main {

    public static void main(String[] args){

        Personagem p1 = new Personagem();

        p1.nome = "Meulers";
        p1.pontos = 100;
        p1.vida = 100;
        p1.arma.nome = "tchemps";
        p1.arma.descricao = "A melhor de todas";
        p1.arma.poder = 100;
        p1.arma.resistencia = 70;

        p1.tomarDano();
        p1.usarArma();
        System.out.println("-----------------------");
        p1.arma.mostraInfoArma();
        System.out.println("-----------------------");

    }

}
