package kopo.com.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortingEx1 {

	public static void main(String[] args) {
		Integer[] myArr = {5,3,20,1,0,100};
		
		//Arrays.sort(myArr, Collections.reverseOrder());
		myCompareClass mcc = new myCompareClass();
		Arrays.sort(myArr, mcc);
		
		System.out.println(Arrays.toString(myArr));
	}

}

class myCompareClass implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
	
}