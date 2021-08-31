package quiz02;

import java.util.Arrays;

public class RandomSeat {

	public static void main(String[] args) {
		
		/*
		 * 정수를 매개변수로 받아서, 
		 * 1~매개변수 까지의 값을 배열에 랜덤하게 
		 * 넣어서 반환해주는 함수 seat을 생성하세요.
		 * 
		 * 조건
		 * 1.숫자는 중복되지 않습니다
		 * 2.swap을 이용하지 않습니다.
		 * 
		 * 입력-5
		 * 출력-[1~5가 랜덤하게 섞여있는 길이가 5인 배열]
		 * 
		 * 입력-10
		 * 출력-[1~10가 랜덤하게 섞여있는 길이가 10인 배열]
		 */
				
		
		
		int[] arr = seat(10);
		System.out.println(Arrays.toString(arr));
	}
	
	static int[] seat(int size) {
		int[] arr = new int[size];
		int index = 0;
		
		start:while(true) {

			int ran = (int)(Math.random() * size) +1;
			//중복검사
			for(int i = 0; i < index; i++) {
				
				if(arr[i] == ran) {
					continue start;
				}
			}	
			arr[index] = ran;
			index++;
			
			if(index == size) break; //탈출
		}
		return arr;
	}
}
