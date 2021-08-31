package quiz02;

public class Coffee {
	String name;
	int price;
	String size;
	
	Coffee(){
		
	}
	Coffee(String cname,int cprice,String csize	){
	name=cname;
	price=cprice;
	size=csize;
	}
	
	void info()	{
		System.out.println(name);
		System.out.println(price+"원");
		System.out.println(size+"사이즈");
	}
}
