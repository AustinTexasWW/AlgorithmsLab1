package mergesort;

import java.util.Arrays;

public class MergeSort {
	static void mergeSort(int arr[], int left, int right) {
		merge(arr,0,left,right);
		for(int i=0;i<=right-1;i++) {
			boolean s=false;
			for(int j=0;j<=right-1;j++) {
				if(arr[j]>arr[j+1]) {
					s=false;
					break;
				}
				else {
					s=true;
				}
			}
			if((arr[i]>arr[i+1])&&(left!=right-1)&&(s==false)) {
				mergeSort(arr,left+1,right);
			}
			if((left==right-1)&&(s==false)) {
				mergeSort(arr,i,right);
			}
		}
	}
}
