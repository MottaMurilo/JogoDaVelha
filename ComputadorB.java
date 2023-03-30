package jogodavelha;



import java.util.Random;

public class ComputadorB extends Computador{
    Random numeroAleatorio = new Random();
    
    @Override
    public void jogar(String[][] mapa) {
        //Neste nível é gerado uma posição aleatória para a marcação
        int x,y;
        while(true){
            x = numeroAleatorio.nextInt(3);
            y = numeroAleatorio.nextInt(3);
            if(mapa[x][y].equals(" ")){
                mapa[x][y] = "O";
                return;
            }
            
        }
    }

}
