import java.util.Random;

public class Bomba {

    Random rand1 = new Random();
    Random rand2 = new Random();
    int [][] campoMinado = new int[2][2];
    int bomba = 1;


    /*public bomba() {

    }*/

    boolean inicializarJogo(int num1, int num2){
        int posicaoX = rand1.nextInt(2);
        int posicaoY = rand2.nextInt(2);

        for(int i = 0; i < campoMinado.length; i++){
            for(int j = 0; j < campoMinado[i].length; j++){
                campoMinado[i][j] = 0;
            }
        }
        campoMinado[posicaoX][posicaoY] = bomba;
        for(int i = 0; i < campoMinado.length; i++){
            for(int j = 0; j < campoMinado[i].length; j++){
                if(campoMinado[num1][num2] != 1){
                    return true;
                }else {
                    return false;
                }
            }
        }

        return true;
    }

}
