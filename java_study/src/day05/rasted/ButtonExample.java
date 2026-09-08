package day05.rasted;

public class ButtonExample {
    public static void main(String[] args) {
    Button buttonOk=new Button();

    // 위 버튼의 이벤트를 처리할때 clickListener 구현 클래스를 로컬로 정의한다.
        class OkListener implements Button.ClickListener{
            @Override
            public void onClick(){
                System.out.println("OK버튼을 눌렀음.");
            }
        }
        //리스너를 버튼에 set합니다.
        buttonOk.setClickListener(new OkListener());

        buttonOk.click();
    }
}
