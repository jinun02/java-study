package day05.rasted;
/*
중첩인터페이스 : 클래스의 멤버로 선언된 인터페이스를 말함./
인터페이스를 내부에 선언한 이유는 클래스와 긴밀한 관계를 맺는 구현 갹체를 만들기 위함임.
인터페이스선언은 public|private|static interface INter{
상수, 추상메ㅓ드, 디폴트메서드, 정적 메서드}형태로 정의가능함
 */
public class Button {
    public static interface ClickListener{
        void onClick();
    }
    //필드선언
    private  ClickListener clickListener;
    public void setClickListener(ClickListener clickListener){
        this.clickListener=clickListener;
    }
    public void click(){
        //버튼이 클릭되었을때 생성되는 메서드 선언
        this.clickListener.onClick();
    }
}
