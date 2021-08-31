package quiz06;

public class ArrayPrint {
	
	//Arrays.toString기능을 따라해보기 (int배열, String배열, Char배열)을 각각(따로) 받아서
	//배열 내부에 요소를 문자열 형태로 가로로 더해서 반환해주는 메서드를 오버로딩
	
	String toStr(int[]arr) {
		String str = "[";
		
		for(int i = 0;i<arr.length;i++) {
			str+=arr[i];
			//마지막일 떄
			if(arr.length-1==i)break;
			str+=", ";//콤마공백
		}
		str+="]";
		return str;
	}
	
	//오버로딩
	String toStr(String[] arr) {
		String str = "[";
		
		for(int i = 0;i<arr.length;i++) {
			str+=arr[i];
			//마지막일 떄
			if(arr.length-1==i)break;
			str+=", ";//콤마공백
		}
		str+="]";
		return str;
	}
	String tostr(char[]arr) {
		String str = "[";
		
		for(int i = 0;i<arr.length;i++) {
			str+=arr[i];
			//마지막일 떄
			if(arr.length-1==i)break;
			str+=", ";//콤마공백
		}
		str+="]";
		return str;
	}
}
