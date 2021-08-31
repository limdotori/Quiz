package quiz01;

import java.util.Scanner;

public class Quiz09 {
public static void main(String[] args) {
	//switch로 간략한 사칙연산이 가능한 프로그램
	Scanner scan = new Scanner(System.in);
	
	System.out.print("정수1>");
	int num1 = scan.nextInt();
	
	System.out.print("연산을 선택하세요[+, -, *, /}>");
	String str = scan.next();
	//연산자는 문자열로 받아야합니다.
	
	System.out.print("정수2>");
	int num2 = scan.nextInt();
	
	switch (str) { // 골라야하는 부분이 ()안에 들어가야 하는거 다시 상기하기.
	case "+":
		System.out.println("두 수의 덧셈은 : " +(num1+num2));
		break;
		
	case "-" :
		System.out.println("두 수의 뺼셈은 : " +(num1-num2));
		break;
		
	case "*" :
		System.out.println("두 수의 곱셈은 : "+(num1*num2));
		break;
		
	case "/" :
		System.out.println("두 수의 나눗셈은 : " + (	num1/num2));
		break;

	default:
		System.out.println("잘못 입력되었습니다.");
		break;
	}
}
}
