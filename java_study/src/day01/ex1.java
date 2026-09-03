package day01;
import java.util.Arrays;

public class ex1 {
	// 자바프로램의 시작점. main 메서
	// 컨트롤 스페이스로 불러올수있
	public static void main(String[] args) {
		//모든 명령어의 끝은 ;로 끝내야
		System.out.println("Hello World");
		
		// 이건라인주석임
		/*
		 * 이건 블락 주석
		 * */
		
		// 변수의 선업 대입, 초기화
		int value1,value2,value3; // 같은 타입변수 3개선언
		value1=1;
		System.out.println(value1);
		
		// 데이터 타입.
		/*
		 * 자바의 데이터 타입은 크게 2가지로 나뉘고, 각 타입은 다시 세부적으로 나뉩니다.
		 *Ptype,Rtype: 원시타입, 객체타입 두개로 나뉩니다.
		 *객체타입은 나중에 배울거고, 지금은 primitive를 배웁니다
		 *
		 *ptype은 데이터의 타입에 따라아래처 나뉨
		 *1. 정수형 :	byte(1byte), short(2byte), int(4byte,default), long
		 *2. 실수형 : float(4byte), double(8byte,default) 
		 *여기서 default 란 타입지정이 되지않은 상태의 값으로 사용될때 그 값을 표현 또는
		 *값을 표현또는 값의 메모리를 생성하는 기본타입을 말합니다.
		 *
		 * 타입이 작은 타입이 큰 타입을 대입할때는 반드시 케스팅 연산을 통해서 해야하고 
		 * 이때 메모리는 잘려나갑니다.
		 * 
		 * 반대인 경우 문제없습니
		 */
		byte b =127;
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		//byte는 정수 연산시에 사용하는 목적이 아니라, 문자열을 다룰때(쪼개거나,합칠때)
		//또는 Data를 읽거나 쓸때 주로 사용됩니다. 
		
		System.out.println(Arrays.toString("김진헌".getBytes()));
		
		//short : 2byte 정수 타입이다. 사용되지 않는다.
		
		// int : 정수의 기본 타입이다. 4byte 의 범위를 가지고 있다.
		// 리터럴로 데이터가 사용될 때는 기본적으로 int 메모리를 사용한다.
		// 연산자와 타입의 연관성 : 서로 다른 타입의 변수가 연산되어질때
		// 자바는 두 타입중 큰 타입으로 변환후 연산처리를 한다. 꼭 이억할것
		
		//int 의 값 표기법
		int x = 0b0101; //이진수표기
		int y=013; // 8진수표기 
		int z=100;//10진수표
		int w=0x123; //16진수표
		
		System.out.println(10*10);
		
		//b=1+x;
		b= 0;
		x=5;
		
		int in = b + x;
		
		in=1000;
		System.out.println(Integer.toBinaryString(in)); // in을 이진수 표기출력
		
		b = (byte)in; // 캐스팅 연산자를 이용한 타입 변환. 이런경우 8비트 이상은 버려짐
		System.out.println(b);
		
		// 무한대의 정수 타입 Long
		long lo=123343231212L; //Long 으로 선언하기 위해 값을 끝에 L or l을 사용함.
		lo = b + lo;
		
		// 정수타입의 문자표기 타입인 char 
		// 유니코드기반의 데이터타입.. 정수타입이며, 음수가 없는것이 특징.
		// 사용법은 문자의 경우 ''을 이용하여 하나의 문자만을 표기할수 있다.
		char c1='A';
		char c2=65;
		char c3='가';
		char c4= 44032; // 유니코드값을 직접입렵 
		
		//char c5= c1+c2;
		
		System.out.println(c1+""+c2);
		System.out.println(c4);
		
		// 모든 데이터 타입은 문자열과 만나면 문자열로 변환됨.
		
		
		// 실수 데이터 타입 : float / double(default)
		
		float f =1F;
		double pi=3.14;
		
		System.out.println(f);
		System.out.println(pi);
		
		double d = 3.14;
		
		// 지수 표기법
		double d2 = 5e2; // 5.0의 10의 5제곱
		System.out.println(d2);
		
		
		float var1=0.123456789012345678F;
		double var2=0.123456789012345678;
		System.out.println(var1);
		System.out.println(var2);
		
		
		// 논리형 boolean true or false 만 가질수 있다.
		boolean t= true;
		boolean fa=false;
		
		
		
		
		
	
		
		
		
		
			
	}
	
}

