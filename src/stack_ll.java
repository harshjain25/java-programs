import java.util.Scanner;

class stack1{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node top=null;
    public void push(Scanner sc){
        System.out.println("enter data");
        int data=sc.nextInt();
        Node newnode=new Node(data);
        if(top==null){
            top=newnode;
        }
        else{
            newnode.next=top;
            top=newnode;
        }
    }
    public void pop(){
        if(top==null){
            System.out.println("stack is empty");
        }
        else{
            top=top.next;
        }
    }
    public void display(){
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
public class stack_ll {
    public static void main(String[] args) {
        int d;
        Scanner sc=new Scanner(System.in);
        stack1 s=new stack1();
        int l;
        do {
            System.out.println("enter 1 to push");
            System.out.println("enter 2 to pop");
            System.out.println("enter 3 to display");
            System.out.println("enter your choice");
            d = sc.nextInt();
            switch (d) {
                case 1: {
                    s.push(sc);
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
            System.out.println("enter 0 to go back to main menu");
            System.out.println("enter any key to exit");
            l = sc.nextInt();
        } while(l==0);
        System.out.println("exit successfully");
        }
    }

