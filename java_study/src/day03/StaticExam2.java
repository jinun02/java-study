package day03;
class Circle{
    public static final double PI;
    static {
        System.out.println("static을 호출함");
        PI=3.14;
    }

    public Circle(){
        System.out.println("생성자 호출됨");
    }

    public static double getCircle(double r){
        r=100;
        return r*r*Circle.PI;
    }
}

public class StaticExam2 {
    public static void main(String[] args) {
//        double res = Circle.getCircle(10);
//        static{
//            System.out.println("내가먼저 실행됨");
//        }public static void main(String[] args){
//            System.out.println("main 호출됨");
//            new Circle();
//        }




    }

}