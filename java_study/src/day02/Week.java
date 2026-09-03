package day02;
/*
 * 열거 타입(enum) : 데이터중에 몇 가지로 한정된 값을 갖는 경우가 있음.
 * 예를 들어, 요일은 월, 화,....로 되어있고
 * 계절은 SPRING,SUMMER,FALL,WINTER 등으로 되어있음.
 * 아렇든 한정된 값을 가진 애들을 열거 상수로 정의해서 
 * 비교객체로 활용할때 많이 사용함.
 * 열거타입의 열거상수는 상수의 형태를 취하기 때문에 반드시 대문자로
 * 선언 합니다.
 *   
 */
public enum Week { // WEEK.MONDAY 로 접근
	MONDAY,
	TUESDAY,
	WENESDSY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}
