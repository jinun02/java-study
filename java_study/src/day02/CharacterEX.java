package day02;

public class CharacterEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A~Z 까지의 문자를 출력하고싶어요
		for(int ch='A';ch<='Z';ch++) {
			System.out.println((char)ch); // 이게 케스팅임.
		}
		
		
		String email="bill1024@naver.com" ;
		
		// 이메일 ID 검증 로직을 짤겁니다.
		// ID 에는 반드시 대문자 하나와 숫자 하나 이상이 존재해야합니다.
		
		
		String id= email.substring(0,email.indexOf('@'));
		int upperCnt=0, digitCnt=0;
		boolean isDigit,isUpper;
		for(int i =0; i<id.length();i++) {
			char ch = id.charAt(i);
			
			isDigit = Character.isDigit(ch);
			isUpper=Character.isUpperCase(ch);
			
			
			
			
			
//			if(ch>='A' && ch<='Z') {
//				upperCnt++;
//			}else if(ch>='0' && ch<='9') {
//				digitCnt++;
//			}
//			if(upperCnt > 1 && digitCnt > 1) break;
		}
		
//		System.out.println(id);
//		char[]idArr=id.toCharArray();
		
	}

}
