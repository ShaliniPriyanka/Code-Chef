/*
 Coding problem - 1
Chef was given an integer input N.

He wants to write a code using while loops to output the sum of all integers from 1 to 
𝑁
N.
Help him complete the code by filling the blanks.
 */
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        int N, sum = 0;
        N = scanner.nextInt();
        int i=0;
        while (i <= N) {
            sum += i;
            i++;
        }
        System.out.println(sum);
	}
}

