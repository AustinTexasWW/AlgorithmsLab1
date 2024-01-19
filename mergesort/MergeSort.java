package mergesort;

import java.util.Arrays;

public class MergeSort {
	static void merge(int arr[], int left, int middle, int right) {
		//list, start of sub array a, end of sub array a , end of sub array b
		int l1a[]=Arrays.copyOfRange(arr, left, middle+1);
		int l1b[]=Arrays.copyOfRange(arr, middle+1, right+1);
		int l1c[]=new int[arr.length];
		int i=0;
		int j=0;
		if(l1a[middle]>l1b[left]) {
			l1c[left]=l1a[middle];
			l1a[middle]=l1b[left];
			l1b[left]=l1c[left];
		}
		for(int k=0;k<arr.length;k++) {
			
			if(k<=middle) {
				arr[k]=l1a[i];
				i++;
				
			}
			else {
				arr[k]=l1b[j];
				j++;
			}
		}
	}
}
