package quiz01;

public class Quiz08 {

	public static void main(String[] args) {
	//switch + 인덱스 공부
	String[] arr = {"안녕하세요", "hi", "니취팔로마", "#$%"};
		/*
		 *Math.random()을 이용해서 0~3까지 랜덤수를 발생시키고,
		 *해당 인덱스를 배열에 적용해서, 선택된 값이 한국어, 영어, 중국어, 외계어 인지 구별
		 */
	int index =(int)(Math.random()*arr.length); //배열의 길이만큼 곱하기	
	System.out.println("선택된 단어:" +arr[index]);
	
	switch (arr[index]) { //arr[index]넣으면 대응되는 값 자체가 글로 들어갈 수 있음
	
	case "안녕하세요":
		System.out.println("한국어입니다.");
		break;
	case "hi":
		System.out.println("영어입니다.");
		break;	
	case "니취팔로마":
		System.out.println("중국어입니다.");
			break;	
	default:
		System.out.println("이상한 언어입니다."); //4
		break;
	}
	}
}