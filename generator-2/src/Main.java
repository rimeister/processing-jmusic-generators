import processing.core.PApplet;

public class Main extends PApplet{

    public static void main(String[] args) {
    		PApplet.main("Main");
    }

    public void settings(){
		size(500,500);
    }

    public void setup(){
		background(255);
		MusicMaker musicObject = new MusicMaker();
	    	musicObject.playMusic();
    }

}
