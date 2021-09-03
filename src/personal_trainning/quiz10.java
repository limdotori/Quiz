package personal_trainning;

import java.util.Scanner;

public class quiz10 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("구구단 단수를 입력하세요 : ");
	int num = scan.nextInt();
	
	System.out.println("랜덤 구구단 : "+num+"단");
	System.out.println("===============");
	
	int a=1;
	while (a<=9) {
		System.out.println(num+"x"+a+"="+a*num);
		a++;
	}
	
}
}
