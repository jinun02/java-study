package day02;

public class Student {
	
	// 클래스 바로 아래에 정의 되는 변수는 객체에 할당 되는 변수로 
	// 인식됩니다. 즉 멤버필드로 되어집니다.
		
	private String name;
	String hakbun;
	String majer;
	boolean isGraduate;
	
	public Student(String name,String hakbun,String major,boolean isGraduate) {
		this.name=name;
		this.hakbun=hakbun;
		this.majer=major;
		this.isGraduate=isGraduate;
	}

	public String getName() {
		return name;
	}

	public String getHakbun() {
		return hakbun;
	}

	public String getMajer() {
		return majer;
	}
	
	
/*
 * 프로그래머가 생성자를 하나도 정의 하지 않으면 기본 생성자를 
 * 컴파일시에 컴파일러가 제공합니다.
 * 기본 생성자는 파라미터가 없고, 모든 필드를 default 값으로 
 * 초기화 하는 코드를 가지고 있습니다.
 * 단, 만약 하나이상의 생성자를 프로그래머가 직접 정의 하면 기본 생성자는 
 * 제공되지 않습니다. 
 */

}
