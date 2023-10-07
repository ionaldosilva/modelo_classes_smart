package play_music;

import home.Home;

public class FuncIpod implements Home {

    private Ipod ipod = null;

    public FuncIpod() {

        this.ipod = new Ipod();
    }
    public void playMusic(int play){
        if(play == 1){
            ipod.setStop(0);
            ipod.setPause(0);
            System.out.println("IPOD TOCANDO MUSICA");
        }
    }
    @Override
    public void BtHome() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'BtHome'");
    }
    @Override
    public void MdPower() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'MdPower'");
    }
    
    
}
