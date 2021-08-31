package quiz01;

import java.util.Arrays;

public class MethodQuiz02 {
	public static void main(String[] args) {
		String st=java(7);//문자붙이기
		System.out.println(st);//약수의합
	
		System.out.println(sum(5));
		
		System.out.println(primeNum(5));
		
		System.out.println("7~9사이의 수의 합:"+sumNum(7,9));
		System.out.println("7~9사이의 수의 합:"+sumNum(9,7));
		System.out.println("7~9사이의 수의 합:"+sumNum(5,5));
		
		System.out.println(sumSum(10230543));
		
		int[] arr = seat(10);
		System.out.println(Arrays.toString(arr));
	}
//	1. java함수는 매개변수로 숫자를 받습니다.
//	매개변수 숫자길이만큼 패턴"자바자바자바..."를 리턴 하는 함수를 완성하세요
//		1이면 자	
//		2이면 자바
//		3이면 자바자	
//		4이면 자바자바
	static String java(int a) {
		String str = "";
			for(int i = 1;i<=a;i++) {
				if(i%2==0) {str+="바";}
				else {str+="자";}
		//str=i%2==1?(str+="자"):(str+="바");
			}
		return str;
}
	
//	2.자연수 n을 입력 받아 n의 약수를 모두 더한 값을 리턴 하는 함수를 완성하세요.
	static int sum(int b) {
		int sum=0;
		for(int i=1;i<=b;i++) {
			if(b%i==0) sum+=i;
			}
		return sum;
		}		
	
// 3. 1부터  입력 받은 숫자 a 사이에 있는 소수의 개수를 반환하는 함수 primeNum을 완성하세요.
//	소수는 1과 자기 자신으로 나누어지는 수(1은 소수가 아닙니다.) 
	// 소수관련 문제는 for중첩이 무조건 가능
	static int primeNum(int c) {
	int num=0; //소수의 개수를 저장할 변수
		for(int i=1;i<=c;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0)count++; //약수의 개수를 저장할 변수
			} //for j
		if(count==2) num++;
	}//for i
	return num;
}
// 4. sumNum은 매개변수 2개를 받습니다.
//	두 매개변수 사이에 속한 모든 정수의 합을 구하는 sumNum을 완성하세요.
//	두 매개변수 크기는 정해지지 않았습니다.
	static int sumNum(int a,int b) {
		int sum=0;
		int max=a>b?a:b;
		int min=a<b?a:b;
		
		for(int i = min;i<=max;i++) { //같은 수 일 때는 자동으로 한 번만 돈다.
		sum+=i;	
		}
		return sum;
		}//삼항연산방식으로 풀어보자.

	/*5.
	 * 자연수 자리의 합 구하기
	 * 자연수 n이 매개변수로 주어지면 n자리수의 합을 구해서 return하는 메서드
	 * 조건
	 * n은 1억 이하의 자연수
	 * n은 자료형을 바꾸면 안됩니다.
	 * 
	 * ex)10230543->18
	 */
	static int sumSum(int a) {
		int sum1=0;
		for (int i = 100000000; i>=1;i/=10) { //한자리수씩 줄임.
			if(a/i!=0) {//몫이 있는 경우
				sum1+=(a/i); //몫을 구해서 누적
				a%=i;
			}
		}
		return sum1;
	}

	/* . 정수를 매개변수로 받아서,
	 * 1~매개변수 까지의 값을 배열에 랜덤하게
	 * 넣어서 반환해주는 함수 seat을 생성하세요.
	 * 
	 * 조건
	 * 1. 숫자는 중복되지 않습니다.
	 * 2. swap을 이용하지 않습니다.
	 * 
	 * 입력 5
	 * 출력 - [1~5가 랜덤하게 섞여있는 길이가 5인 배열]
	 * 
	 * 입력10
	 * 출력 - [1~10가 랜덤하게 섞여있는 길이가 10인 배열]
	 */
	
	/*
	 * swap으로는 중복되지않게 하기 어렵다.
	 * 배열에 값을 집어 넣기 전에, 그 앞자리까지 5가 있는지 확인해보면된다.
	 * 바깥에서나오는 반복문은 몇 번 중복인지는 회전수가 계속 달라질 것이다.
	 * while문을 사용해서 바깥, 안쪽은 집어넣기전 인덱스까지 하나씩 찾아보면 된다.
	 * 
	 */
	static int[] seat(int size)	{//매개변수 size로 하자!
		int[]arr=new int[size];//사이즈만한 크기의 arr이 필요하다.
		int index = 0;
		
		start:while(true) { //돌아갈때마다, 랜덤한 값이 들어가는게 필요하다.
			int ran = (int)(Math.random()*size)+1;//이부분이 이해가 잘안간다.
			//중복검사
			for(int i = 0;i<index;i++	) {
				if(arr[i]==ran) {
					continue start;
				}
			}
			arr[index]=ran;
			index++; //이렇게 까지만 하면, 중복값이 나온다. //중복검사로 가기
			
			if(index==size) break;//탈출
		}
		
		
		
		return arr; 
	}
	
	
	
	
	
}	
