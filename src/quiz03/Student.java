package quiz03;

public class Student {
	String name;
	int num;
	int kor;
	int eng;
	int math;

	Student(String na,int nu,int k,int e,int m){
		name=na;
		num=nu;
		kor=k;
		eng=e;
		math=m;
	}
	
	double getTotal() {
		return kor+eng+math;
	}
	
	double getAvg() {
		double avg = (int)(getTotal()/3*100)/100.0; 
		//위에 식 한번 다시해보기~
		//실수에서실수를 나눠야 실수 몫을 구할 수 있어서, 둘다 double로 맞추기
		return avg;
	
		
	}
}
