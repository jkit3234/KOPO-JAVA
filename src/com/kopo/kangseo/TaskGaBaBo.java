// step 8. 반복게임 만들기

//package com.kopo.kangseo;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class TaskGaBaBo {
//    public static void main(String[] args) {
//        Random r = new Random();
//        Scanner s = new Scanner(System.in);
//
//        // for (시작; 조건; 증감) -> i가 0부터 9까지 총 10번 반복합니다.
//        for (int i = 0; i < 10; i++) {
//            System.out.println("\n--- [" + (i + 1) + "번째 게임] ---");
//            System.out.println("숫자입력 (0:가위, 1:바위, 2:보)");
//            
//            // 1. 사용자 입력
//            int user = Integer.parseInt(s.nextLine());
//            String userR = "";
//
//            switch (user) {
//                case 0: userR = "가위"; break;
//                case 1: userR = "바위"; break;
//                case 2: userR = "보"; break;
//                default: userR = "잘못된 입력"; break;
//            }
//
//            // 2. 컴퓨터 랜덤 선택
//            int com = r.nextInt(3);
//            String comR = "";
//
//            switch (com) {
//                case 0: comR = "가위"; break;
//                case 1: comR = "바위"; break;
//                case 2: comR = "보"; break;
//            }
//
//            // 3. 승패 판정 및 결과 출력
//            System.out.println("- 당신: " + userR);
//            System.out.println("- 컴퓨터: " + comR);
//
//            if (user == com) {
//                System.out.println("=> 결과: 비겼습니다.");
//            } else if ((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
//                System.out.println("=> 결과: 당신이 이겼습니다!");
//            } else {
//                System.out.println("=> 결과: 컴퓨터가 이겼습니다.");
//            }
//        } // for 문 끝 (여기까지 10번 반복됨)
//
//        System.out.println("\n10판 게임이 모두 종료되었습니다.");
//        s.close();
//    }
//}

//
// // 확장 : 사용가자 원하는 횟수만큼 게임 진행
//package com.kopo.kangseo;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class TaskGaBaBo {
//    public static void main(String[] args) {
//        Random r = new Random();
//        Scanner s = new Scanner(System.in);
//
//        System.out.print("몇 판 하시겠습니까? ");
//        int count = Integer.parseInt(s.nextLine());
//        
//        // ★ for문 뒤에 반드시 { 를 열어주어야 합니다.
//        for (int i = 0; i < count; i++) { 
//            System.out.println("\n--- [" + (i + 1) + "번째 게임] ---");
//            System.out.println("숫자입력 (0:가위, 1:바위, 2:보)");
//            
//            // 1. 사용자 입력
//            int user = Integer.parseInt(s.nextLine());
//            String userR = "";
//
//            switch (user) {
//                case 0: userR = "가위"; break;
//                case 1: userR = "바위"; break;
//                case 2: userR = "보"; break;
//                default: userR = "잘못된 입력"; break;
//            }
//
//            // 2. 컴퓨터 랜덤 선택
//            int com = r.nextInt(3);
//            String comR = "";
//
//            switch (com) {
//                case 0: comR = "가위"; break;
//                case 1: comR = "바위"; break;
//                case 2: comR = "보"; break;
//            }
//
//            // 3. 승패 판정 및 결과 출력
//            System.out.println("- 당신: " + userR);
//            System.out.println("- 컴퓨터: " + comR);
//
//            if (user == com) {
//                System.out.println("=> 결과: 비겼습니다.");
//            } else if ((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
//                System.out.println("=> 결과: 당신이 이겼습니다!");
//            } else {
//                System.out.println("=> 결과: 컴퓨터가 이겼습니다.");
//            }
//        } // ★ for 문 끝 (여기가 count만큼 반복되는 지점)
//
//        System.out.println("\n모든 게임이 종료되었습니다.");
//        s.close();
//    }
//}
//


