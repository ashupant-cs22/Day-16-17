package Day16and17;

public class SelectionSort {

	 public static void printArray(int arr[]) {
	       for(int i=0; i<arr.length; i++) {
	           System.out.print(arr[i]+" ");
	       }
	       System.out.println();
	   }
	 
	   public static void main(String args[]) {
	       int arr[] = {57, 68, 11, 23, 45};
	       
	       //selection sort
	       for(int i=0; i<arr.length-1; i++) {
	           int smallest = i;
	           for(int j=i+1; j<arr.length; j++) {
	               if(arr[j] < arr[smallest]) {
	                   smallest = j;
	               }
	           }
	           //swapping 
	           int temp = arr[smallest];
	           arr[smallest] = arr[i];
	           arr[i] = temp;
	       }
	 
	       printArray(arr);
	   }


}
