package ex01_random;

public class Quiz01 {

	public static void main(String[] args) {
		
		char[] charSet = { '0', '1', '2', '3', '4', '5',
						   '6', '7', '8', '9', 'A', 'B',
						   'C', 'D', 'E', 'F', 'G', 'H',
						   'I', 'J', 'K', 'L', 'M', 'N',
						   'O', 'P', 'Q', 'R', 'S', 'T',
						   'U', 'V', 'W', 'X', 'Y', 'Z',
		};
		
		// 인덱스를 랜덤하게 생성합니다. 0 <= random < charSet.length
		String tempPw = "";
		for(int n = 0; n < 6; n++) {
			int idx = (int)(Math.random()*charSet.length);
			tempPw += charSet[idx];
		}
		System.out.println(tempPw);
		
		//2.
		String tempPw2 = "";
		for(int n = 0; n < 6; n++) {
			if (Math.random() < 0.5) {
				int arabia = (int)(Math.random() * 10) + '0';
				tempPw2 += (char)arabia;
			} else {
				int alphabet = (int)(Math.random() * 26) + 'A';
				tempPw2 += (char)alphabet;
			}
		}
		System.out.println(tempPw2);
		
	}

}
