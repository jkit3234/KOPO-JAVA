package kopo.com.sorting;

import java.util.Arrays;

public class SortingEx4 {

	public static void main(String[] args) {
		Integer[] myArr = {5,3,20,1,0,100};
		
		Arrays.sort(myArr, (i,j)->{
			return j - i;
		});
		
		System.out.println(Arrays.toString(myArr));
	}

}