package home;

import java.util.Scanner;



public class Start {
    
    static boolean ligado = false;
    
    public static void main(String[] args) {
        
        MenuInicial menu = new MenuInicial(ligado);
        

        while (!menu.isApLigado()) {
            
            if(!menu.isApLigado()){
                System.out.println("Digite 1 para Ligar o Iphone");
                Scanner botaoLigar = new Scanner(System.in);
                int btLigar = botaoLigar.nextInt();     
                if(btLigar==1){
                    menu.setApLigado(true);
                    ligado = true;
                }
            }                       
        }
        menu.StartMenu(menu.isApLigado());
    }
}
