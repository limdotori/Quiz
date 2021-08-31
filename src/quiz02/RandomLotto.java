package quiz02;

import java.util.Arrays;

public class RandomLotto {

	public static void main(String[] args) {
		
		/*
		 * 무작위로 생성된 로또번호를 이용하여 당첨되기 까지 금액을 알아보는
		 * 프로그램 입니다.
		 * 
		 * 1. 입력-x, 
		 * 2. 출력-길이가 6인 배열
		 * lotto함수는 1~45까지의 중복되지 않는 랜덤수를 배열에 넣어 반환하는
		 * 메서드 입니다.
		 * 이 메서드의 실행 결과는 당첨번호가 됩니다.
		 *  
		 * ============================================================= 
		 * 1. 입력-당첨배열
		 * 2. 출력-long(당첨되기까지의 금액)
		 * run함수는 당첨배열을 받아서 당첨되기 까지 랜덤한 번호를 생성하여 
		 * 금액을 계산하는 메서드입니다
		 * ***당첨의 조건***
		 * 당첨번호-[10,9,8,7,6,5] 
		 * ex) [5,6,8,7,9,10] 당첨
		 * ex) [10,9,8,7,6,45] 당첨x
		 * 
		 */
		 int[] lotto = lotto();
		 long value = run(lotto);
		 System.out.println("당첨되기까지 필요한 금액:" + value);
	}
	
	static int[] lotto() {
		int[] arr = new int[6];
		
		int index = 0;
		
		start:while(true) {
			if(index == 6) break;
			int num = (int)(Math.random() * 45) + 1;
			//중복검사
			for(int i = 0; i < index; i++) {
				if(num == arr[i]) continue start;
			}
			arr[index] = num;
			index++;
		}

		return arr;
	}
	
	static long run(int[] arr) {
		long count = 0;
		Arrays.sort(arr);
		
		
		while(true) {
			
			int[] arr2 = lotto();
			Arrays.sort(arr2);
			
			//System.out.println(count);
			
			if(Arrays.equals(arr, arr2)) { //동일한 값을 가지고 있으면 true반환
				return count * 1000;
			} else {
				count++;
			}
		}
		
	
	}
}
