package com.sort2;

/**
 * 希尔排序的一趟插入
 * @param arr 待排数组
 * @param d 增量
 */

public class ShellSort {

	public static void shellInsert(int[] arr,int d){
		
		for(int i=d; i<arr.length;i++){
			int j= i-d;
			int temp = arr[i];  //save wait to insert data
			
			while(j>=0 && arr[j]>temp){ //从后向前，找到比其小的数的位置   
				
				arr[j+d] = arr[j]; //move backward
				j-=d;
			}
			
			if(j!=i-d) // have other smaller data
				arr[j+d]=temp;
		}
	}
	
	public static void shellSort(int[] arr){
		if(arr== null|| arr.length==0)
			return; 
		int d=arr.length/2; 
		
		while(d >=1){
			shellInsert(arr, d);
			d/=2;
		}
	}
}
