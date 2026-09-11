package day07;

class NumberBox<T extends Number> {
    private T number;

    public NumberBox(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public double getDoubleValue() {
        return number.doubleValue();
    }
}


public class NumberBoxExample {
    public static void main(String[] args) {
        //아래의 코드가 수정되도록 NumberBox를 generic 을 구현하라
        NumberBox<Integer> intBox= new NumberBox(100);
        System.out.println("점수 출력 : "+intBox.getNumber());

        NumberBox<Double> doubleBox = new NumberBox(5.5);
        System.out.println("실수 소수점 반환 : "+doubleBox.getDoubleValue());

        // 아래는 컴파일 에러가 나와야 합니다.
        //NumberBox<String> strBox = new NumberBox("Hello Wolrd");
    }
}
