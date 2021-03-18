package quiz04;

public class KoreanFighter extends Fighter {

	public KoreanFighter(String name, int energy, int power) {
		super(name, energy, power);
		// TODO Auto-generated constructor stub
	}
	
	// attack() : 20% 확률로 한 방에 KO 시킬 수 있습니다.
	public void attack() {
		return Math.random() = 0.2;
	}
}
