package browser;

public class Browser {

    private boolean exibirPagina;
    private boolean adicionarNovaPag;
    private boolean atualizarPag;

    public Browser(boolean exibirPagina, boolean adicionarNovaPag, boolean atualizarPag) {
        this.exibirPagina = exibirPagina;
        this.adicionarNovaPag = adicionarNovaPag;
        this.atualizarPag = atualizarPag;
    }

    public boolean isExibirPagina() {
        return exibirPagina;
    }

    public void setExibirPagina(boolean exibirPagina) {
        this.exibirPagina = exibirPagina;
    }

    public boolean isAdicionarNovaPag() {
        return adicionarNovaPag;
    }

    public void setAdicionarNovaPag(boolean adicionarNovaPag) {
        this.adicionarNovaPag = adicionarNovaPag;
    }

    public boolean isAtualizarPag() {
        return atualizarPag;
    }

    public void setAtualizarPag(boolean atualizarPag) {
        this.atualizarPag = atualizarPag;
    }
    
    
    
}
