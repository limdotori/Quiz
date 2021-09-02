package backjun;

import java.util.Scanner;

public class n2884 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int H = scan.nextInt();
	int M = scan.nextInt();
	
	scan.close();
	
	if(M<45) {
		if(H==0) {
			H=23;
			M=60-(45-M);
		}else {
			H--;
			M=60-(45-M);
			}
		System.out.println(H+" "+M);
		} else {System.out.println(H+" "+(M-45));
		}
	}
}