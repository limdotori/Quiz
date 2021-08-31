package quiz10;

public class MainClass {
public static void main(String[] args) {
	Computer com = new Computer();
	com.computerInfo();
	System.out.println("--------------------");
	KeyBoard key = com.getKey();
	key.info();
}
}
