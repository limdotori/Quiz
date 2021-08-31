package quiz01;

import java.util.Scanner;

public class Quiz12 {
public static void main(String[] args) {
	//정수를 계속 입력하다가, "0"을 입력했을 때,
	//0을 입력하기 전까지의 정수들의 합 구하는 문제
	
	Scanner scan = new Scanner(System.in);
	int sum = 0;//합계변수는 while바깥에 만든다.
	
	int a = 1;
	while(a!=0) { //a!=0만 두면 무한히 돌아간다.
	System.out.print("정수입력>");
		a=scan.nextInt();
		sum+=a;	
	}
		System.out.println("합:"+sum);
	}
}
