package day05.rasted;
/*
중첩클래스 : 인스턴스 멤버 클래스, static 멤버 클래스, 지역(local) 클래스 등으로, 익명클래스
구분되어질 수 있다.

인스턴스 멤버 클래스의 객체는 외부 객체를 생성해야만, 내부객체를 생성할수 있고,
static 멤버클래스는 외부 객체를 생성하지 않아도 생성 가능하다.
지역 클래스는 특정 메서드 내부에 정의된 클래스로 메서드가 생행될때만 내부객체를 생성할수 있다.
 */

class A{
    // 클래스 내부에 B클래스를 정의 할 수 있다. 접근제어는 public, private, default 를 사용할 수 있다.
    // B 객체를 발생할 수 있는 위치는 인스턴스 필터값, 생성자, 인스턴스 메서드에서 생성할 수 있다.

    int aFiled=10;

    class B{
        // inner 클래스 내부에는 멤버필드, 메서드, 생성자, static 등을 모두 정의 가능하다.

        int field =1;
        static int field2=2;

        //생성자
        B(){
            System.out.println("B-생성자 실행됨");
        }
        void method1(){
            System.out.println("B-method1 실행됨");
            System.out.println("Other의 필드 사용함."+aFiled);
        }
        static void method2(){
            System.out.println("B-method2 실행됨");
        }
    }

    // A 클래스의 인스턴스 메서드에서 내부 클래스를 사용한다.
    void useB(){
        // B 객체 사용 및 멤버필드, 메서드 호출
        B b = new B();
        System.out.println(b.field);
        b.method1();

        // B클래스의 정적 멤버 사용
        System.out.println(B.field2);
        B.method2();
    }









    B field = new B();
    A(){
        B b = new B();
    }
}

public class NestedClassExam {
    public static void main(String[] args) {
        // 인스턴스 멤버 클래스의 객체는 외부 객체를 생성한 이후에 생성 가능하다.
        A a =new A();
        A.B b= a.new B();


        a.useB();
    }
}
