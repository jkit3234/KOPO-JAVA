package TaskComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MainSubList {

	public static void main(String[] args) {
		
		//[1단계] 학생 객체 5명 생성 & 리스트에 담기
		ArrayList<Student> list = new ArrayList<>();  // Student를 담는 리스트를 만든 것, 크기가 자동으로 늘어나는 배열
		list.add(new Student("호빵맨", 90,80,70));
		list.add(new Student("식빵맨", 90,95,90));  //간장이랑 국어 동점
		list.add(new Student("카레빵맨", 78,88,95));
		list.add(new Student("짤랑이", 92,81,85));
		list.add(new Student("세균맨", 88,92,78));
		
		//[2단계] 국어 기준 정렬
			Collections.sort(list, new KoreanComparator());  // 리스트를 정렬해주는 자바 내장 기능
			System.out.println("[국어 기준 정렬]");
		    for (Student s : list) {
		    	System.out.println(s);
		    }	
	    
	    //[3단계] 영어 기준 정렬
	  		Collections.sort(list, new EnglishComparator());
	  		System.out.println("\n[영어 기준 정렬]");
	  	    for (Student s : list) {
	  	    	System.out.println(s);
	  	    }	
	
	  	//[4단계] 수학 기준 정렬
			Collections.sort(list, new MathComparator());
			System.out.println("\n[수학 기준 정렬]");
		    for (Student s : list) {
		    	System.out.println(s);
		    }
		 
		   
		 //[5단계] 총전 기준 정렬
			Collections.sort(list, new TotalComparator());
			System.out.println("\n[총점 기준 정렬]");
		    for (Student s : list) {
		    	System.out.println(s);
		    }
		
		
		    //[추가] 상위 3명 출력 - 위치는 무조건 줄세우고 싶은 점수 코드 뒷에 놓기  
		    System.out.println("\n[총점 기준 상위 3명]");
		    List<Student> top3 = list.subList(0, 3); // 0번째부터 3번째 전까지 = 상위 3명
		    for (Student s : top3) {
		        System.out.println(s);
		    }
		
		
		   //[추가] 등수 매기기
		    System.out.println("\n[등수 매기기]");

		    int rank = 1;  // 현재 등수

		    for (int i = 0; i < list.size(); i++) {

		        // 첫번째 학생이 아니고 && 이전 학생이랑 총점이 다르면
		        if (i > 0 && list.get(i).getTotal() != list.get(i-1).getTotal()) {
		            rank = i + 1;  // 등수 업데이트
		        }

		        System.out.println(rank + "등 " + list.get(i));
		    }
	}

}















