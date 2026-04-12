package com.kopo.kangseo;


//// step 1. 랜덤 숫자 생성
//import java.util.Random; 
//
// public class TaskGaBaBoFin {
//	public static void main(String[] args) {
//		Random r = new Random();
//		
//		int num = r.nextInt(1,4); // 1 ~ 3
//		System.out.println(num);
//}
//}


//// step 2. 사용자 입력 받기
//import java.util.Scanner;
//
//public class TaskGaBaBoFin {
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//	
//		System.out.println("입력하세요:");
//		String input = s.nextLine();    // type 넣기  
//	     
//		if (input.equals("hello")) {
//			System.out.println("안녕하세요.");
//		} else {
//			System.out.println("입력값:" + input);	
//		}
//		
//
//	}
//}

//// step3. 문자열 비교(중요!!)
//import java.util.Scanner;
//
//public class TaskGaBaBoFin {
// public static void main(String[] args) {
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
//
//	}
//}

////step3. 문자열 비교 - 연습문제(핵심개념)
//import java.util.Scanner;
//
// public class TaskGaBaBoFin {
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
//
//	}
//}



////step4. 문자열 -> 숫자변환
//import java.util.Scanner;
//
//public class TaskGaBaBoFin {
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
//}
//}


//// step 5. 가위바위보 출력(switch)
//import java.util.Scanner;
//
//public class TaskGaBaBoFin {
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
//}
//}

//// step 6. 컴퓨터 랜덤 선택  + step 7. 승패판정로직 완성
//import java.util.Random;  // 랜덤 숫자를 만드는 기능을 가진 '클래스'를 가져옴
//import java.util.Scanner; // 키보드 입력을 받는 기능을 가진 '클래스'를 가져옴
//public class TaskGaBaBoFin {
//public static void main(String[] args) {
//	Random r = new Random();
//	Scanner s = new Scanner(System.in);
//	// 1. 사용자 입력
//	System.out.println("숫자입력 (0:가위, 1:바위, 2:보)"); 
//	int user = Integer.parseInt(s.nextLine());  // 문자열을 숫자로 변환
//	
//	String userR = "";  // user str 변수에 담기
//	
//	switch(user) {
//		case 0 : userR = "가위"; break;
//		case 1 : userR = "바위"; break;
//		case 2 : userR = "보"; break;
//		default : System.out.println("잘못입력하셨습니다."); break;
//	} 
//	
//		
//	// 2. 컴퓨터 랜덤 선택
//	int com = r.nextInt(3); // 0~2 컴퓨터 선택
//	
//	String comR = "";  // com str 변수에 담기
//	
//	switch(com) {
//	case 0 : comR = "가위"; break;
//	case 1 : comR = "바위"; break;
//	case 2 : comR = "보"; break;
//	}
//	
//	
//	// 3. 가위바위보 게임
//	// 비긴 경우
//	if (user == com) {
//		System.out.println("- 당신:" + userR);
//		System.out.println("- 컴퓨터:" + comR);
//		System.out.println("- 결과 : 비겼습니다.");
//	}
//	// 내가 이긴 경우들
//	else if ((user == 0 && com == 2) || // 나:가위, 컴:보
//	         (user == 1 && com == 0) || // 나:바위, 컴:가위
//	         (user == 2 && com == 1)) { // 나:보, 컴:바위
//		System.out.println("- 당신:" + userR);
//		System.out.println("- 컴퓨터:" + comR);
//		System.out.println("-결과 : 당신이 이겼습니다!");
//	}
//	// 그 외 (내가 지는 경우)
//	else {
//		
//		System.out.println("- 당신:" + userR);
//		System.out.println("- 컴퓨터:" + comR);
//	    System.out.println("- 결과 :컴퓨터가 이겼습니다.");
//	}
// }
//}


