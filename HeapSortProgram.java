import java.util.*;

class HeapSortProgram {
  public static int[] heapSort(int[] array) {
    sort(array);
		return array;
  }
	
	public static void sort(int[] arr){
        int len = arr.length;
        for(int i=len/2 - 1; i>=0; i--){ //(len/2)-1 last parent node layer hoga
            heapify(arr, len, i); // i position mai max layega
        }
        for(int i=len-1; i>=0; i--){
            int temp=arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0); // root mai max layega
        }
    }

    public static void heapify(int[] arr, int len, int i){
        int largestIndex = i;
        int leftIndex = 2*i+1;
        int rightIndex = 2*i+2;

        if(leftIndex<len && arr[leftIndex]>arr[largestIndex]){
            largestIndex = leftIndex;
        }
        if(rightIndex<len && arr[rightIndex]>arr[largestIndex]){
            largestIndex = rightIndex;
        }
        if(largestIndex!=i){
           int temp = arr[i];
           arr[i] = arr[largestIndex];
           arr[largestIndex] = temp;
           heapify(arr, len, largestIndex);
        }
    }
	
	
}
