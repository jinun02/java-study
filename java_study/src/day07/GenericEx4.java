package day07;
/*
제한된 타입 파라미터
타입을 지정시 특정 타입만 받을수 있도록 제한을 두는것
ex> public <T extends Number> 리턴타입 메서드(매개변수..){}
위처럼 선언되면,Number타입의 하위 타입으로 타입이 제한되어진다.
 */
public class GenericEx4 {

    public static <T extends Number> boolean compare(T t1, T t2){
        System.out.println("비교 :"+t1.getClass().getSimpleName());
        System.out.println(t2.getClass().getSimpleName());

        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();

        return (v1==v2);
    }



    public static void main(String[] args) {

        boolean result1=compare(10,20);
        System.out.println(result1);

        boolean result2=compare(1.5,1.5);
        System.out.println(result2);
    }
}