package quiz09;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("----------문제1----------");
		/* 문제1
		 * 1. 클래스 User를 생성하세요
		 * 2. 멤버변수 name: String ,  rrn : int, int age 를 선언후 은닉 처리합니다 (private 지정)
		 * 3. User 클래스에는 기본생성자, 모든 멤버변수를  초기화 하는 생성자  2개를 생성하세요.
		 * 4. main에서 User객체를  생성 후  
		 *    (홍길동, 123123, 20)을 저장 하고 값을 확인하세요.
		 */
		User num1= new User("홍길동",123123,20);
		System.out.println("이름:"+num1.getName());
		System.out.println("번호:"+num1.getRrn());
		System.out.println("나이:"+num1.getAge());
		
		System.out.println("----------문제2----------");
		/* 문제2 (여기서부터멘붕)
		 * 1. 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다.)
		 * 2. 두번째 User객체를 생성하세요. ("김길동", 456456, 30)을 저장.
		 * 3. User배열에 두 객체를 저장하세요.
 		 * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
 		 * ex) User[] arr = new User[2];
		 */
		User[]arr=new User[2];
		
		User num2= new User("김길동",456456,30);
		System.out.println("이름:"+num2.getName());
		System.out.println("번호:"+num2.getRrn());
		System.out.println("나이:"+num2.getAge());
		
		//u1과 u2를 이름으로 넣는다. 헷갈리면 노란색 넣는다고 생각하기.
		arr[0]=num1;
		arr[1]=num2;
		//User배열에서 홍길동 통째로 들어잇는 user를 꺼낸다
		for(User user : arr) {
			//user만 출력하면 주소값(덩어리)만나오는데 그걸 분리하기 위해서 
			//또 한번 더 꺼내는 값으로 user.getname 등을 출력하는 것이다.
			System.out.println(user.getName());
			System.out.println(user.getRrn());
			System.out.println(user.getAge());
		}
		
		System.out.println("----------문제3----------");
		/* 문제 3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요.
		 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
		 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
		 */
		//while에서 한바퀴가 돌아가면서 하나의 객체가 생성되야하니까, while문 안에 생성해야 한다.
		Scanner scan = new Scanner(System.in);
		User[]arr2=new User[5];
		
		int i = 0;//아랫줄 i<5로 해도 된다. 또는 true문장으로해서 탈출하는 걸 활용해도 된다.
		while(i<arr2.length) {
			System.out.println("이름>");
			String name = scan.next();
			System.out.println("번호>");
			int rrn = scan.nextInt();
			System.out.println("나이>");
			int age = scan.nextInt();
			
			User u = new User(name,rrn,age);
			arr2[i]=u;
			
			i++;
			System.out.println(Arrays.deepToString(arr2));
			//덩어리가 들어간거니까, 참초타입 덩어리로 주소값이 나온다.
		}
		//배열에 주소값이 사람추가될 때마다 추가되면 정답으로 처리		
	}
}
