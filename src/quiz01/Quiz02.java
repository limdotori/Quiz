package quiz01;

public class Quiz02 {
public static void main(String[] args) {
	
	//1. 1~100까지 랜덤한 수를 만들고 짝, 홀수를 판별
	
	int r = (int)Math.random() *100+1 ;
	//100+1하는거 헷갈림 (다시 확인하기)	 
	System.out.println("랜덤값:"+r);
	System.out.println(r%2==0 ? "짝수":"홀수" );
	
	//2. -5~5까지 랜덤한 수를 만들고, 절댓값으로만 출력해주세요
	int r2 = 5-((int)(Math.random()	* 11));
	System.out.println("랜덤값"+r2);
	System.out.println("절대값" +(r2 < 0? -r : r2));
	
	//3.
	//1~150까지 랜덤한 수를 사과의 개수로 가정.
	//bucket은 사과를 담을 수 있는 양
	//ex) 사과 148개 15개, 사과 150개? 15개

	int bucket = 10;
	int apple= (int)(Math.random() *150)+1 ;// math와 150뒤까지의 괄호 주의할 것
	//사과 / 바구니를 했을 때 나머지가 0이라면 딱 떨어지니까, 몫을 가져가면 되는 것.
	//사과 / 바구니를 했을 때 나머지가 1이라면 몫 + 1을 해서 나머지값 나온 것 까지 포함 시킬 수 있어야 한다.
	
	System.out.println("사과의 개수 : " + apple);
	System.out.println("필요한 바구니의 개수 : " 
	+ (apple % bucket ==0? apple / bucket: apple / bucket +1));
	
}
}
