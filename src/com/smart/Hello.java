package com.smart;

import com.kopo.Hello;

class Child extends Hello {
    public void test() {
        System.out.println("=== 상속 받은 경우 ===");
        publicMethod();       
        protectedMethod();  

    }
}

public class HelloTest {
    public static void main(String[] args) {
        Hello h = new Hello();
        
        System.out.println("=== 다른 패키지에서 객체 생성 접근 ===");
        h.publicMethod();       
       
        Child c = new Child();
        c.test();
    }
}