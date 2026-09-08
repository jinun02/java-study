package day03;

//Dog 는 Animal의 한 종류이므로 상속을 통해 Dog부모의 기본 기능을 물려받고
// Dog 이 가지고 있는 속성과 기능을 추가한다.

import day04.Flyable;

/*
추상 클래스를 상속한 자식 클래스는 추상 메서드를 반드시구현 하거나
자신이 추상 클래스로 선언 되어야한다.
 */
public class Dog extends Animal  {
    private String name;
    private String breed;

    public Dog(String name, String breed){
        super("개","태생"); // 부모생성자의 객체를 나타낼때.
        this.name=name;
        this.breed=breed;
    }

    @Override
    public void sound(){
        System.out.println("멍멍");
    }

    @Override
    public String toString() {
        return "이름은"+name+"품종은"+breed;
    }
}
