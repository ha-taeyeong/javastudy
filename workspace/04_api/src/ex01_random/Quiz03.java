package ex01_random;

public class Quiz03 {

	public static void main(String[] args) {
		String[] yut = { "도", "개", "걸", "윷", "모" };
		int move = 0; // 이동횟수
		
		while(true) {
			int idx = (int)(Math.random()*5);
			System.out.print("\"" + yut[idx] + "\"");
			//"\"" : 따옴표 출력하기 위해서
			
			// 이동 횟수 계산합니다.
			move += (idx+1);
			
			// 도, 개, 걸은 끝냅니다.
			if(idx < 3) {
				System.out.print(", " + move + "칸 이동한다.");
				break;
			}
			// 윷, 모는 또 던집니다.
			else {
				System.out.print(",");
			}
		}
	}

}
