package phone;

import java.util.Scanner;

import home.Home;
import home.Start;

public class FuncPhone implements Home {

    private Phone phone = null;
    

    public FuncPhone() {
        this.phone = new Phone(false, false, false);
    }

    public void funcoesPhone(){
        boolean btHome = false;
        do {
            
            System.out.println("Escolha entre as funções do Telefone: ");
            System.out.println("1 - Ligar");
            System.out.println("2 - Atender");
            System.out.println("3 - Correio de Voz");
            System.out.println("4 - Encerar Ligação");
            System.out.println("5 - Home");

            Scanner BtEsc = new Scanner(System.in);
            int btesc = BtEsc.nextInt();

            switch (btesc) {
                case 1:
                    ligarPhone();                    
                    break;
                case 2:
                    atenderPhone();;
                    break;
                case 3:
                    correioVoz();
                    break;
                case 4:
                    encerarLigacao();
                    break;
                case 5:
                    btHome = true;
                    BtHome();
                    break;
                default:
                    break;
            }
        } while (!btHome);
    }

    public void ligarPhone(){
        phone.setLigar(true);
        phone.setAtender(false);
        phone.setCorreioVoz(false);
        System.out.println("REALIZANDO LIGAÇÃO.");
    }

    public void encerarLigacao(){
        if(phone.isLigar() || phone.isAtender() || phone.isCorreioVoz()){
            phone.setLigar(false);
            phone.setAtender(false);
            System.out.println("DESLIGANDO LIGAÇÃO.");
        }
    }
    public void atenderPhone(){
        if(!phone.isLigar()){
            phone.setAtender(true);
            System.out.println("ATENDENDO CHAMADA.");
        }
    }

    public void correioVoz(){
        if(!phone.isLigar()){
            phone.setCorreioVoz(true);
            System.out.println("LIGANDO CORREIO DE VOZ");
        }

    }
    @Override
    public void BtHome() {
        phone.setAtender(false);
        phone.setLigar(false);
        phone.setAtender(false);
        Start.main(null);
    }    
}
