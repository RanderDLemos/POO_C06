public class Cantina {

    String nome;
    Salgado[] cardapio = new Salgado[3];

    void addSalgado(Salgado novoSalgado){
        for(int i = 0; i < cardapio.length; i++ ){
            if(cardapio[i] == null){
                cardapio[i] = novoSalgado;
                break;
            }
        }
    }

    void mostraInfo(){
        System.out.println("A cantina contem os seguintes salgados: ");
        for(Salgado verificador : cardapio){
            if(verificador != null) {
                System.out.println(verificador.nome);
            }
        }
    }
}
