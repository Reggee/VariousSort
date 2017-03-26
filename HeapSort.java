package com.sort2;

public class HeapSort {

	public static void heapAjust(int[] arr, int start, int end){
		int temp=arr[start];
		
		for(int i=2*start+1; i<=end; i++){
			//左右孩子的节点分别是2*i+1,2*i+2 (从0开始)
			
			if(i<end && arr[i]<arr[i+1]){
				i++;
			}
			if(temp >= arr[i]){
				break;//already max heap
			}
			arr[start]=arr[i];//move up child node
			start =i;//next round select
		}
		
		arr[start] =temp;//insert right place
	}
	
	public static void heapSort(int[] arr){
		if(arr==null||arr.length==0)
			return;
		
		//create max heap
		for(int i=arr.length/2; i>=0;i--){
			heapAjust(arr, i, arr.length-1);
		}
		
	    for(int i=arr.length-1; i>=0;i--){
			swap(arr, 0,i);
			heapAjust(arr, 0, i-1);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp= arr[i];
		arr[i]= arr[j];
		arr[j]= temp;
		
	}
	
}