//// step 9. 종료 기능 추가(핵심) + step 10. 승리 횟수 저장  + step 11. 최종종합미션
//package com.kopo.kangseo;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class TaskGaBaBo {
//    public static void main(String[] args) {
//        Random r = new Random();
//        Scanner s = new Scanner(System.in);
//
//        int userWin = 0; // 사용자의 승리 횟수를 저장할 변수
//        int comWin = 0; //  컴퓨터의 승리 횟수를 저장할 변수
//        int draw = 0; //  무승부 횟수를 저장할 변수
//
//        while (true) {
//            System.out.println("\n[메뉴] 게임을 시작하려면 엔터, 종료하려면 q를 입력하세요:");
//            String input = s.nextLine();
//
//            // 1. 종료 기능 (q 입력 시)
//            if (input.equals("q")) {
//                System.out.println("게임 종료");
//                break; // while 무한 루프 종료
//            }
//
//            // 2. 판수 입력 받기
//            System.out.print("몇 판 하시겠습니까? ");
//            int count = Integer.parseInt(s.nextLine());
//
//            // 3. 입력받은 판수만큼 반복
//            for (int i = 0; i < count; i++) {
//                System.out.println("\n--- [" + (i + 1) + "번째 게임] ---");
//                System.out.println("숫자입력 (0:가위, 1:바위, 2:보)");
//
//                // 사용자 입력
//                int user = Integer.parseInt(s.nextLine());
//                String userR = "";
//
//                switch (user) {
//                    case 0: userR = "가위"; break;
//                    case 1: userR = "바위"; break;
//                    case 2: userR = "보"; break;
//                    default: userR = "잘못된 입력"; break;
//                }
//
//                // 컴퓨터 랜덤 선택
//                int com = r.nextInt(3);
//                String comR = "";
//                switch (com) {
//                    case 0: comR = "가위"; break;
//                    case 1: comR = "바위"; break;
//                    case 2: comR = "보"; break;
//                }
//
//                // 결과 출력
//                System.out.println("- 당신: " + userR);
//                System.out.println("- 컴퓨터: " + comR);
//
//                // 4. 승패 판정 및 카운트
//                if (user == com) {
//                    System.out.println("=> 결과: 비겼습니다.");
//                    draw++; // 무승부일때
//                } else if ((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
//                    System.out.println("=> 결과: 당신이 이겼습니다!");
//                    userWin++; // 사용자 이겼을 때 카운트를 1 올립니다.
//                } else {
//                    System.out.println("=> 결과: 컴퓨터가 이겼습니다.");
//                    comWin++; // 컴퓨터가 이겼을 때 카운트를 1 올립니다.
//                }
//            } // for 문 끝
//
//            System.out.println("\n선택하신 " + count + "판이 완료되었습니다.");
//            System.out.println("당신의 누적 승리 횟수: " + userWin + "회");
//            System.out.println("컴퓨터의 누적 승리 횟수: " + comWin + "회");
//            System.out.println("무승부 누적 횟수: " + draw + "회");
//            
//        } // while 문 끝
//
//        s.close();
//    }
//}


// 상위권용: 고급 기능 구현
package com.kopo.kangseo;

import java.util.Random;
import java.util.Scanner;

public class TaskGaBaBo {
    public static void main(String[] args) {
        // [준비물]
        Random r = new Random();   // 랜덤 숫자를 만들어주는 도구
        Scanner s = new Scanner(System.in); // 키보드 입력을 받는 도구
        
        // [배열 활용] 가위, 바위, 보 이름을 바구니에 순서대로 담아둡니다.
        // choices[0]은 "가위", choices[1]은 "바위", choices[2]은 "보"가 됩니다.
        String[] choices = {"가위", "바위", "보"};
        
        // [변수 설정] 통계를 내기 위해 기록장을 만듭니다.
        int userWin = 0;   // 내가 이긴 횟수
        int totalGames = 0; // 전체 게임 횟수

        System.out.println("=== 가위바위보 고급 게임을 시작합니다 ===");

        // [무한 반복] while(true)는 q를 누르기 전까지 계속 게임을 시켜줍니다.
        while (true) {
            System.out.println("\n숫자 입력 (0:가위, 1:바위, 2:보, q:종료)");
            String input = s.nextLine(); // 사용자가 친 글자를 가져옵니다.

            // 1. 종료 기능: 사용자가 q를 입력하면 루프를 탈출합니다.
            if (input.equals("q")) {
                System.out.println("\n--- [최종 게임 통계] ---");
                break; // while문을 즉시 종료하고 아래로 내려갑니다.
            }

            // 2. 숫자 변환: 사용자가 친 글자(input)를 진짜 숫자(user)로 바꿉니다.
            int user = Integer.parseInt(input);
            
            // 3. 컴퓨터 선택: 0, 1, 2 중 하나를 랜덤으로 고릅니다.
            int com = r.nextInt(3);

            // 4. 배열을 이용한 출력: switch문 없이도 choices[숫자] 만으로 이름을 출력합니다.
            System.out.println("나: " + choices[user] + " VS 컴퓨터: " + choices[com]);

            // 5. 게임 횟수 증가: 판이 진행될 때마다 전체 판수를 1씩 올립니다.
            totalGames++;

            // 6. 승패 판정 로직
            if (user == com) {
                System.out.println("=> 결과: 비겼습니다.");
            } else if ((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
                System.out.println("=> 결과: 당신이 이겼습니다! 🎉");
                userWin++; // 이겼을 때만 내 승리 횟수를 1 올립니다.
            } else {
                System.out.println("=> 결과: 컴퓨터가 이겼습니다. 🤖");
            }
            
            // 7. 현재 중간 성적 보여주기
            System.out.println("현재 성적: " + userWin + "승 " + (totalGames - userWin) + "패");
        }

        // [최종 승률 계산] (승리 횟수 / 전체 판수) * 100
        // (double)을 붙이는 이유는 소수점까지 정확하게 계산하기 위해서입니다.
        if (totalGames > 0) {
            double winRate = (double) userWin / totalGames * 100;
            System.out.println("총 판수: " + totalGames + "판");
            System.out.println("총 승리: " + userWin + "회");
            System.out.println("당신의 승률: " + winRate + "% 입니다!");
        } else {
            System.out.println("진행된 게임이 없습니다.");
        }

        s.close(); // 도구를 다 썼으니 닫아줍니다.
    }
}