package quiz01;

import java.util.Scanner;

public class Quiz05 {
public static void main(String[] args) {
	//스캐너 + if문제
	//1. 양의 정수를 입력 받아 짝수라면  "x는 짝수 입니다."
	//홀수 라면 "x는 홀수 입니다"를 출력하세요.
	//2. 0이라면 "0입니다."
	//3. 음수 라면 "음수 입니다."를 출력하세요
	
	Scanner scan = new Scanner(System.in);
	System.out.println("정수를 입력하세요");
	System.out.print(">");
	int num1 = scan.nextInt();
	//조건의 순서를 제외해줘야할 사항부터 찾지 않으면 제대로 나오지 않는다!(else if 사용)
	//0이랑 음수 먼저 생각해야함 왜냐면, -4 % 2 = 0이기 때문에 위에서 먼저 걸러주는게 낫다.
	
	//양수 or 음수	
	if(num1 >= 0	) { //양수
		if(num1==0) {//0
			System.out.println("0입니다");
		}else if (num1 % 2 ==0) { //짝수
			System.out.println(num1+"은 짝수 입니다");
		}else { //홀수
		System.out.println(num1+"홀수입니다.");
	}
	}else {
		System.out.println(num1 + "은(는) 음수 입니다.");
	}
	
	scan.close();
	
	
	
	
	//(아래는 내가 푼 것)
	//if(num1 ==0) {
	//	System.out.println("0입니다 ");
	//} else if (num1%2==1){
	//	System.out.println(num1 +"은 홀수 입니다 ");
	//} else if(num1%2==0){
	//	System.out.println(num1 + "은 짝수 입니다.");
	//} else(num1<0){
	//	System.out.println(num1 + "은(는) 음의 정수입니다");
	//}
			

	
}
}
