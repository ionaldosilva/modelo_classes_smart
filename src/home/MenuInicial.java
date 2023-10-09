package home;

import java.util.Scanner;

import browser.FuncBrowser;
import phone.FuncPhone;
import play_music.FuncIpod;

public class MenuInicial {
    
    private boolean ApLigado;


    
    public MenuInicial(boolean apLigado) {
        this.ApLigado = apLigado;
    }

    public boolean isApLigado() {
        return ApLigado;
    }

    public void setApLigado(boolean apLigado) {
        ApLigado = apLigado;
    }

    public void StartMenu(boolean ligado){

        if (ligado) {
            FuncIpod FuncIpod = new FuncIpod();
            FuncBrowser FuncBrowser = new FuncBrowser();
            FuncPhone FuncPhone = new FuncPhone();

            while (ligado) {
                System.out.println("TELA INICIAL");
                System.out.println("Escolha entre os apps:");
                System.out.println("1 - Player");
                System.out.println("2 - Navegador");
                System.out.println("3 - Telefone");
                System.out.println("4 - Desligar Iphone");
                Scanner BtEsc = new Scanner(System.in);
                int btesc = BtEsc.nextInt();
                switch (btesc) {
                    case 1:
                        FuncIpod.funcoesPlayer();
                        break;
                    case 2:
                        FuncBrowser.funcoesBrowser();
                    case 3:
                        FuncPhone.funcoesPhone();
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        break;
                }
            }
        }   
    }


 
}


    


