import processing.core.PApplet;

public class Main extends PApplet{

    public static void main(String[] args) {
    		PApplet.main("Main");
    }

    public void settings(){

    }

    public void setup(){

	    	MusicMaker musicObject = new MusicMaker();
	    	musicObject.playMusic();
    	
    }

    public void draw(){

    } 
    
}
