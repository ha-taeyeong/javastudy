package ex02_String;

public class Quiz03 {

	public static void main(String[] args) {
		
		String fullname = "2021-03-10.jpg";
		int idx = fullname.lastIndexOf(".");
		String filename = fullname.substring(0, idx); // 2021-03-10
		String extname = fullname.substring(idx + 1);
		System.out.println("파일 이름 : " + filename);
		System.out.println("확장자 이름 : " + extname);

	}

}
