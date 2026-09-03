package day01;
import java.util.Scanner;

public class OpExam {
public static void main(String[] args) {
	/*
	 * 연산자 우선순위
	 * 최고연산자 : .,(),
	 * 단항연산자 : (casting), !(반전),++/--(선행증감)
	 * 산술 연산자 : 5칙 연산자 + alpha
	 * 쉬프트 연산자 : <<, >>, >>>,
	 * 관계 연산자 : <,>,.....
	 * 비트 연산자 : &,|,^
	 * 논리 연산자 : &&,||
	 * 삼항 연산자 : 조건? true 결과 : false 결과
	 * 배정대입 : +=,*=,....
	 * 후행 연산자 : ++/--  
	 */

	Scanner sc = new Scanner(System.in);
	
	System.out.println("주민번호 7자리를 입력하시오 :");
	int value = Integer.parseInt(sc.nextLine());
	
	System.out.println(value%2==0?"여성이군요 ": "남성이군요 ");
	
	// == 값이 같은지 비교연산자.. 이 연산자는 
	// p타입에 사용될때는 값이 같은지를 물어보는 것이고,
	// r타입에서는 같은 객체인지를 물어보는것이다.
	// 기억해두기!
	
	
}
}
