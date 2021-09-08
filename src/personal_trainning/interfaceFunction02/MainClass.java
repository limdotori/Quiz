package personal_trainning.interfaceFunction02;

public class MainClass {
public static void main(String[] args) {
	Animal dog = new Dog();
	Animal cat = new Cat();
	Animal tiger = new Tiger();
	
	Animal[] ani = {dog, cat, tiger};
	
	for(Animal a:ani) {
		a.eat();
	}
	
	System.out.println("-----------------------------");
	
	IPet dog2 = new Dog();
	IPet cat2 = new Cat();
	IPet fish2 = new GoldFish();

	IPet[] pets = {dog2, cat2, fish2};
	for(IPet p : pets) {
		p.play();
	}
}
}
