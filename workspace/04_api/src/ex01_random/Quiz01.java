package ex01_random;

public class Quiz01 {

	public static void main(String[] args) {
		// 인덱스를 랜덤하게 생성합니다. 0 <= random < charSet.length
		char[] charSet = { '0', '1', '2', '3', '4', '5',
						   '6', '7', '8', '9', 'A', 'B',
						   'C', 'D', 'E', 'F', 'G', 'H',
						   'I', 'J', 'K', 'L', 'M', 'N',
						   'O', 'P', 'Q', 'R', 'S', 'T',
						   'U', 'V', 'W', 'X', 'Y', 'Z',
		};
		
		String tempPw = ""; //tempPw 초기화
		for(int i=0; i < 6; i++) { //임시비밀번호 6자리
			int idx = (int)(Math.random()*charSet.length); // charSet배열의 인덱스를 랜덤으로 뽑는다.
			tempPw += charSet[idx]; // charSet 배열의 인덱스를 6번 뽑은 것을 tempPw에 누적시킨다.
		}
		System.out.println(tempPw); // 임시 비밀번호 6자리 출력
		
		//2.
		//tempPw2 초기화
		String tempPw2 = "";
		//6자리
		for(int n = 0; n < 6; n++) {
			// 아라비아 숫자 : 대문자알파벳 => 5:5 확률
			if(Math.random() < 0.5) {
				int abrabia = (int)(Math.random() * 10) + '0';
				tempPw2 += (char)abrabia;
			} else {
				int alphabet = (int)(Math.random() * 26) + 'A';
				tempPw2 += (char)alphabet;
			}
		}
		System.out.println(tempPw2);
	}

}
