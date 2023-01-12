//import java.util.Scanner;
//public class Recursion1 {
//    public int fact(int n){
//        int smallvaue=fact(n-1); //representation of head recursion
//        return n*smallvaue;
//    }
//    public int fact(int n,int sum){
//        if(n==0 || n==1){
//            return 1;
//        }
//        fact(n-1,sum*n); // representation of tail recursion because recursion call is the last call.
//    }
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(fact(n));
//        System.out.println(fact(5,1));
//    }
//}
