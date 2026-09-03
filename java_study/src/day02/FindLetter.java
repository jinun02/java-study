package day02;

import java.util.Random;

// 0부터 127 사이의 랜덤한 문자를 발생시키세요 
// 발생된 문자가 어떤문자안자를 판별하는 로직을 작성합니다.
// 결과는 다음과 같습니다.
// 숫자 이전의 특수문자, 숫자, 숫자와 영대문자 사이의 특수문자
// 연대문자, 영대문자와 소문자 사이의 특수문자, 영소문자 이후의 특수문자로 출력될수 있도록 작성하시오
// 아스키 코드표를 참조하시
public class FindLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
        int a = random.nextInt(127); 
        char b= (char)a;
        System.out.println(a);
        System.out.println(b);
        
        
        if (a >= 0 && a <= 47) {
            System.out.println("숫자 이전의 특수문자 ");
        } else if (a >= 48 && a <= 57) {
            System.out.println("숫자");
        } else if (a >= 58 && a <= 64) {
            System.out.println("숫자와 영대문자 사이의 특수문자");
        } else if (a >= 65 && a <= 90) {
            System.out.println("영대문자");
        } else if (a >= 91 && a <= 96) {
            System.out.println("영대문자와 영소문자 사이의 특수문자");
        } else if (a >= 97 && a <= 122) {
            System.out.println("영소문자");
        } else {
            System.out.println("영소문자 이후의 특수문자");
        }
	}

}
