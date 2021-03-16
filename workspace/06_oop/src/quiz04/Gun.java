package quiz04;

public class Gun {
	
	private String model;
	private int bullet;
	private final int FULL_BULLET =6;
	
	public Gun(String model, int bullet) {
		this.model = model;
		this.bullet = bullet;
	}
	
	public void shoot() {
		if(bullet > 0) {
			System.out.println("빵야! " + bullet + "발 남았다.");
		}else {
			System.out.println("헛빵! ");
		}
	}
	
	public void reload() {
		if(this.bullet + bullet <= FULL_BULLET) {
			this.bullet += bullet;
			System.out.println(bullet + "발이 " + "장전되었다." + "현재 " + this.bullet);
		} else {
			int realBullet = FULL_BULLET - this.bullet;
			this.bullet = FULL_BULLET;
			System.out.println(realBullet + "발이 장전되었다." + "현재 "+this.bullet);
			
		}
	}
	
	void info() {
		System.out.println(model + ", " + bullet);
	}
	
	
	
}
