package day01;

public class ex2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문자열String 은 + 을 이용하여 연산을 처리할 수 있는데
		// 연산후 결과는 항상 String 이다.
		int a=10;
		int b=10;
		System.out.println("결과\n\t"+a+b);
		
		//String 을 표기하는 방법은 2가지이다
		String str="Hello World"; // "" 을 사용하는 방법 
		String str2 = new String("Hello World"); // 생성자를호출하는 방법 
		
		System.out.println(str+str2);
		
		// 문자열 내으 ptype 의 을 파싱하는 방법
		// 각 타입의 Wrapper 클래스의 메서드를 이용한다.
		// 여기서 주의 해야할점은 파싱중 예외가 발생할수 있다.
		
		String bstr="1000";
		int bb = Integer.parseInt(bstr);
		System.out.println(bb);
		
		String dStr="12.34";
		double dd = Double.parseDouble(dStr);
		System.out.println(dd);

		// 위의 경우와 반대로 변환 해야할떄.Ptype을 문자열로 변환하고자 할 때.
		//는 String 클래스의 메서드를 이용하면 편리하다.
		String resbb = String.valueOf(bb);
		String resdd = String.valueOf(dd);
		
		System.out.println(resbb+" : "+ resdd);
	}

}
