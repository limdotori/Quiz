package quiz01;

import java.util.Arrays;

public class Quiz15 {
public static void main(String[] args) {
	int x = 50;
	int y = 100;
	
	int temp = y;
	y = x;
	x = temp;
	
	System.out.println(x);
	System.out.println(y);
	
	/*int temp = arr[i];
	 * arr[i]=arr[ran];
	 * arr[ran]=temp; 이런식으로 배열을 섞을 수있다는 것 알아놓기.
	 */

	//아래 배열에서 절대 중복되지 않는 값을 3개 추출해서 새로운 배열을 만드는 과정.
	int[]arr = {1,2,3,4,5,6,7,8,9};
	
	//1. 랜덤수를 생성하고, 랜덤 index번째 값과 위치를 변경.
	//2. 0~2번째 까지의 값을 길이가 3인 배열에 담아주면 됩니다.
	for (int i = 0;i<arr.length;i++) { 
		//length -1은 이하이고, <length로 이용하기
		
		int r=(int)(Math.random()*arr.length); //인덱스로는 0~8
		int teemp = arr[i];
		arr[i]=arr[r];
		arr[r]=teemp;
		System.out.println(Arrays.toString(arr));
	}

	int[] rArr=new int[3];
	
	for (int i = 0; i< rArr.length;i++) {
		rArr[i]=arr[i];
	}
	System.out.println(Arrays.toString(rArr));
}
}
