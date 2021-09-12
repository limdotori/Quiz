package backjoon.level3;

import java.util.Scanner;
public class n8393 {
public static void main(String[] args) {
	    
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	    
	int sum=0;
	for(int i=0;i<n;i++){
		sum+=(i+1);}
	     System.out.println(sum);
	   }
  }