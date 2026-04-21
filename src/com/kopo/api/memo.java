//package com.kopo.api;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CollectionEx {
//
//	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		list.add("Java");
//		list.add("Python");
//		list.add("C++"); // 순서대로 저장됨
//		// 특정 인덱스 값 조회
//		String lang = list.get(0); // "Java"
//		System.out.println(lang);
//		// 향상된 for문 순회 (가장 권장되는 방식)
//		for (String s : list) {
//		System.out.println(s);
//		}
//
//	}
//
//}



package com.kopo.api;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx {

	public static void main(String[] args) {
		
		//방법1) 강제형변환
		ArrayList list = new ArrayList();
		list.add("Java");
		list.add("Python");
		list.add("C++"); // 순서대로 저장됨
		// 특정 인덱스 값 조회
		String lang = (String) list.get(0); // "Java"
		System.out.println(lang);
		// 향상된 for문 순회 (가장 권장되는 방식)

        //방법2(Generics)
		ArrayList<String> list = new ArrayList();
		list.add("Java");
		list.add("Python");
		list.add("C++"); // 순서대로 저장됨
		// 특정 인덱스 값 조회
		String list = list.get(0); // "Java"
		System.out.println(list);
		// 향상된 for문 순회 (가장 권장되는 방식)
	}

}




//package com.kopo.api;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CollectionEx {
//
//	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList();
//		list.add("Java");
//		list.add("Python");
//		list.add("C++"); // 순서대로 저장됨
//		// 특정 인덱스 값 조회
//		String lang = list.get(0); // "Java"
//		System.out.println(lang);
//		// 향상된 for문 순회 (가장 권장되는 방식)
//		for (String s : list) {
//			System.out.println(s);
//		}
//		
//		for (int i = 0; i < list.size(); i++) {
//		    System.out.println(list.get(i));
//		}
//
//	}
//
//}