package TaskComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;  // 추가

public class MainSort {

	public static void main(String[] args) {
		
		//[1단계] 학생 객체 5명 생성 & 리스트에 담기
		ArrayList<Student> list = new ArrayList<>();  // Student를 담는 리스트를 만든 것, 크기가 자동으로 늘어나는 배열
		list.add(new Student("호빵맨", 90,80,70));
		list.add(new Student("식빵맨", 90,95,90));  //호빵맨이랑 국어 동점
		list.add(new Student("카레빵맨", 78,88,95));
		list.add(new Student("짤랑이", 92,70,85));
		list.add(new Student("세균맨", 88,92,78));
		
		// [추가] 정렬방향 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("정렬 방향을 선택하세요 (1: 내림차순 / 2: 오름차순)");
		int choice = sc.nextInt();
		
		
		//[2단계] 국어 기준 정렬
			if (choice == 1) {
			    // 내림차순
			    Collections.sort(list, new KoreanComparator());
			} else {
			    // 오름차순 (a - b)
			    Collections.sort(list, (a, b) -> a.korean - b.korean);
			}
	
			System.out.println("[국어 기준 정렬]");
			for (Student s : list) {
			    System.out.println(s);
			}
	    
	    //[3단계] 영어 기준 정렬
			if (choice == 1) {
			    // 내림차순
			    Collections.sort(list, new EnglishComparator());
			} else {
			    // 오름차순 (a - b)
			    Collections.sort(list, (a, b) -> a.english - b.english);
			}

			System.out.println("\n[영어 기준 정렬]");
			for (Student s : list) {
			    System.out.println(s);
			}
			
	  	//[4단계] 수학 기준 정렬
			if (choice == 1) {
			    // 내림차순
			    Collections.sort(list, new MathComparator());
			} else {
			    // 오름차순 (a - b)
			    Collections.sort(list, (a, b) -> a.math - b.math);
			}

			System.out.println("\n[수학 기준 정렬]");
			for (Student s : list) {
			    System.out.println(s);
			}
		 
		   
		 //[5단계] 총점 기준 정렬
			if (choice == 1) {
			    // 내림차순
			    Collections.sort(list, new TotalComparator());
			} else {
			    // 오름차순 (a - b)
			    Collections.sort(list, (a, b) -> a.getTotal() - b.getTotal());
			}

			System.out.println("\n[총점 기준 정렬]");
			for (Student s : list) {
			    System.out.println(s);
			}
		
	}

}





