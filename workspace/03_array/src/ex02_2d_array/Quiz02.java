package ex02_2d_array;

public class Quiz02 {

	public static void main(String[] args) {
		int[][] gugudan = new int[8][9];
		for (int i = 0; i < gugudan.length; i++) { // i는 dan과 관련
			for(int j = 0; j < gugudan[i].length; j++) { // j는 n과 관련
				gugudan[i][j] = (i+2) * (j+1);
			}
		}
		
		for(int a[] : gugudan) { //2차원 배열에서 값을 빼기 위해 1차원 배열 a라고 선언
			for(int n : a) { // a배열에서 뺀 값을 n이라고 선언
				System.out.print(n + "\t");
			}
			System.out.println();
		}

	}

}
