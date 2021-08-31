package quiz09;

public class User {
	
private String name;
private int rrn;
private int age;

public User() {
}
//자동완성 좋지만, 완벽하게 공부하려면 직접 쓰는 버릇을 들이는게 낫다.
//모든 멤버변수를 초기화하는 생성
public User(String name, int rrn, int age) {
	super();
	this.name = name;
	this.rrn = rrn;
	this.age = age;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRrn() {
	return rrn;
}
public void setRrn(int rrn) {
	this.rrn = rrn;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
//----------------------------------

 int []arr = new int[2];
 	
}
