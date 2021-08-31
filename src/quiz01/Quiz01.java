package quiz01;

public class Quiz01 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		
		
		System.out.println(y += 10 - x++); //13, x=3
		//+=대입은 제일 마지막에 일어나는데 ++는 그것보다 더 마지막에 증가한다.
		//순서 = 10 - x먼저 따라서 8
		//y에 8나온값을 누적한다. 출력은 13으로 나가고, x는 1개 증가로 3
		
		System.out.println(x+=2); //5
		//x에 2더한거 5 (위에 식에서 x가 1더해졌기 때문에, 여기서는 x가 3인 상태)
		System.out.println( !('A' <= c && c <='Z') ); //?
		//문자코드는 숫자값을 들고있어서 c와 비교 가능.
		//앞은 T, 뒤도 T, 최종적으로 &&값은 T인데, 이걸 뒤집었으면 False
		System.out.println('C'-c); //?
		//67-65 char-int = int형!
		System.out.println(c+1);//?
		//char+1=66 (int형)
		System.out.println(++c); //B
		//이항연산이 아니기 때문에 문자형으로 나옴. (자기자신 하나 더하기 후 저장)
		System.out.println(c++); //B
		//한 줄 위의 내용에 따라서 c는 'B'인데, 출력 후 하나 증가 이므로 우선 출력은 B
		System.out.println(c);//?
		//윗 줄에서 출력 후, 값은 하나가 증가가 되었으므로 c자체의 값은 c이다.
		//char값으로 나오는 것도 포인트 중 하나겠다~
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
