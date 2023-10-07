package play_music;


public class Ipod{

    private int play;
    private int stop;
    private int pause;

    public Ipod() {
        this.play = 0;
        this.stop = 0;
        this.pause = 0;
    }

    public int getPlay() {
        return play;
    }

    public int getStop() {
        return stop;
    }

    public int getPause() {
        return pause;
    }

    public void setPlay(int play) {
        this.play = play;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }

    public void setPause(int pause) {
        this.pause = pause;
    }
    
}