////step 8. 반복게임 만들기
//import java.util.Random;
//import java.util.Scanner;
//
//public class TaskGaBaBoFin {
// public static void main(String[] args) {
//     Random r = new Random();
//     Scanner s = new Scanner(System.in);
//
//     // for (시작; 조건; 증감) -> i가 0부터 9까지 총 10번 반복합니다.
//     for (int i = 0; i < 10; i++) {
//         System.out.println("\n--- [" + (i + 1) + "번째 게임] ---");
//         System.out.println("숫자입력 (0:가위, 1:바위, 2:보)");
//         
//         // 1. 사용자 입력
//         int user = Integer.parseInt(s.nextLine());
//         String userR = "";
//
//         switch (user) {
//             case 0: userR = "가위"; break;
//             case 1: userR = "바위"; break;
//             case 2: userR = "보"; break;
//             default: userR = "잘못된 입력"; break;
//         }
//
//         // 2. 컴퓨터 랜덤 선택
//         int com = r.nextInt(3);
//         String comR = "";
//
//         switch (com) {
//             case 0: comR = "가위"; break;
//             case 1: comR = "바위"; break;
//             case 2: comR = "보"; break;
//         }
//
//         // 3. 승패 판정 및 결과 출력
//         System.out.println("- 당신: " + userR);
//         System.out.println("- 컴퓨터: " + comR);
//
//         if (user == com) {
//             System.out.println("=> 결과: 비겼습니다.");
//         } else if ((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
//             System.out.println("=> 결과: 당신이 이겼습니다!");
//         } else {
//             System.out.println("=> 결과: 컴퓨터가 이겼습니다.");
//         }
//     } // for 문 끝 (여기까지 10번 반복됨)
//
//     System.out.println("\n10판 게임이 모두 종료되었습니다.");
// }
//}


//// 확장 : 사용가자 원하는 횟수만큼 게임 진행
//import java.util.Random;
//import java.util.Scanner;
//
//public class TaskGaBaBoFin {
// public static void main(String[] args) {
//     Random r = new Random();
//     Scanner s = new Scanner(System.in);
//
//     System.out.print("몇 판 하시겠습니까? ");
//     int count = Integer.parseInt(s.nextLine());
//     
//     // for문 뒤에 { 를 열어주기
//     for (int i = 0; i < count; i++) { 
//         System.out.println("\n--- [" + (i + 1) + "번째 게임] ---");
//         System.out.println("숫자입력 (0:가위, 1:바위, 2:보)");
//         
//         // 1. 사용자 입력
//         int user = Integer.parseInt(s.nextLine());
//         String userR = "";
//
//         switch (user) {
//             case 0: userR = "가위"; break;
//             case 1: userR = "바위"; break;
//             case 2: userR = "보"; break;
//             default: userR = "잘못된 입력"; break;
//         }
//
//         // 2. 컴퓨터 랜덤 선택
//         int com = r.nextInt(3);
//         String comR = "";
//
//         switch (com) {
//             case 0: comR = "가위"; break;
//             case 1: comR = "바위"; break;
//             case 2: comR = "보"; break;
//         }
//
//         // 3. 승패 판정 및 결과 출력
//         System.out.println("- 당신: " + userR);
//         System.out.println("- 컴퓨터: " + comR);
//
//         if (user == com) {
//             System.out.println("=> 결과: 비겼습니다.");
//         } else if ((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
//             System.out.println("=> 결과: 당신이 이겼습니다!");
//         } else {
//             System.out.println("=> 결과: 컴퓨터가 이겼습니다.");
//         }
//     } // for 문 끝 (여기가 count만큼 반복되는 지점)
//
//     System.out.println("\n모든 게임이 종료되었습니다.");
// }
//}



//step 9. 종료 기능 추가(핵심) + step 10. 승리 횟수 저장  + step 11. 최종종합미션
import java.util.Random;
import java.util.Scanner;

