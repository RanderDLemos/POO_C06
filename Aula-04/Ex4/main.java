public class main {

    public static void main(String [] args){

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 50;
        z2.vida = 350;

        System.out.println("Vida do zumbi z1: " + z1.mostraVida());
        System.out.println("Vida do zumbi z2: " + z2.mostraVida());

        if(z1.transfereVida(z2,50)){

            System.out.println("Transferencia realizada");
            System.out.println("Vida do zumbi z1: " + z1.mostraVida());
            System.out.println("Vida do zumbi z2: " + z2.mostraVida());

        }else{

            System.out.println("Vida do zumbi z1: " + z1.mostraVida());
            System.out.println("Vida do zumbi z2: " + z2.mostraVida());

        }

        if(z2.transfereVida(z1,50)){

            System.out.println("Transferencia realizada");
            System.out.println("Vida do zumbi z1: " + z1.mostraVida());
            System.out.println("Vida do zumbi z2: " + z2.mostraVida());

        }else{

            System.out.println("Vida do zumbi z1: " + z1.mostraVida());
            System.out.println("Vida do zumbi z2: " + z2.mostraVida());

        }


    }

}
