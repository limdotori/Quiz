package quiz03;

public class StudentMain {
public static void main(String[] args) {
//	Student 클래스를 생성한다
//	1. Student class는 이름, 학생번호, 국어점수, 영어점수, 수학점수를 가지고있다
//	2. 3개과목 점수의 총합을 반환하는 메서드를 생성하라
//	3. 3개과목 점수의 평균을 반한하되 소수점 아래 2자리까지 출력하라
//	4. 이를 생성하여 실행하라
	
	Student stu=new Student("노홍철",10,63,90,100);
	
	System.out.println("-----"+stu.name+"----");
	System.out.println(stu.getTotal());
	System.out.println(stu.getAvg());
	
	Student stu1=new Student("유재석",11,72,60,80);
	System.out.println("-----"+stu1.name+"----");
	System.out.println(stu1.getTotal());
	System.out.println(stu1.getAvg());
	
	System.out.println("평균합:"+(stu1.getAvg()+stu.getAvg()));
			
}
}
