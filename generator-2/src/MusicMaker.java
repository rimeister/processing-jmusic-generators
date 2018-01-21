import jm.JMC; // I think this is for constants "Java Music Constants", let's you use var names like "C4" in place of it's MIDI pit;ch number (60)
import jm.music.data.*;
import jm.util.*; // Import all the utilities -- was just importing util.Play before


public class MusicMaker implements JMC {
	
	public void playMusic() {
		
		
		// Trumpet part
		Part myPart = new Part(TRUMPET, 0); // Make a new Part called Trumpet.
		
		// Create top phrase, add a note, add it to the trumpet part
		Phrase topPhrase = new Phrase(2.0); // Make a new phrase
				
		Note n = new Note(G4,HALF_NOTE); // Make a G4 note
		
		topPhrase.addNote(n); // Add G4 to the phrase
		
		myPart.addPhrase(topPhrase); // Add the phrase with the note in it to the part
		
		// Create middle phrase, add a note, add it to the trumpet part
		Phrase midPhrase = new Phrase(1.0);
		
		Note n2 = new Note(E4, DOTTED_HALF_NOTE);
		
		midPhrase.addNote(n2);
		
		myPart.addPhrase(midPhrase);
		
		// Create bottom phrase, add a note, add it to the trumpet part
		Phrase bottomPhrase = new Phrase(0.0);
		
		Note n3 = new Note(C4,WHOLE_NOTE);
		
		bottomPhrase.addNote(n3);
		
		myPart.addPhrase(bottomPhrase);
		
		Write.midi(myPart, "myPart.mid");
		
		Play.midi(myPart);
		
	}
	
}
