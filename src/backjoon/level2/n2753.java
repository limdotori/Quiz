package backjoon.level2;

import java.util.Scanner;

public class n2753 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int a = scan.nextInt();
	
	if(a%4==0) {
	if(a%400==0) System.out.println("1");
		else if (a%100==0) System.out.println("0");
		else System.out.println("1");
	}
	else System.out.println("0");
scan.close();
}
}
//System.out.println((a%4==0)?((a%400==0)?"1":(a%100==0)?"0":"1"):"0");