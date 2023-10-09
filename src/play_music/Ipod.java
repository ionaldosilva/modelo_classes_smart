package play_music;

import java.util.ArrayList;
import java.util.List;

public class Ipod{

    private boolean play;
    private boolean stop;
    private boolean pause;
    List<String> musicas;

    public Ipod() {
        this.play = false;
        this.stop = false;
        this.pause = false;
        this.musicas = new ArrayList<>();
    }

    public boolean isPlay() {
        return play;
    }

    public boolean isStop() {
        return stop;
    }

    public boolean isPause() {
        return pause;
    }

    public void setPlay(boolean play) {
        this.play = play;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public void setPause(boolean pause) {
        this.pause = pause;
    }

  
}
