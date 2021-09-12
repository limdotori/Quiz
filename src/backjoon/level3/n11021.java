package backjoon.level3;

import java.util.Scanner;

public class n11021 {
public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);

	int c = scan.nextInt();

	for(int i=1;i<=c;i++){
		int a = scan.nextInt();
		int b = scan.nextInt();    
		System.out.println("Case #"+i+": "+(a+b));
		}
	scan.close();
	}
}
