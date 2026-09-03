package day01;

import java.util.Arrays;

/*
 * 자바 배열 : 자바에서 배열은 객체입니다.
 * 배열생성식은 아래와 같음.
 * 타입변수 : new type[length];
 * 타입변수 : {value1,value2..}
 * 타입변수 : new type []{value1,v2...}
 * 
 * 배열객체는 length 라는 속성 딱 하나만 존재함.
 * 배열의상태를 조정하거나 값을 문자열로 출력하거나 배열을 생성하는 등의
 * API는Arrays라는 Util 패키지의 API를 이용합니다.
 */

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아래는 향상된 for문임...
	for(String str:args) {
		System.out.println(str);
	}

	// 아래처럼 length초기화 하면 default 갑이 설정된다.
	// 수치형은 0 or 0.0,boolean은 false, 문자 공백
	int intArr[]=new int[3];
	for(int i :intArr) {
		i=0;
		System.out.println(i);
	}
	
	intArr = new int[] {1,2,3};
	for(int i :intArr) {
		System.out.println(i);
	}
	String sArr[]= {"a","b"};
	for(String s: sArr) {
		System.out.println(s);
		
	}
	
	// 배열을 출력문에 넣으면 hash 코드가 출력된다.
	System.out.println(sArr);
	
	// 배열의 정보와 관련된 여러 기능을 하는 API가 Arrays라는 클래스임.
	String str=Arrays.toString(intArr);
	System.out.println(str);
	
	intArr =new int[] {(int)(Math.random()*10)+1,
			(int)((Math.random()*10)+1),
			(int)((Math.random()*10)+1)};
	Arrays.sort(intArr);
	System.out.println(Arrays.toString(intArr));
	
	char[] stars[]=new char[10][];
	for(int i=0; i<stars.length;i++) {
		//inner 생성..
		stars[i]=new char[i+1];
		for(int j=0; j<stars[i].length;j++) {
			stars[i][j]='*';
			System.out.print(stars[i][j]);
		}
		System.out.println();
	}
	}

}
