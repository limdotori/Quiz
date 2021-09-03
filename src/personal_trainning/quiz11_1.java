package personal_trainning;

public class quiz11_1 {
	public static void main(String[] args) {
		int a = 1;
		int sum = 0;
		while(a<=200) {
			if(a%5==0) {
				sum+=a;
			}a++;
		}
		System.out.println("200까지의 5의 배수의 합 :"+ sum);
	}
}
