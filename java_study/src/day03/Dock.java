package day03;

//Dog 는 Animal의 한 종류이므로 상속을 통해 Dog부모의 기본 기능을 물려받고
// Dog 이 가지고 있는 속성과 기능을 추가한다.
public class Dock extends Animal {
    private String name;
    private String breed;

    public Dock(String name, String breed){
        super("오리","난생"); // 부모생성자의 객체를 나타낼때.
        this.name=name;
        this.breed=breed;
    }

    @Override
    public void sound(){
        System.out.println("꽥꽥");
    }

    @Override
    public String toString() {
        return "이름은"+name+"품종은"+breed;
    }
}
