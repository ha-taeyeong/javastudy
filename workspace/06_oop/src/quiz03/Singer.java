package quiz03;

public class Singer {
	
	//field
	private String name;
	private Song song; // private Song[] songs;
	
	public Singer(String name) {
		this.name = name;
	}
	
	public void setSong(Song song) {
		this.song = song;
	}
	
	void info() {
		System.out.print(name);
		song.info();
	}

}
