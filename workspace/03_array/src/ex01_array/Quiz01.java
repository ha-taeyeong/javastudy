package ex01_array;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		String[] names = new String[3];
		
		for(int i = 0; i < names.length; i++) {
			System.out.print((i+1) + "번째 사람 이름 입력 >>> ");
			names[i] = sc.next();
		}
		
		for(String name : names) {
			System.out.println(name);
		}
		
		sc.close();
	    */
		String[] names = new String[3];
		
		for(int i = 0; i < names.length; i++) {
			System.out.print((i + 1) + "번째 이름 입력 >>> ");
			names[i] = sc.next();
	//		System.out.println(names[i]);
		}
		
		for ( String name : names ) {
			System.out.println(name);
		}
		
		sc.close();
	}	
}
