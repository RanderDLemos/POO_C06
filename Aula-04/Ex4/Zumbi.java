public class Zumbi {

    double vida;
    String nome;

    double mostraVida(){
        return vida;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia){

        if(vida > quantia) {
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;

        }else {
            System.out.println("Vida abaixo ou igual a "+ quantia +", nao e possivel realizar a transferencia...");
            return false;
        }
    }

}


