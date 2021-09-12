package backjoon.level3;

import java.util.Scanner;

public class n2742 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
  
	int n =scan.nextInt();
	if(n<=100000){
		for(int a=1;a<=n;n--){
			System.out.println(n);  
			}
		}
  scan.close();
	}
}