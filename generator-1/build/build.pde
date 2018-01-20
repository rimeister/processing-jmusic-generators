/*import jm.*;
import jm.audio.*;
import jm.audio.io.*;
import jm.audio.math.*;
import jm.audio.synth.*;
import jm.constants.*;
import jm.gui.cpn.*;
import jm.gui.graph.*;
import jm.gui.helper.*;
import jm.gui.histogram.*;
import jm.gui.show.*;
import jm.gui.sketch.*;
import jm.gui.wave.*;
import jm.midi.*;
import jm.midi.event.*;
import jm.music.data.*;
import jm.music.net.*;
import jm.music.rt.*;
import jm.music.tools.*;
import jm.music.tools.ca.*;
import jm.music.tools.fuzzy.*;
import jm.music.tools.ga.*;
import jm.util.*; */

import jm.music.data.*;
import jm.JMC;
import jm.util.*;
import jm.music.tools.*;

// Processing + jMusic generator experiment 1

public class C4 implements JMC {
	Note n = new Note(C4, QUARTER_NOTE);
}

void setup() {
	size(512, 512);
	background(#ffffff);
//	C4.n.play();
//	Note myNote = new Note(C4,QUARTER_NOTE);
}


/*****************************************************/
/*****************************************************/
/************ NOTE ***********************************/
/*****************************************************/
/*****************************************************/

/*
	I am going to abandon the Processing PDE file approach for now.
	Instead, I am going to create a Java project, and import processing as a library into it.
	Going to try this in generator-2.
*/