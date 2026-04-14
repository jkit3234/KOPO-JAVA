package com.kopo.kangseo;
import java.util.Arrays; 

public class Quiz1 {
    public static void main(String[] args) {
        
    	
    	// 기존 조건 및 초기 배열
    	 // 1. 초기 배열 선언
        int[] arr = {1, 3, 3, 4, 5, 2, 6, 7, 6, 7};
        
         //2. 콘솔 출력 요구사항
        System.out.print("초기 배열: ");
        for(int n : arr) System.out.print(n + " ");
        System.out.println("\n");
        
       
       //조건1: 중복데이터 제거
        int[] temp = new int[arr.length];
        int count = 0;
        System.out.println("중복 제거 과정:");

        for (int n : arr) {
            boolean isDuplicate = false;

            for (int i = 0; i < count; i++) {
                if (temp[i] == n) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                System.out.println(n + " 중복이라 제거됨");
            } else {
                temp[count] = n;
                count++;
                System.out.println(n + " 추가됨");
            }
        }

        
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
     
     //조건 2: 내림차순 정렬 (버블 정렬)

        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - 1 - i; j++) {
                
              
                if (result[j] < result[j + 1]) {
                	
                    //위치변경(swap) 발생 시 출력
                    System.out.println("swap 발생: " + result[j] + " <-> " + result[j + 1]);
                    
                    int storage = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = storage;
                }
            }
        }

        // 최종 결과
        System.out.print("\n최종 결과: ");
        for (int n : result) {
            System.out.print(n + " ");
        }  
        
    }  
}      
