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
