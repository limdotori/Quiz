package quiz01;

import java.util.Scanner;

public class Quiz06 {
public static void main(String[] args) {
	/*스캐너 + if
	 * 정수를 3개 순서대로 입력받습니다.
	 * 가장 큰값, 중간값, 가장 작은 값을  
	 * max, mid, min 변수에 저장하고 출력하면 됩니다.
	 */
	Scanner scan = new Scanner(System.in);

	
	System.out.print(">");
	int num1 = scan.nextInt();
	
	System.out.print(">");
	int num2  = scan.nextInt();
	
	System.out.print(">");
	int num3 = scan.nextInt();
	
	int max = 0, mid = 0, min = 0;
	if(num1 > num2 && num1 > num3) { //num1이 제일 클 때
		max = num1;
		if(num2 > num3) {
			mid = num2;
			min = num3;
			} else {
				mid = num3;
				min = num2;
			}
	} else if (num2 > num1 && num2 > num3) {//num2이 제일 클 때
		max = num2;
		if(num1 > num3) {
			mid = num1;
			min = num3;
			} else {
				mid = num3;
				min = num1;}
	} else if (num3 > num1 && num3 > num2) {//num3이 제일 클 때
		max = num3;
		if(num1 > num2) {
			mid = num1;
			min = num2;
			} else {
				mid = num2;
				min = num1;}
	}
	System.out.println("큰값 : " + max + ", 중간값 : " + mid + ", 최소값 : " + min);
	scan.close();
	

		}
}