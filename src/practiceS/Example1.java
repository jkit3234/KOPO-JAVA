package practiceS;

import java.util.*;

public class Example1 {

	public static void main(String[] args) {

		
	// 사용자의 입력을 받아서 그대로 프린트
	Scanner sc = new Scanner(System.in);
	
	System.out.println("숫자 입력하세요.");
	int num = sc.nextInt();
	
	System.out.println("num is "+num);
	System.out.printf("num is %d\n",num);

	System.out.printf("num is %3d\n",num);
	System.out.printf("num is %40d\n",num);
	System.out.printf("num is %50d\n",num);
	System.out.printf("num is %60d\n",num);
	}

}