package ex02_2d_array;

/*
	2차원 배열
	1. 2차원 배열은 "테이블(표)" 형태로 이해하면 됩니다.
	2. 고정형 2차원 배열과 가변형 2차원 배열이 있습니다.
	3. 선언
	   1) int[][] a = new int[3][2]; // 3행 2열
	   2) int[][] a;
	      a = new int[3][2];
	4. 가변형 선언
	   1) int[][] a = new int[3][]; // 3행 N열
	      a[0] = new int[2]; // 첫 번째 행(인덱스 0)은 2열입니다.
	      a[1] = new int[4]; // 두 번쨰 행(인덱스 1)은 4열입니다.
	      a[2] = new int[3]; // 세 번째 행(인덱스 2)은 3열입니다.
	5. 초기화
	   1) int[][] a = {
	   			{ 1, 2 },
	   			{ 3, 4 },
	   			{ 5, 6 }
	   	  };
	   2) int[][] a = {
	   			{ 1, 2 },
	   			{ 3, 4, 5, 6 },
	   			{ 7, 8, 9 }
	   	  };
 */
public class Ex01_2d_array {

	public static void main(String[] args) {
		
		// 2차원 배열 선언 및 생성
		int[][] a = new int[3][2];
		
		// 첫 번째 행입니다.
		a[0][0] = 10;
		a[0][1] = 20;
		
		// 두 번째 행입니다.
		a[1][0] = 30;
		a[1][1] = 40;
		
		// 세 번째 행입니다.
		a[2][0] = 50;
		a[2][1] = 60;
		/*
		// 출력입니다. 테이블형태로 출력합니다.
		System.out.print(a[0][0] + " ");
		System.out.print(a[0][1] + " ");
		System.out.println();
		System.out.print(a[1][0] + " ");
		System.out.print(a[1][1] + " ");
		System.out.println();
		System.out.print(a[2][0] + " ");
		System.out.print(a[2][1] + " ");
		System.out.println();
		*/
		// for문을 이용한 순회입니다.
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}














