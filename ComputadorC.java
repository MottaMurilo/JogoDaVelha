package jogodavelha;

import java.util.Random;


public class ComputadorC extends Computador{

    Random numeroAleatorio = new Random();
    @Override
    public void jogar(String[][] mapa) {
        //Neste nível a maquina tenta impedir a vitória do jogador marcando sempre ao seu redor(cima, baixo, esquerda ou direita)
        //e caso não seja possível jogar em nenhum dos lados neste modelo, será usada um modelo de marcação aleatória
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(mapa[i][j].equals("X")){
                    //verificar se os lados horizontais já foram marcados e marcando caso negativo
                    try{
                        if(mapa[i+1][j].equals(" ")){
                            mapa[i+1][j] = "O";
                            return;
                        }
                    }catch(Exception e){
                        
                    }
                    try{
                        if(mapa[i-1][j].equals(" ")){
                            mapa[i-1][j] = "O";
                            return;
                        }
                    }catch(Exception e){
                        
                    }
                    
                    //verificar se os lados verticais já foram marcados e marcando caso negativo
                    try{
                        if(mapa[i][j+1].equals(" ")){
                            mapa[i][j+1] = "O";
                            return;
                        }
                    }catch(Exception e){
                        
                    }
                    try{
                        if(mapa[i][j-1].equals(" ")){
                            mapa[i][j-1] = "O";
                            return;
                        }
                    }catch(Exception e){
                        
                    }
                        
                     
                    
                }
            }
        }
        //caso o modelo acima venha falhar será usada um modelo aleatório
        int x;
        while(true){
            x = numeroAleatorio.nextInt(3);
            for(int j = 0; j < 3; j++){
                if(mapa[x][j].equals(" ")){
                    mapa[x][j] = "O";
                    return;
                }
            }
        }
    }

}
