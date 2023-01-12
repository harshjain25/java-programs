import java.util.Scanner;

class A3{
    public static void print(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("harsh");
        print(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        print(i,n);
    }
}