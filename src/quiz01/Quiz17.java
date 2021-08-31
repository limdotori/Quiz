package quiz01;

public class Quiz17 {
public static void main(String[] args) {
	//첫번째 줄에서 -> 가로로 3단까지 진행 후, 또 두번째 줄로가서 3단까지 진행하고!
	//|T같은 경우에는 8칸 스페이스바 8칸과 같은 의미!
	//뭉탱이가 크게 3개고, 1행일 때 9번 출력!
	for(int i= 1; i <=9;i+=3) { //이게 제일 밖으로 나오는 걸 생각
		for(int j = 1; j<=9;j++) {
			System.out.print(i+" x "+j+" = "+i*j + "\t");
			System.out.print((i+1) + " x "+j+" = "+(i+1)*j+ "\t");
			System.out.print((i+2) + " x "+j+" = "+(i+2)*j+ "\t");
			System.out.println();
			
//			System.out.printf("%d x %d = %d\t%d x %d = %d\t%d x %d = %d\n",
//					i,j,i*j,i+1,j,(i+1)*j,i+2,j,(i+2)*j);
	}
		
		System.out.println();
}
}
}