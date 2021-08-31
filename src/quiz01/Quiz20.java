package quiz01;

import java.util.Arrays;

public class Quiz20 {
public static void main(String[] args) {
	
	//중첩반복문을 이용해서 정렬.
	//배열문제 공부한다고 생각하고 준비!
	//끝 값은 똑같지만, 시작값이 하나씩 늘어나는 형태 (따라서 시작값 i+1)
	int[]arr=	 {5,23,1,43,100,200,40};
//	
	for(int i=0;i<arr.length-1;i++) {
		//System.out.println(i);
		
		for(int j = i+1; j< arr.length;j++) {
			//모를때는 출력해보기 System.out.println(i+" - "+j);
			if(arr[i]>arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
		
}
	
	Arrays.sort(arr);
//	System.out.println(Arrays.toString(arr));
}
}