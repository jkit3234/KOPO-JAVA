package com.kopo.kangseo;

// // step 1. 랜덤 숫자 생성
//import java.util.Random; 
//
//public class TaskGaBaBo {
//	public static void main(String[] args) {
//		Random r = new Random();
//		
//		int num = r.nextInt(1,4); // 1 ~ 3
//		System.out.println(num);
//  }
// }


// // step 2. 사용자 입력 받기
//import java.util.Scanner;
//
//public class TaskGaBaBo {
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//	
//		System.out.println("입력하세요:");
//  		String input = s.nextLine();    // type 넣기  
//	     
//  		if (input.equals("hello")) {
//  			System.out.println("안녕하세요.");
//  		} else {
//  			System.out.println("입력값:" + input);	
//  		}
//  		
//		s.close();
//
//	}
//}

// // step3. 문자열 비교(중요!!)
//import java.util.Scanner;
//
//public class TaskGaBaBo {
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//	
//		System.out.println("입력하세요:");
//		String input = s.nextLine();    // type 넣기  
//	     
//		if (input.equals("0")||input.equals("1")||input.equals("2")) {
//			System.out.println("정상입력");
//		} else {
//			System.out.println("잘못된 입력");	
//		}
//		
//		s.close();
//
//	}
//}

//// step3. 문자열 비교 - 연습문제(핵심개념)
//import java.util.Scanner;
//
//public class TaskGaBaBo {
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//	
//		System.out.println("입력하세요:");
//		String input = s.nextLine();    // type 넣기  
//	     
//		if (input.equals("0")||input.equals("1")||input.equals("2")) {
//			System.out.println("정상입력");
//		} 
//		else if (input.equals("q")) {
//			System.out.println("게임을종료합니다.");
//		}
//					
//		    else {
//			System.out.println("잘못된 입력");	
//		}
//		
//		s.close();
//
//	}
//}
//


////step4. 문자열 -> 숫자변환
//import java.util.Scanner;
//
//public class TaskGaBaBo {
//public static void main(String[] args) {
//	Scanner s = new Scanner(System.in);
//
//	System.out.println("숫자입력 (0:가위, 1:바위, 2:보)");
//	String input = s.nextLine();    // type 넣기  
//    
//	int number = Integer.parseInt(input);  // 문자열을 숫자로 변환
//	
//	  if (number == 0) {
//		  System.out.println("가위");
//	  } else if (number == 1) {
//		  System.out.println("바위");
//	  } if (number == 2) {
//		  System.out.println("보");
//	  } else  {
//		  System.out.println("잘못입력하셨습니다.");
//	  }
//	  
//	       
//	
//	s.close();
//   }
//}


// // step 5. 가위바위보 출력
//import java.util.Scanner;
//
//public class TaskGaBaBo {
//public static void main(String[] args) {
//	Scanner s = new Scanner(System.in);
//
//	System.out.println("숫자입력 (0:가위, 1:바위, 2:보)");
//	String input = s.nextLine();    // type 넣기  
//    
//	int number = Integer.parseInt(input);  // 문자열을 숫자로 변환
//	
//	switch(number) {
//		case 0 : System.out.println("가위"); break;
//		case 1 : System.out.println("바위"); break;
//		case 2 : System.out.println("보"); break;
//		default : System.out.println("잘못입력하셨습니다."); break;
//	}  
//	       
//	s.close();
//   }
//}

  // step 6. 컴퓨터 랜덤 선택
import java.util.Random;  //랜덤 숫자를 만드는 기능을 가진 '클래스'를 가져옴
import java.util.Scanner; // 키보드 입력을 받는 기능을 가진 '클래스'를 가져옴

public class TaskGaBaBo {
public static void main(String[] args) {
	Random r = new Random(); 
	Scanner s = new Scanner(System.in);

	// 1. 사용자 입력
	System.out.println("숫자입력 (0:가위, 1:바위, 2:보)");  
	int user = Integer.parseInt(s.nextLine());  // 문자열을 숫자로 변환
	
	switch(user) {
		case 0 : System.out.println("가위"); break;
		case 1 : System.out.println("바위"); break;
		case 2 : System.out.println("보"); break;
		default : System.out.println("잘못입력하셨습니다."); break;
	}  
	
	
	// 2. 컴퓨터 랜덤 선택
	int com = r.nextInt(3); // 0~2 컴퓨터 선택
	switch(com) {
	case 0 : System.out.println("가위"); break;
	case 1 : System.out.println("바위"); break;
	case 2 : System.out.println("보"); break;
	}
	
	
	// 3. 가위바위보 게임
	// 비긴 경우
	if (user == com) {
		System.out.println("컴퓨터:" + com);
		System.out.println("당신:" + user);
		System.out.println("결과 : 비겼습니다.");
	} 
	// 내가 이긴 경우들
	else if ((user == 0 && com == 2) || // 나:가위, 컴:보
	         (user == 1 && com == 0) || // 나:바위, 컴:가위
	         (user == 2 && com == 1)) { // 나:보, 컴:바위
		System.out.println("컴퓨터:" + com);
		System.out.println("당신:" + user);
		System.out.println("결과 : 당신이 이겼습니다!");
	} 
	// 그 외 (내가 지는 경우)
	else {
		System.out.println("컴퓨터:" + com);
		System.out.println("당신:" + user);
	    System.out.println("결과 :컴퓨터가 이겼습니다.");
	}
  }
}





