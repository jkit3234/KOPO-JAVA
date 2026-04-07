//package com.kopo.kangseo;
//
//class Beeper {
//	void beep() {
//		System.out.println("Beep...");
//	}
//}
//
//class Phone extends Beeper {
//	void call() {
//		System.out.println("Calling...");
//	}S
//}
//
//class SmartPhone extends Phone {
//	void browseWeb() {
//		System.out.println("Surfing...");
//	}
//}
//
//public class InheritanceTest {
//
//	public static void main(String[] args) {
//		SmartPhone sp = new SmartPhone();
//		
//		sp.call();
//		
//		sp.browseWeb();
//		
//		sp.beep();
//	}
//
//}



//	void powerOn(){
//		System.out.println("PC Power on");
//	}
//}

//class TabletPC extends SmartPhone, PC{
//	
//}

package com.kopo.kangseo;

class Beeper {
	Beeper(){
		System.out.println("Beeper 생성자 호출되었음");
	}
	void beep() {
		System.out.println("Beep...");
	}
}

class Phone extends Beeper {
	Phone(){
		System.out.println("Phone 생성자 호출되었음");
	}
	public String number = "02-123-4567";
	void call() {
		System.out.println("Calling...");
	}
}

class SmartPhone extends Phone {
	SmartPhone(){
		System.out.println("SmartPhone 생성자 호출되었음");
	}
	private String number ="010-1234-1234";
	void browseWeb() {
		System.out.println("Surfing..."+this.number);
		System.out.println("Surfing..."+super.number);
	}
}

//class PC {
//	void powerOn(){
//		System.out.println("PC Power on");
//	}
//}

//class TabletPC extends SmartPhone, PC{
//	
//}

public class InheritanceTest {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		
		sp.call();
		
		sp.browseWeb();
		
		sp.beep();
	}

}