/*
 * Coding Problem - 3
 * You need to merge the lists such that your output is a single list - List 1 + List 2 + List 1.
Check the sample output below:

Sample Input:
5 5
1 3 5 7 9
1 2 3 4 5

Sample Output:
1 3 5 7 9 1 2 3 4 5 1 3 5 7 9
 */

import java.util.Scanner;

class MergeTwiceArray{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
		int N,X;
		N=scan.nextInt();
		X=scan.nextInt();
		
		int[] arr1= new int[N];
		int[] arr2= new int[X];
		
		for(int i=0;i<N;i++){
		    arr1[i]=scan.nextInt();
		}
		for(int i=0;i<X;i++){
		    arr2[i]=scan.nextInt();
		}
		
		int merge=N+X+N;
		int[] mergeArray= new int[merge];
		
		for(int i=0;i<N;i++){
		    mergeArray[i]= arr1[i];
		}
		for(int i=0;i<X;i++){
		    mergeArray[N+i]=arr2[i];
		}
		for(int i=0;i<N;i++){
		    mergeArray[N+X+i]=arr1[i];
		}
		
		for(int i=0;i<merge;i++){
		    System.out.println(mergeArray[i]+" ");
		}
	}
}
