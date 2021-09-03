package personal_trainning;

import java.util.Scanner;

public class quiz11_3 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("입력값 a : ");	
	int a = scan.nextInt();
	System.out.println("입력값 b : ");	
	int b = scan.nextInt();
	
	int max =a>b?a:b; 
	int min =a<b?a:b;
	
	int result = 0;
	while(min<=max) {
		result=result+min;
				min++;
	}
	System.out.println(result);
}
}
