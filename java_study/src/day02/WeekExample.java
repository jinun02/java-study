package day02;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calender 객체와 Enum을 이용해서 오늘이 무슨 요일인지 검증해봅시다.
		
		// 열거타입 변수 선언..
		Week today=null;
		
		// 오늘 날짜의 정보를 가져옵니다.
		Calendar cal= Calendar.getInstance();
		
		// 위 cal 객체의 필드를통해서 오늘의 요일을 가져옵니다.
		int week = cal.get(Calendar.DAY_OF_WEEK); // 일요일1~ 토요일7로리턴됨
		System.out.println(week);
		
		
		switch (week) {
		case 1:
			today=Week.SUNDAY;
			break;
		case 2:
			today=Week.MONDAY;
			break;
		case 3:
			today=Week.TUESDAY;
			break;
		case 4:
			today=Week.WENESDSY;
			break;
		case 5:
			today=Week.THURSDAY;
			break;
		case 6:
			today=Week.FRIDAY;
			break;
		case 7:
			today=Week.SATURDAY;
			break;
		}
		
		if(today== Week.SUNDAY || today== Week.SATURDAY) {
			System.out.println("공부 안하고 쉬기 ");
		}else {
			System.out.println("열심히 자바 공부하기 ");
		}

	}

}
