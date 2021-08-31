package quiz01;

import java.util.Arrays;

public class Quiz21 {
public static void main(String[] args) {
	//버블정렬 - 동그라미로 묶여있다고 생각하면, 한번 검색할 때 다음 짝꿍과 검색
	//다음짝궁과 비교해서 
	int[]arr= {5,23,1,43,100,200,40};
	//5,1,23,43,100,40,200 //회전수 i 값 = 6 //
	//1,5,23,43,40,100,200 //5
	//1,5,23,40,43,100,200 //4
	//1,5,23,40,43,100,200 //3
	//1,5,23,40,43,100,200 //2
	//1,5,23,40,43,100,200 //1
	//바깥에 주어지는 반복은 비교할 대상의 회전수
	
	for(int i = arr.length-1;i>0;i--) {//6,5,4,3,2,1
		for(int j =0; j<i;j++) { //여기서 한 번 출력을 해서 봐봐 무슨말인가~
		//비교대상은 나랑 내 다음친구! 그래서 j와 j+1	
		//System.out.println(i+"-"+ j);
		if(arr[j]>arr[j+1]) {
			int temp = arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			
		}
		}
		System.out.println(Arrays.toString(arr));
		
		
	}
	//나중에 혼자 공부할 때 퀵 정렬을 공부했으면 좋겠다.
	
}
}
