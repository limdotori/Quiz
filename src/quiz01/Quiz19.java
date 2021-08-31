package quiz01;

import java.util.Scanner;

public class Quiz19 {
public static void main(String[] args) {
	//난이도 상
	//1. 정수를 입력 받으세요
	//2. 2중 for문을 이용하여 입력 받은 수 까지 소수들의 합을 구하세요.
	//3. 힌트)입력 받은 수까지 반복, 내부 for문에서 외부 for문의 수까지 반복(
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("정수를 입력하세요 : ");
	int num = scan.nextInt();
	int sum = 0; //합을 누적할 변수
	//약수의 개수를 판별
	for(int i = 1; i<=num;i++) {
		int count=0; //약수의 개수를 판별(값을 판별하기 전에 카운트값 초기화)
		//i값을 판별
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
			count++;
			}
		} 
		if(count==2) {//i의 약수의 개수가 2개 이므로 i는 소수이다.
			sum+=i;
			
		}
	} //여기서 한사이클이 끝나고 i가 올라가고, jrk 2가 되고 한다)
	System.out.println("1에서"+num+"까지합:"+sum);
	
	//System.out.println(num+"까지 소수의 합은 :"+sum);
	
}
}
