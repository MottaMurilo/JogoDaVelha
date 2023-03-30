package jogodavelha;


public class ComputadorA extends Computador{
    @Override
    public void jogar(String mapa[][]){
        //Neste nível ele encontra a primeira ocorrência de um espaço não marcado realizando uma varredura horizontal, e o marca!
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(mapa[i][j].equals(" ")){
                    mapa[i][j] = "O";
                    return;
                }
            }
        }
    }

    
}
