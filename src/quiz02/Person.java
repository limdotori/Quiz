package quiz02;

public class Person {
	String name;
	int age;
	int tall;
	//생성자를 직접 만들게 되면, 자바가 기본 생성자를 자동으로 생성하지 않습니다.
	//기본생성자
		Person(){
		}
	//생성자
	Person(String nname, int aage,int talll){
		name=nname;
		age=aage;
		tall=talll;
		//생성자를 직접 만들게 되면, 자바가 기본 생성자를 자동으로 생성하지 않습니다.
	}
	
	void info() {
	System.out.println(name);
	System.out.println(age+"세");
	System.out.println("키:"+tall);
	}	
}
