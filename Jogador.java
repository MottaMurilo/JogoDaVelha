package jogodavelha;


public class Jogador {
    
    public boolean jogar(String mapa[][], String horizontal, String vertical){
        //verifica se a posição está ocupada e caso negativo, marca com um X (padrão jogador)
        try{
            //transformando os dados que foram inseridos pelo usuário na classe principal para servirem de índices
            int x = Integer.parseInt(horizontal);
            int y = Integer.parseInt(vertical);
            if (mapa[x-1][y-1].equals(" ")){
                mapa[x-1][y-1] = "X";
                return true;
            }else{
                //exibindo mensagem em caso de posição ocupada
                System.out.println("Posição já ocupada");
                return false;
            }
        }catch(Exception e){
            System.out.println("Valor inválido");
            return false;
        }
                    
    }
}
