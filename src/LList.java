public class LList {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void display(){
        ListNode current =head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
    public int length(){
        if(head==null){
            return 0;
        }
        int count=0;
        ListNode current=head;
        while(current!=null){
            count++;
            current=current.next;

        }
        return count;
    }
    public void insertfirst(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }
    public static void main(String[] args) {
//        LList sll=new LList();
//        sll.head=new ListNode(10);
//        ListNode second=new ListNode(1);
//        ListNode third=new ListNode(8);
//        ListNode fourth=new ListNode(11);
//        sll.head.next=second;
//        second.next=third;
//        third.next=fourth;
//        sll.display();
//        System.out.println(sll.length());
        LList sll=new LList();
        sll.insertfirst(11);
        sll.insertfirst(8);
        sll.insertfirst(5);
        sll.display();
        System.out.println(sll.length());
    }
}
