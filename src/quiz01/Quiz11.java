package quiz01;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
	

	//1. 1~100까지 정수 중에 3의 배수이거나, 4의 배수일 경우에 가로로 출력
	
	int a = 1;
	while(a<=100) {
		if(a%3 ==0 || a%4==0)  //if물의 조건이 한 줄이라면 중괄호 생략 가능하다.
		System.out.print(a+", ");
	
		a++;
	}
	
	System.out.println(); //개행 (줄나누기)
	
	//2. 1~200까지 정수 중 5의 배수의 합. (다시 보기)
	int sum = 0;
	int aa = 1;
	while(aa<=200) {
		if(aa%5==0) {
			sum+=aa; //여기 주의해서 보기
		}
		aa++;
	}
	System.out.println("2"
			+ "00까지 5의 배수의 합 :" + sum);

	
	//3. 1~200까지 정수 중에서 4의 배수 이면서, 8의 배수가 아닌 수의 개수
	int count = 0;
	int d=1;//0이 아니라 1부터 200이니까 1이 들어가야한다.
	while(d<=200) {
		if(d%4==0 && d%8!=0) {
			count++;
		}
		d++;
	}
	System.out.println("200까지 정수 중 4의 배수이며, 8의 배수가 아닌 수의 개수:"+count);
	//4. 두 정수를 입력받아서 두 정수 사이의 합 (같은 경우는 없다고 가정) (큰 수 작은 수 이런거 없다)
	//입력값 : 5,1 -> 출력값: 1+2+3+4+5=15
	//큰 수, 작은 수 먼저 구별 -> 반복문
	//3항 연산자 대신 if else구문을 써도 된다.
	//3항 연산자 공부다시하기..
	
	Scanner scan = new Scanner(System.in);
	System.out.print(">");
	int num1 = scan.nextInt();
	System.out.print(">");
	int num2 =scan.nextInt();
	
	int max = num1 > num2 ? num1: num2;
	//num1이 num2보다 클 때, num1은 max에 넣는다.
	int min = num1 < num2 ? num1 : num2;
	//num1이 num2보다 작을 때, num1은 min에 넣는다.? 헷갈림.
	
	//min < = max / min++ 로 가는게 일반적으로 좋다고 생각
	int result = 0;
	while(min <= max) {
		result += min;	
		min++;		
	}
	System.out.println("두수의 합 : "+result);
	

}
}
