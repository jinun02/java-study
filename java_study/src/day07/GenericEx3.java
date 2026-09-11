package day07;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
@Setter
@Getter
class Box<T>{
    private T obj;
}
public class GenericEx3 {
    /*
    제네릭 메서드: 타입파라미터를 가지고 있는 메서드를 말함
    타입파라미터는 메서드 선언부에 정의됨
    제네릭메서드는 리턴타입 앞에 <> 기호를 추가하고, 타입파라미터를
    정한뒤, 리턴타입과 매개변수 타입에서 사용됨
     */

    public static <T> Box<T> boxing(T t){
        Box<T> box = new Box<T>();
        box.setObj(t);
        return box;
    }

    public static void main(String[] args) {
        Box<Integer> box1= boxing(100);
        int value = box1.getObj();
        System.out.println(value);

        Box<String> box2 = boxing("hello word");
        String strValue = box2.getObj();
        System.out.println(strValue);
    }
}
