package day05;
// 사용자 예외 정의하는 방법.. 일반적으로 Exception 클래스를 상속 받아서
// 예외메세지를 전달하는 방식으로 처리함.
class WithdrawException extends Exception {

    public WithdrawException(){

    }
    public WithdrawException(String message){
        super(message);
    }
}
class Account2{
    private long balance;
    public Account2(){

    }
    public long getBalance(){
        return balance;
    }
    public void deposit(int money){
        balance+=money;
    }
    public void withdraw(int money)throws WithdrawException{
        if(balance<money){// 잔액부족 예외가 발생함.
            // 사용자 정의 예외를 직접 던져서 프로그램을 종료시킴
            throw new
                    WithdrawException("잔고부족 : "+(money-balance)+"모자람");

        }
    }
}

public class UserExceptionEx extends Exception {
    public static void main(String[] args) {
        Account2 account2 = new Account2();
        account2.deposit(10000);
        System.out.println("잔액 : "+account2.getBalance());

        // 출금하기.. 일부로 예외상황을 유발한다.
        try {
            account2.withdraw(30000);
        }catch (WithdrawException e){
            // 던져진 예외를 여기서 잡아서 예외내용을 출력해본다.
            String message = e.getMessage();
            System.out.println(message);
        }

    }
}
