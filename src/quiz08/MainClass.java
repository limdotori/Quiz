package quiz08;

public class MainClass {
public static void main(String[] args) {
	
	SuperSonicAp ap = new SuperSonicAp("떳다떳다비행기"	);
	ap.takeOff();
	ap.fly(); //오버라이딩된 메서드
	ap.flyMode=1;
	ap.fly();
	ap.land();
	System.out.println("이름:"+ap.info());
	
	//메서드 반환유형 위치
	
	
}
}
