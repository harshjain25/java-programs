import java.util.Scanner;

class stack {
    Scanner sc =new Scanner(System.in);
    int n=10;
    int top=-1;
    int[] a=new int[n];
    void push(){
        if(top==n-1){
            System.out.println("overflow");
        }
        else{
            int i=sc.nextInt();
            top=top+1;
            a[top]=i;
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("underflow");
        }
        else{
            top=top-1;
        }
    }
    void display(){
        for(int j=top;j<=0;j--){
            System.out.print(a[j]+ " -> ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int d;
        Scanner sc = new Scanner(System.in);
        stack s = new stack();
        int l;
        do {
            System.out.println("press 1 to push");
            System.out.println("press 2 to pop");
            System.out.println("press 3 to display");
            d = sc.nextInt();
            switch (d) {
                case 1: {
                    s.push();
                    break;
                }
                case 2: {
                    s.pop();
                    break;
                }
                case 3: {
                    s.display();
                    break;
                }
            }
            System.out.println();
            System.out.println("enter any key to exit");
            l = sc.nextInt();
        } while (l == 0) ;
        System.out.println("exit successfully");
        }

}
