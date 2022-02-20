import java.util.NoSuchElementException;

public class CLL {
    private ListNode last;
    private int length;

    class ListNode{
        private ListNode next;
        private int data;

        public ListNode(int data){
            this.data= data;
        }
    }

    public CLL(){
        last=null;
        length=0;
    }

    public int length(){
        return length;
    }

    public boolean isempty(){
        return length==0;
    }

    public int count(){
        if(last==null){
            return 0;
        }
        ListNode first=last.next;
        int cnt=0;
        while(first!=last){
            cnt++;
            first=first.next;
        }
        return cnt++;
    }

    public void display(){
        if(last==null){
            return;
        }
        ListNode first=last.next;
        while(first!=last){
            System.out.print(first.data+ " -> ");
            first=first.next;
        }
        System.out.print(first.data);
        System.out.println("");
    }

    public void insertfirst(int data){
        ListNode temp=new ListNode(data);
        if(last==null){
            last=temp;
        }
        else{
            temp.next=last.next;
        }
        last.next=temp;
        length++;
    }

    public void insertlast(int data){
        ListNode temp=new ListNode(data);
        if(last==null){
            last=temp;
        }
        else{
            temp.next=last.next;
            last.next=temp;
            last=temp;
        }
        length++;
    }

    public void insertat(int pos,int data){
        if(pos<1 || pos>count()+1){
            System.out.println("invalid position");
            return;
        }
        ListNode newnode=new ListNode(data);
        if(last==null){
            last=newnode;
            last.next=newnode;
            return;
        }
        if(pos==1){
            newnode.next=last.next;
            last.next=newnode;
            last=newnode;
            return;
        }
        if(pos>count()+1){
            newnode.next=last.next;
            last.next=newnode;
            last=newnode;
            return;
        }
        ListNode previous=last.next;
        int count=1;
        while(count<pos+1){
            count++;
            previous=previous.next;
        }
        newnode.next=previous.next;
        previous.next=newnode;
        previous=newnode;

    }

    public ListNode removefirst(){
        if(isempty()){
            throw new NoSuchElementException();
        }
        ListNode temp=last.next;
        if(last.next==last){
            last=null;
        }
        else{
            last.next=temp.next;
        }
        temp.next=null;
        length--;
        return temp;
    }

    public int removelast(){
        if(last==null){
            return 0;
        }
        if(last.next==last){
            ListNode temp=last;
            last.next=null;
            last=null;
            return temp.data;
        }
        ListNode first=last.next;
        while(first.next==last){
            first=first.next;
        }
        ListNode current=first.next;
        first.next=last.next;
        last.next=null;
        last=first;
        return current.data;
    }

    public static void main(String[] args) {
        CLL list=new CLL();
        list.insertfirst(10);
        list.display();
        list.insertlast(40);
        list.display();
        list.insertat(2,20);
        list.display();
        list.insertat(3,30);
        list.display();
        list.removefirst();
        list.display();
        System.out.println(list.removelast());
        list.display();

    }
}