public class TaskGaBaBoFin {
 public static void main(String[] args) {
     Random r = new Random();
     Scanner s = new Scanner(System.in);

     int userWin = 0; // 사용자의 승리 횟수를 저장할 변수
     int comWin = 0; //  컴퓨터의 승리 횟수를 저장할 변수
     int draw = 0; //  무승부 횟수를 저장할 변수

     while (true) {
         System.out.println("\n[메뉴] 게임을 시작하려면 엔터, 종료하려면 q를 입력하세요:");
         String input = s.nextLine();

         // 1. 종료 기능 (q 입력 시)
         if (input.equals("q")) {
             System.out.println("게임 종료");
             break; // while 무한 루프 종료
         }

         // 2. 판수 입력 받기
         System.out.print("몇 판 하시겠습니까? ");
         int count = Integer.parseInt(s.nextLine());

         // 3. 입력받은 판수만큼 반복
         for (int i = 0; i < count; i++) {
             System.out.println("\n--- [" + (i + 1) + "번째 게임] ---");
             System.out.println("숫자입력 (0:가위, 1:바위, 2:보)");

             // 사용자 입력
             int user = Integer.parseInt(s.nextLine());
             String userR = "";

             switch (user) {
                 case 0: userR = "가위"; break;
                 case 1: userR = "바위"; break;
                 case 2: userR = "보"; break;
                 default: userR = "잘못된 입력"; break;
             }

             // 컴퓨터 랜덤 선택
             int com = r.nextInt(3);
             String comR = "";
             switch (com) {
                 case 0: comR = "가위"; break;
                 case 1: comR = "바위"; break;
                 case 2: comR = "보"; break;
             }

             // 결과 출력
             System.out.println("- 당신: " + userR);
             System.out.println("- 컴퓨터: " + comR);

             // 4. 승패 판정 및 카운트
             if (user == com) {
                 System.out.println("=> 결과: 비겼습니다.");
                 draw++; // 무승부일때
             } else if ((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
                 System.out.println("=> 결과: 당신이 이겼습니다!");
                 userWin++; // 사용자 이겼을 때 카운트를 1 올리기
             } else {
                 System.out.println("=> 결과: 컴퓨터가 이겼습니다.");
                 comWin++; // 컴퓨터가 이겼을 때 카운트를 1 올리기
             }
         } // for 문 끝

         System.out.println("\n선택하신 " + count + "판이 완료되었습니다.");
         System.out.println("당신의 누적 승리 횟수: " + userWin + "회");
         System.out.println("컴퓨터의 누적 승리 횟수: " + comWin + "회");
         System.out.println("무승부 누적 횟수: " + draw + "회");
         
     } // while 문 끝

 }
}


////상위권용: 고급 기능 구현
//import java.util.Random;
//import java.util.Scanner;
//
//public class TaskGaBaBoFin {
//    public static void main(String[] args) {
//        // [준비물]
//        Random r = new Random();
//        Scanner s = new Scanner(System.in);
//
//        // [배열 활용] 
//        String[] choices = {"가위", "바위", "보"};
//
//        // [변수 설정] 통계 기록장
//        int userWin = 0;   // 내가 이긴 횟수
//        int comWin = 0;    // 컴퓨터가 이긴 횟수 (잘못 입력 포함)
//        int totalGames = 0; // 전체 게임 횟수
//
//        System.out.println("=== 가위바위보 고급 게임을 시작합니다 ===");
//
//        while (true) {
//            System.out.println("\n숫자 입력 (0:가위, 1:바위, 2:보, q:종료)");
//            String input = s.nextLine();
//
//            // 1. 종료 기능
//            if (input.equals("q")) {
//                break; 
//            }
//
//            // 2. 숫자 변환 및 유효성 검사
//            int user;
//            try {
//                user = Integer.parseInt(input);
//            } catch (NumberFormatException e) {
//                // 숫자가 아닌 문자(예: "abc")를 입력했을 때 처리
//                user = -1; 
//            }
//
//            // 3. 컴퓨터 선택 (0, 1, 2)
//            int com = r.nextInt(3);
//            totalGames++;
//
//            // 4. 승패 판정 및 출력
//            // 유효한 입력(0, 1, 2)인 경우
//            if (user >= 0 && user <= 2) {
//                System.out.println("나: " + choices[user] + " VS 컴퓨터: " + choices[com]);
//
//                if (user == com) {
//                    System.out.println("=> 결과: 비겼습니다.");
//                } else if ((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
//                    System.out.println("=> 결과: 당신이 이겼습니다! 🎉");
//                    userWin++;
//                } else {
//                    System.out.println("=> 결과: 컴퓨터가 이겼습니다. 🤖");
//                    comWin++;
//                }
//            } 
//            // 잘못된 입력인 경우 (0, 1, 2가 아니거나 문자인 경우)
//            else {
//                System.out.println("나: 잘못된 입력 (" + input + ") VS 컴퓨터: " + choices[com]);
//                System.out.println("=> 결과: 잘못된 입력으로 당신의 패배입니다! 🤖");
//                comWin++;
//            }
//
//            // 5. 현재 성적 출력
//            System.out.println("현재 성적: " + userWin + "승 " + comWin + "패 (전체: " + totalGames + "판)");
//        }
//
//        // [최종 통계]
//        System.out.println("\n--- [최종 게임 통계] ---");
//        if (totalGames > 0) {
//            double winRate = (double) userWin / totalGames * 100;
//            System.out.println("총 판수: " + totalGames + "판");
//            System.out.println("총 승리: " + userWin + "회 / 패배: " + comWin + "회");
//            System.out.printf("당신의 승률: %.2f%% 입니다!\n", winRate);
//        } else {
//            System.out.println("진행된 게임이 없습니다.");
//        }
//        s.close();
//    }
//}