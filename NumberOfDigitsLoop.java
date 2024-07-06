import java.util.Scanner;;
class Codechef{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int num;
        num=scanner.nextInt();
        int count =0;
        while(num!=0){
            count=count+1;
            num/=10;
        }
        System.out.println(count);
    }
}