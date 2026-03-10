public class main {

    public static void main(String [] args){

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 150;
        z2.vida = 350;

        System.out.println("Vida do zumbi z1: " + z1.mostraVida());
        System.out.println("Vida do zumbi z2: " + z2.mostraVida());

        z1 = z2;

        System.out.println("Feito z1 = z2 temos: ");
        System.out.println("Vida do zumbi z1: " + z1.mostraVida());
        System.out.println("Vida do zumbi z2: " + z2.mostraVida());


    }

}
