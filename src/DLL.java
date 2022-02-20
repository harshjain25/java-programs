import java.util.List;

public class DLL {
    private ListNode head;
    private ListNode tail;
    private int length;
    class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;
        public ListNode(int data){
            this.data=data;
        }
    }
    public DLL(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isempty(){
        return length==0;
    }
    public int length(){
        return length;
    }
    public int count(){
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public void displayforward(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data +" - > ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void displaybackward(){
        if(tail==null){
            System.out.println("list is empty");
            return;
        }
        ListNode temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.previous;
        }
        System.out.println("null");
    }
    public void addfirst(int data){
        ListNode newnode=new ListNode(data);
        if(isempty()){
            tail=newnode;
        }
        else{
            head.previous=newnode;
        }
        newnode.next=head;
        head=newnode;
        length++;
    }
    public void addlast(int data){
        ListNode newnode=new ListNode(data);
        if(isempty()){
            head=newnode;
        }
        else{
            tail.next=newnode;
            newnode.previous=tail;
        }
        tail=newnode;
        length++;
    }
    public void insertat(int pos,int data){
        if(pos<0 || pos>count()+1){
            System.out.println("invalid position");
            return;
        }
        ListNode newnode=new ListNode(data);
        if(pos==0){
            addfirst(data);
        }
        else if(pos==1){
            newnode.next=head;
            head.previous=newnode;
            head=newnode;
        }
        else if(pos==count()+1){
            newnode.next=tail.next;
            tail.next=newnode;
            newnode.previous=tail;
            tail=newnode;
        }
        else{
            int count1=0;
            ListNode current=head;
            while(count1<pos){
                current=current.next;
                count1++;
            }
            newnode.next=current;
            current.next=newnode;
            newnode.previous=current;
            current.next=newnode;
            newnode.previous=current;
        }
    }

    public static void main(String[] args) {
        DLL list=new DLL();
        list.addfirst(10);
        list.addlast(20);
        list.insertat(2,15);
        list.displayforward();
        list.displaybackward();

    }
}
