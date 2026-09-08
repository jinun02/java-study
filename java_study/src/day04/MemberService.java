package day04;

public class MemberService {

	public boolean login(String id, String passwd){
		return id.equals("hong")&&passwd.equals("12345");
	}
	public void logout(String id, String passwd){
		System.out.println(id+"님이 로그아웃함");
	}

	public static void main(String[] args) {

	}

}
