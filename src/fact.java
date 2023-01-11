import java.util.Scanner;

public class fact {
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        n*=factorial(n-1);
        return n;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
}
