package quiz01;

import java.util.Scanner;

public class Quiz23 {
public static void main(String[] args) {
		//scanner+while+switch+if+break
//		1. scanner를 이용하여 금액을 입력 받으세요.
//		2. 음료수를 선택하면 금액에서 차감하세요.(반복문 switch)
//		3. 금액이 부족하다면"금액이 부족합니다"를 출력하세요
//		4. 4를 입력 받으면 반복문을 종료하세요.
	Scanner scan = new Scanner(System.in);
	System.out.print("금액을 투입해 주세요>");
	int money = scan.nextInt();
	//boolean flag = false; // 탈출을 위한 변수
	
	ex:while(true){
	System.out.println("남은금액 : " + money + "원");
	System.out.println("[1]데미소다 : 400원, [2]밀키스 : 500원, [3]코카콜라 : 600원, [4] 잔돈받기");
	System.out.print("음료수 선택>");
	int select = scan.nextInt();
	switch(select) {
	case 1 : if(money>=400) {
		System.out.println("데미소다를 받았습니다");
		money-=400;} 
	else {System.out.println("금액이 부족합니다. 돈을 넣어 주세요!");
	}
	break;
	
	case 2 : if(money>=500) {
		System.out.println("밀키스를 받았습니다.");
		money-=500;} else 
		{System.out.println("금액이 부족합니다. 돈을 넣어 주세요!");
		}
	break;
	case 3 : if(money>=600) {
		System.out.println("코카콜라를 받았습니다.");
		money-=600;} else {
		System.out.println("금액이 부족합니다. 돈을 넣어 주세요!");
		}
	break;
	case 4 : 
		System.out.println("남은 금액 "+money+"를 반환합니다");
	//	flag = true;
		break ex;
	default : 
		System.out.println("잘못 입력 했습니다");
		System.out.println("메뉴를 정확히 입력하세요");
		break;
	}
	//if(flag) break;	//true라면 탈출. -> 끝내려고
	
	System.out.println();
	}
	scan.close();
}
}
	

