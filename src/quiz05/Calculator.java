package quiz05;

public class Calculator {

	 int result;
	 double pi=3.14; //변하지 않는 수이기 떄문에.
	 
	 Calculator(){
		 result=1;
	 }
	 int add(int a){
		 result+=a;
		 return result;
		 }
	 int sub(int b) {
		 result-=b;
		 return result;
	 	}
	 double circle(int r) {
		 return pi*(r*r);
	 }

}
