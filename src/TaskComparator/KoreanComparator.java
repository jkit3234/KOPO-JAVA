package TaskComparator;

import java.util.Comparator;

public class KoreanComparator implements Comparator<Student> {

    @Override
//    public int compare(Student a, Student b) {
//        return b.korean - a.korean;  // 내림차순 (높은 점수가 먼저) -> 국어만 비교
//    }
    
    public int compare(Student a, Student b) {
    	
    	//1순위 : 국어 비교
    	if (b.korean != a.korean) {
    		return b.korean - a.korean;
    	}
    	
    	//2순위 : 국어 동점이면 영어 비교
    	if (b.english != a.english) {
    		return b.english - a.english;
    	}
    	
    	//3순위 : 영어 동점이면 수학 비교
        	return b.math - a.math;
    		
    		
    	
    	
    }
    
}  


