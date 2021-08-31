package quiz01;

import java.util.Scanner;

public class Quiz04 {
public static void main(String[] args) {
	//스캐너 + 문제
	
	//1. 정수 2개를 입력 받으세요.
	Scanner scan = new Scanner(System.in);
	System.out.println("정수입력");
	System.out.println(">");
	int num1 = scan.nextInt();
	
	System.out.println(">");
	int num2 = scan.nextInt();
	
	//2. 두 수를 비교해서 "x가 큰 수 입니다"를 출력, 
	//같은 수라면 "같은 수입니다"를 출력하세요.
	if(num1==num2) {
		System.out.println("같은 수 입니다");
	}else if (num1 > num2) {
		System.out.println(num1+ "이 큰 수 입니다");
	}else {
		System.out.println(num2 +"이 큰 수 입니다");
	}
	scan.close();
	}
}
