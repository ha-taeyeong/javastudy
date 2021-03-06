package ex03_File;

import java.io.File;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

/*
	File 클래스
	1. 파일을 조작하는 클래스입니다.
	2. 파일 생성, 삭제, 파일명, 파일크기, 수정날짜 등의 확인이 가능합니다.
 */
public class FileOverviewMainClass {

	public static void main(String[] args) {

		// 디렉터리 조작
		File dir = new File("C:\\MyTemp"); // 경로 구분 (\\ == File.separator)
		//File dir = new File("C:" + File.separator + "MyTemp"); // Linux와 Windows 호환용
		
		System.out.println(dir.exists()); // 존재하는 경로이면 true 반환, 아니면 false 반환
		
		if( dir.exists() == false ) { // if ( !dir.exists() ) {
			dir.mkdirs(); // dir 디렉터리를 생성합니다.
			System.out.println("MyTemp 디렉터리가 생성되었습니다.");
		}
		/*
		if( dir.exists() == true ) { // if ( dir.exists() ) { * 주석 코드가 더 좋습니다.
			dir.delete(); // dir 디렉터리를 삭제합니다.
			System.out.println("MyTemp 디렉터리가 삭제되었습니다.");
		}
		*/
		
		//파일 조작
		File file = new File("C:\\MyTemp\\MyFile.txt");
		//File file = new File("C:\\MyTemp", "MyFile.txt");
		//File file = new File(dir, "MyFile.txt"); // File dir = new File("C:\\MyTemp");
		
		System.out.println( file.exists() );
		
		try {
			if( file.exists() == false ) {
				file.createNewFile();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(file.getAbsolutePath()); // 경로 찾기
		System.out.println(file.getPath());  // 경로
		System.out.println(file.getParent()); // 폴더 이름
		System.out.println(file.getName()); // 파일 이름
		System.out.println(new Date(file.lastModified())); // 최종 수정일
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a h:mm");
		System.out.println(sdf.format(new Date(file.lastModified())));
		System.out.println(file.length()); // 파일 내용
		
		// 디렉토리 내의 모든 디렉터리와 파일 목록 출력하기
		File javaDir = new File("C:\\Program Files\\Java\\jdk1.8.0_202");
		File[] files = javaDir.listFiles();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a h:mm");
		for (File f : files) {
			System.out.print(sdf2.format(new Date(f.lastModified())) + " ");
			if ( f.isDirectory() ) {
				System.out.print("<DIR> " + "    ");
			} else {
				System.out.print("      " + new DecimalFormat("#,##0").format(f.length()));
			}
			System.out.println(f.getName());
		}
	}
}
