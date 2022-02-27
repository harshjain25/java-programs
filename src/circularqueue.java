import java.util.Scanner;
class cir_queue{
    int f=-1,r=-1;
    int n=5;
    int[] q=new int[n];
    void enqueue(Scanner sc){
        if(f==(r+1)%n){
            System.out.println("overflow condition");
        }
        else{
            System.out.println("enter data: ");
            int i=sc.nextInt();
            if(f==-1 && r==-1){
                f=0;
                r=0;
                q[r]=i;
            }
            else{
                r=(r+1)%n;
                q[r]=i;
            }
        }
    }
    void dequeue(){
        if(f==-1 && r==-1){
            System.out.println("underflow");
        }
        else if(f==r){
            System.out.println("underflow");
            f=0;
            r=0;
        }
        else{
            f=f+1;
        }
    }
    void display(){
        int i;
        System.out.println("items are:");
        for(i=f;i!=r;i=(i+1)%n){
            System.out.println(q[i]);
        }
        System.out.println(q[i]);
    }
}

public class circularqueue {
    public static void main(String[] args) {
        int d;
        Scanner sc=new Scanner(System.in);
        cir_queue s=new cir_queue();
        int l;
        do{
            System.out.println("enter 1 to enqueue");
            System.out.println("enter 2 to dequeue");
            System.out.println("enter 3 to display");
            System.out.println("enter your choice");
            d=sc.nextInt();
            switch(d){
                case 1:{
                    s.enqueue(sc);
                    break;
                }
                case 2:{
                    s.dequeue();
                    break;
                }
                case 3:{
                    s.display();
                    break;
                }
            }
            System.out.println("enter 0 to go back to main menu");
            System.out.println("enter any key to exit");
            l=sc.nextInt();
        } while(l==0);
        System.out.println("exit successfully");
    }
}
