package com.sort2;

public class SelectorSort {
  public static void selectSort(int[] arr){
	  if(arr ==null|| arr.length==0){
		  return;
	  }
	  int minIndex=0; 
	  for(int i=0;i<arr.length-1;i++){
		  minIndex=i;
		  for(int j=i+1;j<arr.length-1;j++){
			  if(arr[j]<arr[minIndex]){
				  minIndex=j;
			  }
		  }
		  if(minIndex!=i){
			  swap(arr,i,minIndex);
		  }
		  /**
		   * complexity=O(n^2)
		   */
	  }
  }

private static void swap(int[] arr, int i, int minIndex) {
	int temp=arr[i];
	arr[i]=arr[minIndex];
	arr[minIndex]=temp;
	
}
}
