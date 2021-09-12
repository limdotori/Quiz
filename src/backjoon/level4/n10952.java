package backjoon.level4;

import java.util.Scanner;

public class n10952 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	while(true) {
		int a=scan.nextInt();
		int b=scan.nextInt();
			if(a==0&&b==0) {
				scan.close();
				break;
			}
			System.out.println(a+b);	
		}
	}
}