import jm.util.Play;
import jm.music.data.*;
import jm.JMC;

public class MusicMaker implements JMC {
	Note n = new Note(C4,QUARTER_NOTE);
	
	public void playMusic() {
		Play.midi(n);
	}
	
}
