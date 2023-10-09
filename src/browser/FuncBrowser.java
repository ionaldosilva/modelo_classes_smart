package browser;

import java.util.Scanner;

import home.Home;
import home.Start;

public class FuncBrowser implements Home{
    
    private Browser browser = null;

    public FuncBrowser() {
        this.browser = new Browser(false, false, false);
    }
    public void funcoesBrowser(){
        boolean btHome = false;
        do {
            
            System.out.println("Escolha entre as funções do Navegador: ");
            System.out.println("1 - exibir Navegador");
            System.out.println("2 - Abrir nova Guia");
            System.out.println("3 - Atualizar página");
            System.out.println("4 - fechar abas");
            System.out.println("5 - Home");

            Scanner BtEsc = new Scanner(System.in);
            int btesc = BtEsc.nextInt();

            switch (btesc) {
                case 1:
                    exibirPagina();            
                    break;
                case 2:
                    adicionarNovaPag();
                    break;
                case 3:
                    atualizarPag();
                    break;
                case 4:
                    encerarNavegador();
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
    public void exibirPagina(){
        if(!browser.isExibirPagina()){
            browser.setExibirPagina(true);
            browser.setAdicionarNovaPag(false);
            browser.setAtualizarPag(false);
            System.out.println("ABRINDO JANELA DO NAVEGADOR DE INTERNET");
        }
    }
    public void atualizarPag(){
        if(browser.isExibirPagina()){
            browser.setAtualizarPag(true);
            System.out.println("ATUALIZANDO NAVEGADOR");
        }
    }
    public void adicionarNovaPag(){
        if(browser.isExibirPagina()){
            browser.setAdicionarNovaPag(true);
            System.out.println("ABRINDO NOVA ABA NO NAVEGADOR DE INTERNET");
        }
    }
    public void encerarNavegador(){
        if(browser.isExibirPagina()){
            browser.setAdicionarNovaPag(false);
            browser.setAtualizarPag(false);
            browser.setExibirPagina(false);
            System.out.println("FECHANDO TODAS AS JANELAS.");
        }
    }
    @Override
    public void BtHome() {
        browser.setAdicionarNovaPag(false);
        browser.setAtualizarPag(false);
        browser.setExibirPagina(false);
        Start.main(null);
    }
    


    
}
