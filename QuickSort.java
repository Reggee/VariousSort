package com.sort2;

public class QuickSort {
	//first time to divide
	public static int partition(int[] arr, int left, int right){
		int pivotKey= arr[left];
		int pivotPointer=left;
		
		while (left < right){
			while(left < right && arr[right] >= pivotKey)
				right--;
			while(left < right && arr[left] <= pivotKey)
				left++;
			swap(arr, left, right);//move bigger one to right, move the less one to left
		}
		swap(arr,pivotPointer, left);//最后把pivot交换到中间
		return left;
	}
	

	public static void quickSort(int[] arr, int left, int right){
		if(left>=right)
			return;
		int pivotPos = partition(arr, left, right);
		quickSort(arr, left, pivotPos-1);
		quickSort(arr, pivotPos+1, right);
	}
	
	public static void sort(int[] arr){
		if(arr==null||arr.length==0){
			return;
		}
		quickSort(arr, 0, arr.length-1);
	}
	private static void swap(int[] arr, int left, int right) {
		int temp= arr[left];
		arr[left]= arr[right];
		arr[right]=temp;
		
	}
}
