package wipro_day_4;
 interface Wiprosystem{
	void deviceType();
	void compilespeed();
	
}
class Desktop implements Wiprosystem{
	public void deviceType() {
		System.out.println("Wipro provides device: DESKTOP");
		
	}
	public void compilespeed() {
		System.out.println("Code is compiled faster in Desktop");
		
	}
}
	class Laptop implements Wiprosystem{
			public void deviceType() {
				System.out.println("Wipro provides device: Laptop");
				
			}
			public void compilespeed() {
				System.out.println("Code is compiled faster in Laptop");
				
	}
}

public class Devices {
	public static void main(String[] args) {
		Wiprosystem laptop = new Laptop() ;
		laptop.deviceType();
		laptop.compilespeed();
		
		Wiprosystem desktop = new Desktop();
		desktop.deviceType();
		desktop.compilespeed();
		
	}
}

