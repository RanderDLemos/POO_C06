//matriz 2x2 com 1 bomba

import java.util.Scanner;

public class main {

    public static void main(String [] args){

        boolean verificar;
        Bomba jogo = new Bomba();

        System.out.println("Digite qual linha voce deseja caminhar");
        Scanner entrada1 = new Scanner(System.in);
        int digito1 = entrada1.nextInt();
        System.out.println("Digite qual coluna voce deseja caminhar");
        Scanner entrada2 = new Scanner(System.in);
        int digito2 = entrada2.nextInt();

        verificar = jogo.inicializarJogo(digito1, digito2);
        if(verificar){
            System.out.println("Voce ganhou");
        }else {
            System.out.println("Voce perdeu");
        }

    }

}
