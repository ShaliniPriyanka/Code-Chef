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