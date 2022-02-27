import java.util.Scanner;
class queue1{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node f=null;
    Node r=null;

    public void enqueue(Scanner sc){
        System.out.println("Enter data");
        int data=sc.nextInt();
        Node newnode=new Node(data);
        if(f==null){
            f=newnode;
            r=newnode;
        }
        else{
            r.next=newnode;
            r=newnode;
        }
    }

    public void dequeue(){
        if(f==null){
            System.out.println("underflow");
        }
        else{
            f=f.next;
        }
    }

    public void display(){
        Node temp=f;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

public class queue_LL {
    public static void main(String[] args) {
        int d,l;
        Scanner sc=new Scanner(System.in);
        queue1 s=new queue1();
        do{
            System.out.println("enter 1 to enqueue");
            System.out.println("enter 2 to dequeue");
            System.out.println("enter 3 to display");
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
