package day01;


//Fruit 라는 클래스를 생성해서 아래와 같이 출력하라 
		/*
		 * 과수원을 한다라고 생각하고 ,사과, 배, 오랜지를 키우고 있다
		 * 하루에 각각 생산량을 10,11,13개 이다.
		 * 하루를 기준으로 시간당 생산량을 출력하도록 하여라
		 * ex> 하루기준 시간당 생산량 : 0.xx 개..
		 * 조건: 반드시 한번의 리터럴 타입과 케스팅 연산을 사용한다. 
		 */

public class Fruit {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple =10;
		int par =11;
		int orange =13;

		int total= apple+par+orange;
		float perhour = (float)(total/24.0F); 
		System.out.println(perhour);
	}

}
