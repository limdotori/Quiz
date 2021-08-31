package quiz10;

public class Computer {
	//키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	//private Keyboard key = new Keyboard();이런식으로 넣으면 생성자와 변수선언까지 한거번에 하는 유형.
	private KeyBoard key;
	private Monitor monitor;
	private Mouse mouse;
	
	
	//기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	
	public Computer() {
		this.key = new KeyBoard();
		this.monitor = new Monitor();;
		this.mouse = new Mouse();
	}
	//키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	public void computerInfo() {
		this.key.info();
		this.monitor.info();
		this.mouse.info();
	}
	
	
	//키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
	public KeyBoard getKey() {
		return key;
	}
	public void setKey(KeyBoard key) {
		this.key = key;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public Mouse getMouse() {
		return mouse;
	}
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	//메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
	
	
	
}
