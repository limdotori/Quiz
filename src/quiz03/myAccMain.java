package quiz03;

public class myAccMain {
public static void main(String[] args) {
	//멤버변수 - 예금주이름 name : String 비밀번호 password : String 잔액 balance : int
	//생성자 - 3가지 멤버 변수를 모두 매개값으로 받아 초기화 하는 생성자를 만들기
	//메서드 - 입금기능(deposit : void), 출금기능(withDraw : void), 잔액조회(getBalance : int)
	//아래와 같이 실행될 수 있도록 클래스를 만드세요.
	
	Account myAcc = new Account("홍길동","1234",3600);
	
	myAcc.deposit(800);
	myAcc.withDraw(1900);
	
	int bal=myAcc.getBalance();
	System.out.println(myAcc.name+"님의 계좌 잔액은:"+bal+"원입니다.");
}
}
