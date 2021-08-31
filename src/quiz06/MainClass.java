package quiz06;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		ArrayPrint ap=new ArrayPrint();
		
		int[]arr= {1,2,3};
		String[] arr2 = {"가","나","다"};
		char[]arr3= {'a','b'};
		
		
		
		System.out.println(ap.toStr(arr));
		System.out.println(ap.toStr(arr2));
		System.out.println(ap.tostr(arr3));
		}
//		System.out.println(Arrays.toString(arr));

	//사용하고싶으면 우선 어레이생성
	


}