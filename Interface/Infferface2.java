interface Camara{
    void takePhoto();
}
interface MusicPlayer{
    void canPlayMusic();
}
class SmartPhone implements Camara,MusicPlayer{
    public void takePhoto(){
        System.out.println("SmartPhone can take photo");
    }
    public void canPlayMusic(){
        System.out.println("SmartPhone can play music");
    }
}
public class Infferface2 {
    public static void main(String[] args) {
        SmartPhone s1=new SmartPhone();
        s1.canPlayMusic();
        s1.takePhoto();
    }
}
