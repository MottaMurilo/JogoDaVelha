package jogodavelha;
import java.util.Scanner;

public class JogoDaVelha {
    
    
    public static void main(String[] args) {
        
        //Instanciando componentes necessários ao game
        Scanner teclado = new Scanner(System.in);
        
        Jogador jogador = new Jogador();
        ComputadorA pc1 = new ComputadorA();
        ComputadorB pc2 = new ComputadorB();
        ComputadorB pc3 = new ComputadorB();
        
        while(true){
            Tabuleiro tab = new Tabuleiro();
            int nivel = menu();//exibe o menu e retorna a escolha de níveis
            boolean vitoriaJogador;
            
            //inicia o jogo com o oponente do nível escolhido
            do{
                //se o tabuleiro ja foi completamente usado então o loop termina
                if(tab.numeroJogadas == 9){
                    break;
                }
                String x,y; // variaveis para entrada do jogador
                x = y = "";
                tab.mostrarTabuleiro();
                //loop que obriga o usuário a digitar um numero entre os permitidos
                do{
                    System.out.print("Posição linha: "); x = teclado.next();
                    System.out.print("Posição coluna: "); y  = teclado.next();
                }while(!(jogador.jogar(tab.posicoesTabuleiro, x, y)));
                tab.numeroJogadas++;//incrementando numero de jogadas
                
                // verificando se após a jogada passada já houve vitória para mostrar o tabuleiro sem jogadas adicionais da máquina
                vitoriaJogador = tab.verificarVitoria();
                if(!(vitoriaJogador)){
                    //fazendo jogada de acordo com o nível selecionado
                    switch(nivel){
                    case 1:
                        pc1.jogar(tab.posicoesTabuleiro);
                        break;
                    case 2:
                        pc2.jogar(tab.posicoesTabuleiro);
                        break;
                    case 3:
                        pc3.jogar(tab.posicoesTabuleiro);
                        break;
                    }
                    tab.numeroJogadas++;//incrementando numero de jogadas
                }
                
                
            }while(!(tab.verificarVitoria()));// se houver vitória o loop encerra
            
            //fazendo exibições finais
            tab.mostrarTabuleiro();
            System.out.println(tab.status());
            System.out.println("Digite qualquer coisa e pressione enter para jogar novamente");
            teclado.next();
            teclado.close();   
        
        }  
          
        
    }
    public static int menu(){
        //este menu é resposavel pela escolha do nivel
        Scanner teclado = new Scanner(System.in);
        int nivel = 0;
        
        //loop que só termina selecionando um dos 3 níveis disponíveis
        while(true){
            try{
                System.out.print("\nEscolha o nível (1-3): ");
                nivel = Integer.parseInt(teclado.next());
                switch(nivel){
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                    case 3:
                        return 3;
                    default:
                        System.out.println("O Nível selecionado é inválido");
                }
                
            }catch(Exception e){
                    System.out.println("Dados inválidos");
            }
     
     teclado.close();   
    }
    }
    
}


