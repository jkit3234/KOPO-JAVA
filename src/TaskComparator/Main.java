package TaskComparator;

import java.util.ArrayList;
import java.util.Collections;



public class Main {

	public static void main(String[] args) {
		
		//[1단계] 학생 객체 5명 생성 & 리스트에 담기
		ArrayList<Student> list = new ArrayList<>();  // Student를 담는 리스트를 만든 것, 크기가 자동으로 늘어나는 배열
		list.add(new Student("호빵맨", 90,80,70));
		list.add(new Student("식빵맨", 90,95,90));  //호빵맨이랑 국어 동점
		list.add(new Student("카레빵맨", 78,88,95));
		list.add(new Student("짤랑이", 92,70,85));
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
		 
		   
		 //[5단계] 총점 기준 정렬
			Collections.sort(list, new TotalComparator());
			System.out.println("\n[총점 기준 정렬]");
		    for (Student s : list) {
		    	System.out.println(s);
		    }
		    
		    
		 
		    
	}

}















