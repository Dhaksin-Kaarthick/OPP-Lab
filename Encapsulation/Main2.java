import java.lang.*;
class MusicPlayer {
    private String songName;
    private int volume;

     MusicPlayer(String songName) {
        this.songName = songName;
        this.volume = 50;
    }

     String getSongName() {
        return songName;
    }

     void setVolume(int volume) {
        if (volume < 0) this.volume = 0;
        else if (volume > 100) this.volume = 100;
        else this.volume = volume;
    }

     int getVolume() {
        return volume;
    }
}

public class Main2 {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer("Shape of You");
        mp.setVolume(120);  
        System.out.println("Now playing: " + mp.getSongName() + ", Volume: " + mp.getVolume());
    }
}