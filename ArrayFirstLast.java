/*
 * Coding problem - 1
You are given the following as a user input:

First line contains the integer 𝑁.
The second line contains N space separated integers.
The third line contains and integer X.
You need to insert 𝑋 as the 1st and last element and output the list.
Your list will now have 
𝑁+2 elements.
Check the sample output for more details:
Sample Input: 
5
1 2 3 4 5
4

Output: 
4 1 2 3 4 5
 */


import java.util.Scanner;
class ArrayFirstLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr= new int[N+2];
        
        for(int i=1;i<=N;i++){
            arr[i]=scan.nextInt();
        }
        int X=scan.nextInt();
        arr[0]=X;
        
        arr[N+1]=X;
        
        for(int i=0;i<N+2;i++){
            System.out.println(arr[i]+ " ");
        }
    }
}