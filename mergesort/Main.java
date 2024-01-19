package mergesort;

import java.util.Arrays;

public class Main {
	public static void main(String[] arg) {
		int l1[]={0,2,1,18,20};
		int l2[]={19,2,20,1,0,18};
		int l3[]= {56,28,92,51,85,41,72};
		mergeSort(l1,0,4);
		System.out.println(Arrays.toString(l1));
		mergeSort(l2,0,5);
		System.out.println(Arrays.toString(l2));
		mergeSort(l3,0,6);
		System.out.println(Arrays.toString(l3));
	}
	static void merge(int arr[], int left, int middle, int right) {
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
