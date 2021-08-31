package quiz08;

public class SuperSonicAp extends Airplane {
//SuperSonicap에 밑줄이 그어져있으면, 부모에 기본생성자가 없어서 그렇다.
	//반드시 매개변수를 받아서 실행을 시켜야한다면 무조건 해당 생성자를 생성해서 식을 작성하게 쓸수도 있다.

	
	/* ************부모클래스는 수정하지 않습니다***********
	 * 1. Airplane을 상속받습니다. 생성자는 이름을 받아서 초기화 하도록 생성하세요
	 * 2. flyMode int형 변수를 선언하세요
	 * 3. fly() 메서드를 오버라딩합니다
	 * 	  fly() 메서드 안에서는 flyMode가 1이라면 "고속 모드로 비행합니다" 출력
	 *          flyMode 0이라면, super를 통해 부모님의 메서드를 호출
               4. info() - 부모의 메서드를 이용해서, 비행기의 이름을 반환하는 메서드
	 */
	SuperSonicAp(String name){
		super(name);
	} //부모 제일 첫줄과 이름 같게해서!
	
	int flyMode =0;
	
	//오버라이딩
	void fly() {
		if(this.flyMode==1){//this 안붙여도 된다.
			System.out.println("고속 모드로 비행합니다");
		} else {
			super.fly();
		}
	}
	//이부분 이해 잘 안감
		String info(){
		return super.getName();}
		
	
}






