package quiz01;

public class Quiz14 {
public static void main(String[] args) {
	
	//1. 랜덤수 2~9랜덤 정수를 만들고, 구구단 출력
	int dan = (int)(Math.random()*8)+2;
	//0부터가 아니라 2부터인거를 생각하기
	System.out.println("구구단"+dan+"단");
	
	for(int i = 1; i<=9; i++) {
		System.out.println(dan + "X"+i+"="+dan*i);
		//형식지정을 해주는 prinf 구문으로 예시를 들어보자
		//System.out.printf("%dX%d=%d \n",dan,i,dan*i);
	}
	
	//2. 50~100까지 두 수 사이의 있는 값의 합.
	int sum = 0;
	for(int a=50;a<=100;a++) {
		sum+=a;
	}
	System.out.println("합계 :"+ sum);
	
	//3. A~Z까지 문자를 가로로 출력 (A=65, Z=90)
	for(char z='A';z<=90;z++) {
		System.out.print(z+", ");
	}
	System.out.println();
	//4. 200까지 정수 중의 if문을 사용하지않고 짝수만 출력.
	
	for(int x = 2;x<=200;x+=2) {
		//시작은 0에서하고, 점핑을 2씩한다고 생각하면 가능 x=x+2 / x+=2와 같다.
	 System.out.print(x+", ");
	}
	
}
}
