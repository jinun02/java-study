package day05.rasted;
/*
생성자 또는 메서드에 정의된 클래스를 지역 클래스라고 합니다.
이 클래스는 생성자 또는 메서드가 실행될 동안에만 객체를 생성할 수 있습니다.
 */
class LocalA{
    void useLocalB(final int arg){
        // 지역클래스에서 메서드의 지역변수는 자동으로 final이 붙습니다.
        // 즉 Read는 가능하지만 write는 불가합니다.

        class LocalB{
            int field=1;

            static int field2=2;

            LocalB(){
            }

            void method1(){
                System.out.println("localB=method1 실행");


            }
            void method2(){
                System.out.println("localB=method2 실행");
            }
        }//end of localB
        LocalB b= new LocalB();

        System.out.println(b.field);
        b.method1();

        System.out.println(b.field2);
        b.method2();
    }
}

public class LocalExam {
    public static void main(String[] args) {

        LocalA a =new LocalA();
        a.useLocalB(10);
    }
}
