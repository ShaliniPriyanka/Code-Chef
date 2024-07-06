/*Coding problem - 2
Chef's coding journey continues.
Chef was given an integer input 
𝑁
N.

He wrote a code using WHILE loops to output the factorial of N.
But he wasn't able to complete some parts of the code.
Help him complete his code.

Note: The factorial of a number 
𝑁
N is the product of each number from 1 to 
𝑁
N.
𝑁
!
N!(N factorial)
=
1
×
2
×
3
×
.
.
.
.
.
𝑁
=1×2×3×.....N
*/
import java.util.Scanner;
class Codechef{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int factorial =1;
        int i=1;
        while(i<=N){
            factorial*=i;
            i++;
        }
        System.out.println(factorial);
    }
}