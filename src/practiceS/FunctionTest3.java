package practiceS;

import java.util.*;
public class FunctionTest3 {

	 // 1. 더하기 함수 (두 정수를 받아서 합을 리턴)
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. 빼기 함수
    public static int subtract(int a, int b) {
        return a - b;
    }

    // 3. 곱하기 함수
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 4. 나누기 함수 (나눗셈은 소수점이 나올 수 있으므로 double 사용 권장)
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int n = sc.nextInt();
        System.out.print("두 번째 숫자: ");
        int m = sc.nextInt();

        // 함수 호출하여 결과 출력
        System.out.println("더하기: " + add(n, m));
        System.out.println("빼기: " + subtract(n, m));
        System.out.println("곱하기: " + multiply(n, m));
        System.out.println("나누기: " + divide(n, m));
        
        sc.close(); // Scanner를 닫아주는 것이 좋습니다.
    }
}
