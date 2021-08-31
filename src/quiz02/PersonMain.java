package quiz02;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1=new Person("홍길동",20,180);
		p1.info();
		
		System.out.println("=====================");
		
		Person p2=new Person();
		p2.age = 40;
		p2.name="김길동";
		p2.tall=170;
		
		//2. 일상생활에서 있을법한 사물 만들어보기
		Tv tv=new Tv();
		tv.power();
		tv.changeChannel(10); //채널 변경
		tv.info();
		
	}
}
