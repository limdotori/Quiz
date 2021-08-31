package quiz01;

import java.util.Scanner;

public class Quiz18 {
public static void main(String[] args) {
	
	/*
	 * 가로,세로를 입력 받아서 직사각형을 출력합닏.
	 * 단, 윤곽만 출력하면 됩니다.
	 * 힌트 먼저 사각형을 만들고, 첫행, 마지막행, 첫열, 마지막열에만 출력을 하면 된다.
	 * 와 개어려웡.. 헷갈린다
	 */
	Scanner scan = new Scanner(System.in);
	
	System.out.print("가로>");
	int w = scan.nextInt();
	
	System.out.print("세로>");
	int h = scan.nextInt();
	
	for(int i = 1; i<=h;i++) {
		for	(int j = 1; j<=w;j++) {;
			if(i==1||i==h) {//첫행과 마지막행
				System.out.print("*");
			} else {//나머지행
				if(j==1||j==w) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
		}
	System.out.println();
	}
	}
}