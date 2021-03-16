package ex02_2d_array;

public class Quiz03 {

	public static void main(String[] args) {
		String[][] matrix = new String[10][10];
		//1~100을 matrix에 채우기.
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				
				int n = (i*10) + (j+1);
				
				// 3의 배수로 검사하면 안됨
				// 일의 자리와 십의 자리로 분리하기
				int units = n % 10;
				int tens = n / 10;
				
				// 369 검사
				boolean check1 = units == 3 || units == 6 || units == 9; // 일의 자리가 369이면 true
				boolean check2 = tens == 3 || tens == 6 || tens == 9; // 십의 자리가 369이면 true
				
				// 실제 369검사 후 저장
				if(check1 && check2) {
					matrix[i][j] = "짝짝";
				}else if(check1 || check2) {
					matrix[i][j] = "짝";
				}else {
					matrix[i][j] = n + "";
				}
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}	
	}
	
}
