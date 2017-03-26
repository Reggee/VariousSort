package com.sort2;

public class InsertSort {

	public static void insertSort(int [] arr){
		/*
		 * 5 3 1 4 2
		 *   i
		 *   j
		 * 3 5 1 4 2 
		 * 1 3 5 4 2
		 * 1 3 4 5 2
		 * complexity O(n^2)
		 */
		if(arr==null||arr.length==0){
			return;
		}
		for(int i=1;i<arr.length;i++){//hyposis the first is the right place
			int j=i;
			int target=arr[i]; //choosed to insert
		//move backward
			while(j>0 && target<arr[j-1]){
				arr[j] =arr[j-1];
				j --;
			}
		//insert
			arr[j]=target;
		}
	
}
}
