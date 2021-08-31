package quiz01;

import java.util.Scanner;

public class Quiz22_change {
public static void main(String[] args) {
// 무한반복문 + 스캐너 
//	1. 두 수의 더하기를 맞추는 문제를 지속적으로 출제하는 프로그램입니다.
//	2. 2가지의 정수를 1~100사이의 난수를 발생 시켜 지속적으로 문제를 출제한 후 정답이면
//	정답 카운트를 +1 씩, 틀리면 오답 카운트를 +1씩 올려주는 프로그램을 만드세요.
//	또한 이 프로그램은 0을 입력 받으면 반복을 중단(탈출) 합니다.
//	+와 함께 - 문제도 같이 출제된다면, 어떻게 문제를 풀어야하는지 생각하기
	
	Scanner scan = new Scanner(System.in);
	int counto=0;//while문 밖에 넣어야 하는 것 주의하기.
	int countx=0;
		
	while(true) {
		int a = (int)(Math.random()*2);
		int num1 = (int)(Math.random()*100)+1; //위치 잘못들어가면 같은 숫자가 반복해서 나올 수 있다.
		int num2 = (int)(Math.random()*100)+1;
		//0~100이면 101곱하고, 1~100이면 100 곱하고 + 1
		System.out.println("------------------");
		//System.out.println(num1+(a==1?"+":"-")+num2+"= ?"); 삼항 연산으로 푸는 방법
		if(a==1) {
			System.out.println(num1+" - "+num2+" = ?");
		} else {System.out.println(num1+" + "+num2+" = ?");
		}
		System.out.println("문제를 그만 푸시려면 0을 입력하세요.");
		System.out.print(">");
		int answer = scan.nextInt();
		
		//int result = (oper ==1? num+num2:num-num2);
		//if(answer==0 && result!=0)break;
		if(answer==0) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		if(answer==num1+num2&&a!=1) {
			System.out.println("정답입니다.");
		counto++;
		} else if (answer==num1-num2&&a==1) {
			System.out.println("정답입니다.");
			counto++;
		} else {
			System.out.println("틀렸습니다");	
			countx++;}
		} 
	System.out.println("------------------");
	System.out.println("정답 횟수 : "+counto+"회");
	System.out.println("틀린 횟수 : "+countx+"회");
	scan.close();
	//선생님이 문제 푼 것, sysout
}
}
