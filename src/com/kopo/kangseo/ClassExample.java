//package com.kopo.kangseo;
//
//
//class MyPhone {
//	void call() {
//		System.out.println("Calling...");
//	}
//}
//
//class MySmartPhone extends Phone {
//	void browseWeb() {
//		System.out.println("Surfing...");
//	}
//}
//
//
//public class ClassExample {
//
//	public static void main(String[] args) {
//		MySmartPhone myPhone = new MySmartPhone();
//		// Inherited from Phone
//		myPhone.call();
//		// Defined in SmartPhone
//		myPhone.browseWeb();
//	}
//
//}


package com.kopo.kangseo;


class MyBeeper {
	void call() {
		System.out.println("Beep...");
	}
}


class MyPhone extends MyBeeper {
	@Override
	void call() {
		super.call();
		System.out.println("Calling...");
		this.phonebook();
	}
	
	void phonebook() {
		System.out.println("PhoneBook...");

	}
}

class MySmartPhone extends MyPhone {
	void browseWeb() {
		System.out.println("Surfing...");
	}
}


public class ClassExample {

	public static void main(String[] args) {
		MySmartPhone myPhone = new MySmartPhone();
		// Inherited from Phone
		myPhone.call();
		// Defined in SmartPhone
		myPhone.browseWeb();
	}

}