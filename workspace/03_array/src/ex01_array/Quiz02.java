package ex01_array;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] friendList = {"타요", "짱구", "스폰지밥"};
		System.out.print("새로 사귄 친구가 몇 명? >>>");
		int newfriend = sc.nextInt();
		
		// 새로운 배열을 만듭니다.
		String[] temp = new String[friendList.length+newfriend];
		
		//새로운 배열로 기존 친구 명단을 넘깁니다.
		for(int i = 0; i < friendList.length; i++) {
			temp[i] = friendList[i];
		}
		
		//새로운 친구를 입력받습니다.
		for(int i = friendList.length; i < temp.length; i++) {
			System.out.print("새 친구 이름은? >> ");
			temp[i] = sc.next();
		}
		
		//새로운 배열로 갈아탑니다.
		friendList = temp;
		
		//확인해 봅시다.
		for(int i = 0; i < friendList.length; i++) {
			System.out.println(friendList[i]);
		}
		
		
		
		
	}

}
