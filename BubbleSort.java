package com.sort2;

public class BubbleSort {

	public static void bubbleSort(int [] arr){
		if(arr ==null || arr.length==0)
		{
			return; 
		}
		for (int i=0;i<arr.length-1;i++ )
		{
			for(int j=arr.length-1; j>i;j--){
				if(arr[j]<arr[j-1]){
					swap(arr,j-1,j);
				}
				/*5 2 3 1 4 
				  1 5 2 3 4
				  1 2 5 3 4 
				  1 2 3 5 4
				  1 2 3 4 5  ...O(n^2) */  
			}
				
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i] =arr[j];
		arr[j]=temp;
	}
}

