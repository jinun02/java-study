package day05.rasted;
/*
정적멤버 클래스 : static 키워드를 이용해서 클래스 내부에 static 클래스를 정의 하는것
일반적으로 외부 클래스에 외부 클래스와 함께 사용되는 특성 때문에 public으로 선언하는게 일반적임..
내부 객체는 외부클래스 어디든 객체를 생성할 수 있음.
멤버 inner 와 모두 같지만 , static이 붙은 차이점만 생각하면 됨
 */

class Outer{
    int outer;

    static class Inner{
        int inFiled1=1;

        static int inFiled2=2;
    }
    Inner filed1=new Inner();

    static Inner field2=new Inner();

    Outer(){
        Inner inner = new Inner();
    }
    void method1(){
        outer=20;
        System.out.println("Inner 메서드 실행");
    }
    static void method2(){
        System.out.println("정적 메서드 실행");
    }
}

public class NestedEx2 {
    public static void main(String[] args) {
        //외부에서 Inner 객체를 발생시키는 방법
        Outer.Inner inner=new Outer.Inner();
        System.out.println(inner.inFiled1);
        //inner.method1();
        System.out.println(Outer.Inner.inFiled2);
        //Outer.Inner.method2();
    }
}
