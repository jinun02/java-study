package day01;

import java.util.Scanner;

/*
 * 콘솔로 부터 입력데이터를 프로그램으로 가져오는 객체 사용하는 방법 알아봄
 * Scanner 객체가 그 일을 해줌
 * Scanner 객체는 Scanner 클래스 생성자를 이용해서 발생시킴. 
 * 
 */

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		
//		System.out.println("x값 입력 : ");
//		String strX = Scanner.nextLine();
//		System.out.println(strX);
		
		
		
		while(true) {
			System.out.println("입력 문자열 ");
			String data=Scanner.nextLine();
			if(data.equals("q"))break;
			
			System.out.println("출력 문자열 : "+ data);
			System.out.println();
		}
		System.out.println("메인메서드 종료 ");
		
		
		
		
	}

}
