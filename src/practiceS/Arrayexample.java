package practiceS;

public class Arrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1. 값으로 초기화 (선언과 동시에 값 할당)
		int[] num = {10, 11, 12, 13, 14, 15};
		String[] weekDay = {"월", "화", "수", "목", "금", "토", "일"};
		
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
	
		for(int i=0; i<weekDay.length; i++) {
			System.out.println(weekDay[i]);
		}
		
		System.out.println(Array.toString);

		// 2. new 키워드로 크기 지정 (기본값으로 초기화)
		int[] arr = new int[5]; // 0으로 초기화됨
		String[] str = new String[7]; // null로 초기화됨
		

	}

}
