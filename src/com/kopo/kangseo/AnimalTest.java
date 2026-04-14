package com.kopo.kangseo;

// 1단계: 기본설계
// 추상클래스 이름을 AnimalBase로 통일하거나, 사용하는 곳을 Animal로 바꿔야 합니다.
// 여기서는 코드 전반에 쓰인 AnimalBase로 이름을 맞추겠습니다.
abstract class AnimalBase {
    private String name;

    public AnimalBase(String name) { 
        this.name = name; 
    }

    public String getName() { 
        return name; 
    }

    abstract void sound();

    void introduce() { 
        System.out.println("나는 " + name + "이다."); 
    }
}

// 2단계: 인터페이스
interface Moveable {
    void move();
}

// 2-1. Dog 클래스
class Dog extends AnimalBase implements Moveable {
    public Dog(String name) { super(name); }
    @Override void sound() { System.out.println("멍멍"); }
    @Override public void move() { System.out.println("뛰어다닌다"); }
}

// 2-2. Cat 클래스
class Cat extends AnimalBase implements Moveable {
    public Cat(String name) { super(name); }
    @Override void sound() { System.out.println("야옹"); }
    @Override public void move() { System.out.println("살금살금 걷는다"); }
}

// 3단계: 확장
class Bird extends AnimalBase implements Moveable {
    public Bird(String name) { super(name); }
    @Override void sound() { System.out.println("짹짹"); }
    @Override public void move() { System.out.println("하늘을 난다"); }
}

// 실행 클래스
public class AnimalTest {
    public static void main(String[] args) {
        // 다형성을 활용하여 부모 타입 배열에 자식 객체들을 담습니다.
        AnimalBase[] animals = { new Dog("바둑이"), new Cat("나비"), new Bird("짹짹이") };

        for (AnimalBase a : animals) {
            a.introduce();
            a.sound();
            
            // 인터페이스 구현 여부 확인 후 다운캐스팅
            if (a instanceof Moveable) {
                ((Moveable) a).move();
            }
            System.out.println();
        }
    }
}