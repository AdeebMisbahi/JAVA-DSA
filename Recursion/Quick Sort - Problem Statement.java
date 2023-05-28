/*
Sort an array A using Quick Sort.
Change in the input array itself. So no need to return or print anything.


Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)
Output format :
Array elements in increasing order (separated by space)
Constraints :
1 <= n <= 10^3
Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
Sample Input 2 :
5
1 2 3 5 7
Sample Output 2 :
1 2 3 5 7 
*/
public class Solution {
	public static int partition(int [] arr, int si, int ei){
     int pivotElement=arr[si];
	 int countSmallerThanPivotElement=0;

	 for(int i=si+1; i<=ei; i++){
        if(arr[i]<pivotElement){
			countSmallerThanPivotElement++;
		}
	 }
	 int temp=arr[countSmallerThanPivotElement+si];
	 arr[countSmallerThanPivotElement+si]=arr[si];
	 arr[si]=temp;
       int i=si;
	   int j=ei;
	   while(i<j){
		   if(arr[i]<pivotElement){
			   i++;
		   }else if(arr[j]>=pivotElement){
			   j--;
		   }
		   else{
			   int temp1=arr[i];
			   arr[i]=arr[j];
			   arr[j]=temp1;
			   i++;
			   j--;
		   }

	   }
	   return si+countSmallerThanPivotElement;

	}
	public static void quickSort(int [] arr, int si, int ei){
		if(si>=ei){
			return;
		}
		int pivotElement=partition(arr, si, ei);
		quickSort(arr, si, pivotElement-1);
		quickSort(arr, pivotElement+1, ei);
	}
	public static void quickSort(int[] input) {
	int si=0;
	int ei=input.length-1;
	quickSort(input, si, ei);
		
	}
	
}
