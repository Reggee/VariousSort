package com.sort2;

public class MainClass {
		public static void main(String args[]){
			int[] textArr={13,3,5,8,34,2,7,6 };
			 //BubbleSort bs=new BubbleSort();
			//bs.bubbleSort(textArr);
			//SelectorSort ss=new SelectorSort();
			//ss.selectSort(textArr);
			//InsertSort is=new InsertSort();
			//is.insertSort(textArr);
			//QuickSort qs=new QuickSort();
			//qs.sort(textArr);
			/*HeapSort hp=new HeapSort();
			hp.heapSort(textArr);*/
			/*ShellSort ss=new ShellSort();
			ss.shellSort(textArr);*/
			MergeSort ms =new MergeSort();
			ms.mergeSort(textArr);
			for(int i=0; i<textArr.length;i++){
				System.out.print(textArr[i]+" ");
			}		
		}		
	}

