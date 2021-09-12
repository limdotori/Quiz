package backjoon.level3;

import java.util.Scanner;

public class n2741 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
  
  int n =scan.nextInt();
  if(n<=100000){
  for(int a=1;a<=n;a++){
    System.out.println(a);
  }
}
  scan.close();
}
}

