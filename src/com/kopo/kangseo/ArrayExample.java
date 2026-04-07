//package com.kopo.kangseo;
//
//import java.util.Arrays;
//
//public class ArrayExample {
//
//	public static void main(String[] args) {
//		// 1. 참조 (Reference)
//		int[] a = {1, 2, 3};
//		int[] b = a; // 주소 복사 (얕은 복사)
//		b[0] = 10;
//		System.out.println(a[0]); // 10 (a도 바뀜)
//		
//		// 2. 깊은 복사 (Deep Copy)
//		int[] c = new int[3];
//		
//		// a배열 0번부터 c배열 0번으로 3개 복사
//		System.arraycopy(a, 0, c, 0, 3);
//		c[0] = 999;
//		System.out.println(a[0]); // 10 (a 영향 없음)
//		System.out.println(c[0]); // 10 (a 영향 없음)
//		
//		
//		// 3. 정렬 (Sort)
//		int[] arr = {5, 1, 9, 3};
//		Arrays.sort(arr); // [1, 3, 5, 9]
//		System.out.println(Arrays.toString(arr));
//		 
//		int[][] src = {{1,2,3},{4,5,6}};
//		int[][] dest = new int[2][4];
//		
//		for(int i=0;i<src.length;i++) {
//			System.arraycopy(src[i],0,dest[i],0,src[i].length);
//		}
//		
//		System.out.println(Arrays.deepToString(dest));
//		System.out.println(Arrays.toString(dest));
//
//	}
//
//}






//package com.kopo.kangseo;
//import java.util.Arrays;
//public class ArrayExample {
//
//	public static void main(String[] args) {
//		int[][] aa = new int[5][5];
//				
//		for (int x = 0; x < aa.length; x++) {
//			for (int y = 0; y < aa.length; y++) {
//				System.out.println("(" + x +","+ y + ")");
//			}			
//			System.out.println();
//		}
//		
//	}
//		
//}




//package com.kopo.kangseo;
//
//public class ArrayExample {
//    public static void main(String[] args) {
//        // 1. 5x5 배열 선언 (이미지 기준)
//        int[][] aa = new int[5][5];
//
//        // 2. 가로 순회: 2행의 모든 열 (2,0) ~ (2,4)
//        System.out.println("--- 가로 순회 (2행) ---");
//        for (int y = 0; y < 5; y++) {
//            System.out.print("(" + 2 + "," + y + ") ");
//        }
//        
//        System.out.println("\n");
//
//        // 3. 세로 순회: 2열의 모든 행 (0,2) ~ (4,2)
//        System.out.println("--- 세로 순회 (2열) ---");
//        for (int x = 0; x < 5; x++) {
//            System.out.print("(" + x + "," + 2 + ") ");
//        }
//    }
//}



package com.kopo.kangseo;

public class ArrayExample {
    public static void main(String[] args) {
        // 1. 5x5 배열 선언 (이미지 기준)
        int[][] aa = new int[5][5];
      
        System.out.println("--- 좌우 아래로 대각선 ---");
        for (int x = 0; x >= 5; x++) {
          System.out.print("(" + x + "," + x + ") ");
          
      }
        System.out.println("\n");
        
        System.out.println("--- 좌우 위로 대각선 ---");
        for (int x = 4; x < 5; x-=1) {
        	for(int y = 0; y < 5; y++) {
        		if (x + y == 4)
        		System.out.print("(" + x + "," + y + ") ");
        	}
        }
      }
    
    }
 

