package quiz04;

public class DmbPhone extends Phone{
	//DmbPhone은 Phone클래스를 상속 받습니다.
	//channel 변수를 생성하고, color, model, channel을 초기화 하는 생성자를 작성하세요.
	//메인메서드가 정상적으로 실행되도록 메서드를 추가하세요.
	//(main class를 보고서 판단하면 된다) 폰같은 경우는 그냥 상속받는거니까 상속받는 걸로 끝.
	//생성자는 상속이 되지 않는다.
	int channel;
	
	DmbPhone(String pname,String pcolor,int pch){
		model=pname;
		color=pcolor;
		channel=pch;
	}
	void turnOnDmb() {
		System.out.println("TV를 켭니다");
	}

	void changeChannel(int aa) {
		channel=aa;
		System.out.println("채널:"+aa+"번");
		//다른방식
//		System.out.println("변경된 채널:"+channel);
//		return channel;
		
	}
	void turnOffDmb() {
		System.out.println("TV를 끕니다");
		}
	

}
