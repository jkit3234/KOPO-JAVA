package com.kopo.kangseo;

//2단계 : 인터페이스 + 다형성(핵심)
//2-1. 인터페이스 작성
interface Moveable {
void move();
}

// 1단계 : 기본설계(필수)
 // 1. 추상클래스 작성
abstract class car{
 private String model;
 abstract void drive(){ System.out.println(model + "이다."); }
}

class Sedan extends
 @Override void drive() { System.out.println("부드럽게"); }
 
Car[] cars = new Car[2];
cars[0] = new Sendan("소나타")
cars[1] = new Truck("포터");

for (Car c : cars) {
	c.drive()
}
