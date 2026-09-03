package day02;







//계좌클래스 정의
class Account {
	private int balance; //잔액 필드
	
	public int getBalance() {
		return this.balance;
	}
	private boolean isNegative(int money) {
		return money < 0 ? true :false;
	}
	
	public  void deposit(int money) {
		if(isNegative(money)) {
			System.out.println("인출을 이용해 주세요  ");
			return;
		}
		this.balance+=money;
		
	}
	
	public int withdraw(int money) {
		if(isNegative(money)) {
			System.out.println("잘못된 인출 금액입니다. ");
			return 0;
		}
		if(money> this.balance) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
		
		this.balance-=money;
		return money;
	}
}




public class UseStudent {

	public static void main(String[] args) {
		Student me = new Student("김진헌 ","1002","IT",true);
		Student friend = new Student("김진헌 ","1002","IT",true);
		System.out.println(me.getName());
		System.out.println(friend.getName());
		
		Account mine = new Account();
	
		mine.deposit(-100);
		System.out.println(mine.getBalance());
		
		
//		mine.balance=-100;
//		System.out.println(mine.balance);
	}

}
