/*
 Coding problem - 2
You are given the following as a user input:
First line contains the integer N.
The second line contains 𝑁 space separated integers.
The third line contains an integer 𝑋.

You need to delete all occurrences of 
𝑋
X from the list and output the new list.
Check the sample output for more details:

Sample Input:
5
1 3 5 3 9
3

Output:
1 5 9
 */

import java.util.Scanner;

class ArrayDeleteSpeificElement{
	public static void main (String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		int N= scan.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]= scan.nextInt();
		}
		int X= scan.nextInt();
		int size=0;
		
		for(int i=0;i<N;i++){
		    if(arr[i]!=X){
		        arr[size]=arr[i];
		        size++;
		    }
		}
		
		for(int i=0; i<size;i++){
		    System.out.println(arr[i]+ " ");
		}

	}
}
