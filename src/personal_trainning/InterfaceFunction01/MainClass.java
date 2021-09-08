package personal_trainning.InterfaceFunction01;

public class MainClass {
public static void main(String[] args) {
	
	Inter1 b1 = new Basic();
	
	b1.method1(); //오버라이딩 된 메서드
	// b.method2(); //불가능 why? 부모클래스가 인터1이라
	
	Inter2 b2 = new Basic();
	b2.method2();

	Basic bb = new Basic();
	bb.method1();
	bb.method2();
	
	System.out.println("-------------------------");
	
	Basic bbb = (Basic) b1; //내자신으로 돌아왔으니까! -> 클래스 casting가능
	bbb.method1();
	bbb.method2();

	//상수
	System.out.println(Inter1.PI);
	System.out.println(Inter2.ABC);
	
}
}
