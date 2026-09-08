package day03;

class Counter{
    //인스턴스 변수 선언.. 이 변순ㄴ 객체가 생성될때마다 복제되어간다.
    int instanceCount=0;
    //static 필드선언.. 이 변수는 클래스가 로딩되는 시점에 딱 한번
    // 초기화 되며 모든 객체가 공유가능하다

    static int staticCount=0;
    public Counter(){
        this.instanceCount++;
        Counter.staticCount++;
    }
    public static void printStaticCount(){
        System.out.println("총 Counter 객체 수(static) : "+staticCount);


    }
}


public class StaticExam {
    public static void main(String[] args) {
        Counter.printStaticCount();

        System.out.println();
        Counter c1=new Counter();
        System.out.println(c1.instanceCount);
        System.out.println(Counter.staticCount);

        Counter c2=new Counter();
        System.out.println(c2.instanceCount);
        System.out.println(Counter.staticCount);
    }
}
