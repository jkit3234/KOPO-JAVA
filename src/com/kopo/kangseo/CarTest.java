package com.kopo.kangseo;

// 1단계 : 기본설계(필수)
 // 1. 추상클래스 작성
abstract class Car {
 private String model;
 public Car(String model) {
	 this.model = model;
 }

 public String getModel() {
	 return name;
 }
 
 abstract void drive();
 
 void introduce() {
	 System.out.println(model + "이다."); 
  }
}

interface 

class Sedan extends
 @Override void drive() { System.out.println("부드럽게"); }
 
Car[] cars = new Car[2];
cars[0] = new Sendan("소나타")
cars[1] = new Truck("포터");

for (Car c : cars) {
	c.drive()
}
