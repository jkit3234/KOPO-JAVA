//package com.kopo.api;
//
//import java.util.ArrayList;
//
//class Student{
//	private String name;
//	private int age;
//
//	public Student(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//}
//
//public class CollectionEX2 {
//	public static void main(String[] args) {
//		Student std1 = new Student("홍길동",20);
//		Student std2 = new Student("이순신",21);
//		Student std3 = new Student("강감춘",22);
//		Student std4 = new Student("황원용",23);
//		Student std5 = new Student("김효관",24);
//		
//		ArrayList<Student> myArrayList = new ArrayList<>();
//
//	//  myArrayList.add(std1);
//		myArrayList.add(new Student("ABC",30));
//	
//	     System.out.println(myArrayList.get(0).toString());
//	}
//}




//package com.kopo.api;
//
//import java.util.ArrayList;
//
//class Student{
//	private String name;
//	private int age;
//
//	public Student(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//}
//
//public class CollectionEX2 {
//	public static void main(String[] args) {
//		Student std1 = new Student("홍길동",20);
//		Student std2 = new Student("이순신",21);
//		Student std3 = new Student("강감춘",22);
//		Student std4 = new Student("황원용",23);
//		Student std5 = new Student("김효관",24);
//		
//		ArrayList<Student> myArrayList = new ArrayList<>();
//		
////		myArrayList.add(std1);
//		for(int i=0; i<30; i++) {
//			myArrayList.add(new Student("ABC",30+i));
//		}
//		
//		  for(int i=0; i<myArrayList.size(); i++) {
//			System.out.println(myArrayList.get(i).toString());
//		}
//		
//	}
//}


// toString()은 현재 객체의 고유값(해시)를 출력하고 있습니다.
// Student 객체의 성명과 나이를 출력하도록 코드를 수정하세요.



package com.kopo.api;

import java.util.ArrayList;
import java.util.Random;

class Student{
	private String name;
	private int age;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
		return this.name + " : " + Integer.toString(age);
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class CollectionEX2 {
	public static void main(String[] args) {
		Student std1 = new Student("홍길동",20);
		Student std2 = new Student("이순신",21);
		Student std3 = new Student("강감춘",22);
		Student std4 = new Student("황원용",23);
		Student std5 = new Student("김효관",24);
		
		ArrayList<Student> myArrayList = new ArrayList<>();
		
//		myArrayList.add(std1);
		// 현재 : 고정문자열...30개가 동일한 ABC
		// 변경 : 문자열 길이는 3, 대소문자 상관없이 3개...를 랜덤으로 add하도록 수정
		for(int i=0; i<30; i++) {
			myArrayList.add(new Student(randomName(),30+i));
		}
		
		for(int i=0; i<myArrayList.size(); i++) {
			System.out.println(myArrayList.get(i).toString());
		}
		
		// toString()은 현재 객체의 고유값(해시)를 출력하고 있습니다.
		// Student 객체의 성명과 나이를 출력하도록 코드를 수정하세요.
	}
	
    // 랜덤 문자열 생성 (길이 3, 대소문자 포함)
    public static String randomName() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            int idx = rand.nextInt(chars.length());
            sb.append(chars.charAt(idx));
        }

        return sb.toString();
    }
}

