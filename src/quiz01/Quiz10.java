package quiz01;

import java.util.Scanner;

public class Quiz10 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("구구단 단수를 입력하세요 : ");
	int num = scan.nextInt();
	//num은 내가 콘솔에서 입력할 값
	System.out.println("랜덤 구구단 "+num+"단");
	System.out.println("---------------------------");
	
	int a = 1;
	while (a<=9) {
	System.out.println(num + "x" + a + "=" + num*a);
		
		a++;
	}
	
}
}
