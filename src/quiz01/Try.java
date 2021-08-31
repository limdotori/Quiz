package quiz01;

import java.util.Arrays;

public class Try {
public static void main(String[] args) {
	method1();
	System.out.println(method2(1,3,"나"));
	System.out.println(method3(1,2,3));
	System.out.println(method4(7));
	method5("예",3);
	System.out.println();
	System.out.println(maxNum(2,5));
	System.out.println(abs(-2));
	
	char[]aArr= {'a','p','p','l','e'};
	String result=method6(aArr);
	System.out.println(result);
	
	int[]bArr={1,2,3};
	int result1=method7(bArr);
	System.out.println(result1);

	String[]vArr=method8("a","b");
	System.out.println(Arrays.toString(vArr));
}
	
	static void method1() {
		System.out.println("안녕");
	}
	static String method2(int start, int end, String a) {
		String str = "";
		for(int i=start;i<=end;i++) {
			str+=a;}
		return str;
		}
	static double method3(int x, int y,double z) {
			return (x+y+z);
	}
	static String method4(int num) {
		return(num%2==0)?"짝수":"홀수";
		
	}
	static void method5(String b,int c) {
		for(int i=1;i<=c;i++) {
			System.out.print(b);
		}
	}
	static int maxNum(int e, int f) {
		if(e>f) {return e;
		}else {return f;}}
	static int abs(int ab) {
		return ab<0?-ab:ab;
		
	}
	static String method6(char[]arr) {
		String s = "";
		for (char f: arr) {s+=f;}
		return s;
	}
	static int method7(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	static String[] method8(String a, String b) {
		String[]cArr= {a,b};
		return cArr;
	}
	
	
}

