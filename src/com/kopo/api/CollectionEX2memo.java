package com.kopo.api;

import java.util.ArrayList;

class Student {
	private String name;
	private int age;

	// 생성자: 객체를 생성할 때 이름과 나이를 초기화함
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter/Setter: private 필드에 접근하기 위한 메서드들
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

	// [중요] toString() 오버라이드: 객체 자체를 출력할 때 보여줄 형식을 지정함
	@Override
	public String toString() {
		// 기본값인 "클래스명@해시코드" 대신 원하는 문자열 형식을 반환
		return "Student [성명=" + name + ", 나이=" + age + "]";
	}
}

public class CollectionEX2 {
	public static void main(String[] args) {
		// 1. 개별 Student 객체 생성
		Student std1 = new Student("홍길동", 20);
		Student std2 = new Student("이순신", 21);
		Student std3 = new Student("강감춘", 22);
		Student std4 = new Student("황원용", 23);
		Student std5 = new Student("김효관", 24);

		// 2. Student 객체들을 담을 ArrayList 생성
		ArrayList<Student> myArrayList = new ArrayList<>();

		// 3. 반복문을 사용하여 30명의 학생 데이터를 리스트에 추가
		for (int i = 0; i < 30; i++) {
			// "ABC"라는 이름과 30부터 시작하는 나이를 가진 객체를 생성하여 리스트에 넣음
			myArrayList.add(new Student("ABC", 30 + i));
		}

		// 4. 리스트에 담긴 객체들을 하나씩 꺼내서 출력
		for (int i = 0; i < myArrayList.size(); i++) {
			// .get(i)로 객체를 꺼낸 뒤 .toString() 호출
			// 오버라이드를 했기 때문에 우리가 정의한 형대로 출력됨
			System.out.println(myArrayList.get(i).toString());
		}
	}
}
