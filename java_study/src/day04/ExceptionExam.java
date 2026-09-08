package day04;
/*
자바의 예외처리 : 자바에서는 실행 이후에 발생되는 모든 에러상황을 예외로 처리합니다.
예외가 발생되는 프로세서는, 실행후 오류발생--> 해당 오류 예외객체 발생시킴(JVM)-->
예외핸들링 여부 --> 핸들링 하지 않으면 프로그램 비정상 종료(예외발생코드에서 종료)
핸들링을 하게되면 프로그램이 정상 동작함.

위에서 봤듯이 예외는 객체입니다. 객체란 의미는 예외의 내용에 해당하는 클래스가 존재한다는 의미
예외에서 여러분이 알아야될 분기점이 있는데, 예외처리 코드를 할지 말지를 컴파일러가 관여하는
분기가 있다는 뜻임...그 클래스가 RuntimeException보다 부모면, 컴파일러가 예외 핸들링
여부를 관여하고, 아닌경우엔 관여하지 않음.
 */
public class ExceptionExam {

    public static void main(String[] args) {
        int input = 0;
        try {
            System.out.println(10/input); //JVM이
            System.out.println("이건 나누기 이후의 코드입니다.");
            // 예외객체를 생성해서 던진다.
        }catch (Exception e){
            System.out.println("0으로 나눌수 없습니다.");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally {
            System.out.println("이 블락은 예외여부와 상관없이 무조건 실행됩니다.");
        }

    }
}
