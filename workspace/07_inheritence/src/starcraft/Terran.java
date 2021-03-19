package starcraft;

public class Terran {
	
	// field
	private Terran[] terrans;
	private int idx;
	
	// constructor
	public void Bunker() {
		terrans = new Terran[10];
	}
	
	// method
	public void add(Bunkable terran) {
		if (idx < terrans.length) {
			terrans[idx++] = (Terran)terran;
		}
	}
}
