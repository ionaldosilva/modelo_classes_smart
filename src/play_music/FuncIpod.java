package play_music;

import java.util.Scanner;

import home.Home;
import home.Start;

public class FuncIpod implements Home {

    private Ipod ipod = null;

    public FuncIpod() {

        this.ipod = new Ipod();
    }
    public void funcoesPlayer(){
        boolean btHome = false;
        do {
            
            System.out.println("Escolha entre as funções do Player: ");
            System.out.println("1 - Play");
            System.out.println("2 - Stop");
            System.out.println("3 - Pause");
            System.out.println("4 - Home");

            Scanner BtEsc = new Scanner(System.in);
            int btesc = BtEsc.nextInt();

            switch (btesc) {
                case 1:
                    playMusic();                    
                    break;
                case 2:
                    stopMusic();
                    break;
                case 3:
                    pauseMusic();
                    break;
                case 4:
                    btHome = true;
                    BtHome();
                    break;
                default:
                    break;
            }
        } while (!btHome);
    }

    public void playMusic(){
    
        ipod.setPlay(true);
        ipod.setStop(false);
        ipod.setPause(false);
        System.out.println("IPOD TOCANDO MUSICA");
        
    }
    public void stopMusic(){
        if(ipod.isPlay()==true){
            ipod.setStop(true);
            ipod.setPlay(false);
            ipod.setPause(false);
            System.out.print("PARANDO DE EXECUTAR MÚSICA");
        }
    }
    public void pauseMusic(){
        if(ipod.isPlay()==true){
            ipod.setPlay(false);
            ipod.setStop(false);
            ipod.setPause(true);
            System.out.println("PAUSANDO MÚSICA");
        }
    }
    @Override
    public void BtHome() {
        // Botão Home do sistema, encerra a atividade e retorna a tela inicial.
        ipod.setPlay(false);
        ipod.setPause(false);
        ipod.setStop(false);
        Start.main(null);
    }
    
}
