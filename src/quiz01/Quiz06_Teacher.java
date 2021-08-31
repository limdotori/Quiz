package quiz01;

import java.util.Scanner;

public class Quiz06_Teacher {
public static void main(String[] args) {
	
	//간단하게 표현하려면
	Scanner scan = new Scanner(System.in);
	
	
	System.out.print(">");
	int num1 = scan.nextInt();
	
	System.out.print(">");
	int num2  = scan.nextInt();
	
	System.out.print(">");
	int num3 = scan.nextInt();
	
	int max = 0, mid = 0, min = 0;
		if(num1>num2&&num1>num3){
		max=num1;
		if(num2>num3){
			mid = num2;
			min = num3;
		} else {
			mid=num3;
			min=num2;
		} 
		} else if(num2 > num1 &&num2>num3){
		max=num2;
		if(num1>num3) {
			mid= num1;
			min = num3;
		}else {
		mid=num3;
		min=num1;
		}
		}else {
			max=num3;
			if(num2>num1) {
				mid=num2;
				min=num1;
			}else {
				mid=num1;
				min=num2;
			}
		}
		System.out.println("max :"+max+", mid:"+mid+",min: "+min);
		scan.close();
		
}
			
}

