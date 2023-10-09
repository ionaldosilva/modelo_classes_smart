package phone;


public class Phone{

    private boolean ligar;
    private boolean atender;
    private boolean correioVoz;
    public Phone(boolean ligar, boolean atender, boolean correioVoz) {
        this.ligar = ligar;
        this.atender = atender;
        this.correioVoz = correioVoz;
    }
    public boolean isLigar() {
        return ligar;
    }
    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }
    public boolean isAtender() {
        return atender;
    }
    public void setAtender(boolean atender) {
        this.atender = atender;
    }
    public boolean isCorreioVoz() {
        return correioVoz;
    }
    public void setCorreioVoz(boolean correioVoz) {
        this.correioVoz = correioVoz;
    }

    

    
    


}
