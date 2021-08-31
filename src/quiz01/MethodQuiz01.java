package quiz01;

import java.util.Arrays;

public class MethodQuiz01 {
public static void main(String[] args) {
	
		method1();
		String m2=method2(1,3,"가");
		System.out.println(m2);
		
		double m3=(method3(1,2,3));
		System.out.println(m3);
		
		String m4=(method4(7));
		System.out.println(m4);
	
		method5("가",4);
		System.out.println();
		
		int m6=maxnum(1,5);
		System.out.println(m6);
		
		System.out.println(abs(-7));
		
		char[]cArr= {'a','p','p','l','e'};
		String result3=method06(cArr);
		System.out.println(result3);
		
		int[]aArr= {1,2,3,4,5};
		int result4=method7(aArr);
		System.out.println(result4);
		
		String[]sArr= method8("a","b");
		System.out.println(Arrays.toString(sArr));
		
}
	static void method1() {
		System.out.println("안녕");
	}

	static String method2(int start, int end, String a) {
			String str = "";//문자 누적은 공백초기화가 좋다
			for(int i = start; i<=end;i++) {
				str +=a;}
			return str;	
		}
	
	static double method3(int x, int y, double z) {
		return (x+y+z);
		
	}

	static String method4(int j) {
		if(j%2==0) {
			return "짝수";
		}else { return "홀수";
			}
	}
	
	static void method5(String b, int c) {
		for(int i =1;i<=c;i++){
			System.out.print(b);	
		}
	}
		
	static int maxnum(int i, int j) {
		if(i>=j) {
			return i;
		} else {return j;}
		//return a>= b? a: b;
		//return a==b?0:(a>b?a:b); ->완전간략한표현
	}

	static int abs(int s) {
		if(s<0){
			return -s;
		}else {return s;
				}
	}

	static String method06(char[] arr) {
	String s ="";
	for(char c : arr ) {
		s+=c;
		}
		return s;
	}
	
	static int method7(int [] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	static String[]	method8(String a, String b) {
		String[]sArr= {a,b};
		return sArr;
		
		}
	
}
