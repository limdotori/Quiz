package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz13 {
public static void main(String[] args) {
	// 배열 + while
	//1. 큰 금액부터 거슬러서 몇개가 나오는지 출력하기.
	//몫과 나머지를 적절하게 구해서 문제 풀면 된다.
	//
	int[] arr = {1000, 500, 100, 50, 10};//동전
	int money = 17520; //금액	
	
	System.out.println("금액 : "+money+"원");
	
	int i = 0;
	while(i<arr.length) {
		System.out.println(arr[i]+"원 : " +money/arr[i]);
		money %= arr[i];//나머지로 치환 
		//위의 식을 풀어보면, (money = money / arr[i]{1000,500,100,50,10})
		i++;
	}	
	
	//2. 양수를 입력 받아, 입력 받은 수 크기의 배열을 생성하세요.
	//배열에 1~입력 받은 수 까지 차례대로 값을 넣으세요.
	Scanner scan = new Scanner(System.in);
	
	System.out.print("수를 입력하세요 ->");
	int size = scan.nextInt();
	int[] ar=new int[size]; //배열생성
	
	int a=0;
	while(a<size) {
		ar[a]=a+1;
		a++;
	}
	
	System.out.println(Arrays.toString(ar));
	scan.close();
}
}
