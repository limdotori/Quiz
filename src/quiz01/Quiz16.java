package quiz01;

public class Quiz16 {
public static void main(String[] args) {

	int star = 5;
	for(int i = 1; i <= star; i++) {
		for(int j = 1 ; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	
	for(int i = 1; i<= star; i++) {
		for(int j = 1; j<=star+1-i; j++) {
			System.out.print("*");
		}
		System.out.println("");
	}
		
	for(int i=1; i<=star;i++) {
		for(int j = 1; j<=star-i;j++) {//공백출력
			System.out.print(" ");
		}
		for(int j =1;  j<=i*2-1;j++) {//별출력
			System.out.print("*");
		}
		System.out.println();
	}
}
}
