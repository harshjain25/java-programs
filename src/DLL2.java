import java.util.NoSuchElementException;

public class DLL2 {
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public DLL2() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isempty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public int count() {
        int cnt=0;
        ListNode temp1=head;
        while(temp1!=null){
            temp1=temp1.next;
            cnt++;
        }
        return cnt++;
    }


    public void insertfirst(int data) {
        ListNode newnode = new ListNode(data);
        if (isempty()) {
            tail = newnode;
        } else {
            head.previous = newnode;
        }
        newnode.next = head;
        head = newnode;
        length++;
    }

    public void insertlast(int data) {
        ListNode newnode = new ListNode(data);
        if (isempty()) {
            head = newnode;
        } else {
            tail.next = newnode;
            newnode.previous = tail;

        }
        tail = newnode;
        length++;
    }

    public void insertatany(int index, int data) {
        if (index < 0 || index > count() + 1) {
            System.out.println("invalid position");
            return;
        }
        ListNode newnode=new ListNode(data);
        if(index==0){
            if(isempty()){
                tail=newnode;
            }
            else{
                head.previous=newnode;

            }
            newnode.next=head;
            head=newnode;
        }
        else if(index==count()-1){
            if(isempty()){
                head=newnode;
            }
            else{
                tail.next=newnode;
            }
            newnode.previous=tail;
            tail=newnode;
        }
        else{
            ListNode temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=newnode;
            //newnode.next=temp.next;
            newnode.previous=temp.next;

        }
    }

    public ListNode deletefirst(){
        if(isempty()){
            throw new NoSuchElementException();
        }
        ListNode temp=head;
        if(head==tail){
            tail=null;
        }
        else{
            head.next.previous=null;
        }
        head=head.next;
        temp.next=null;
        length--;
        return temp;
    }

    public ListNode deletelast(){
        if(isempty()){
            throw new NoSuchElementException();
        }
        ListNode temp=tail;
        if(head==tail){
            head=null;
        }
        else{
            tail.previous.next=null;
        }
        tail=tail.previous;
        temp.previous=null;
        length--;
        return temp;
    }

    public void showforward(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void showbackward(){
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

    public static void main(String[] args) {
        DLL2 list=new DLL2();
        list.insertfirst(10);
        list.insertlast(50);
        list.insertatany(1,20);
        list.insertatany(2,30);
        list.insertatany(3,40);
        list.showforward();
        list.deletefirst();
        list.showforward();
        list.deletelast();
        list.showforward();
        
    }
}