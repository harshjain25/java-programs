//class Node{
//    int data;
//    Node next;
//    public Node(int data){
//        this.data=data;
//    }
//}
//class SinglyLinkedList{
//    Node head;
//    public void insertAtLast(Node newnode){
//        if(head==null){
//            head=newnode;
//        }
//        else{
//            Node temp=head;
//            while(temp.next!=null){
//
//                temp=temp.next;
//            }
//            temp.next=newnode;
//        }
//    }
//    public void display(){
//        if(head==null){
//            System.out.println("list is empty");
//        }
//        else{
//            Node temp=head;
//            while(temp!=null){
//                System.out.println(temp.data);
//                temp=temp.next;
//            }
//        }
//    }
//
//    public void insertatPosition(int pos,Node newnode){
//        Node temp =head;
//        for(int i = 0; i < pos-1; i++) {
//            temp=temp.next;
//        }
//        newnode.next=temp.next;
//        temp.next=newnode;
//    }
//}
//public class ttt {
//    public static void main(String[] args) {
//        SinglyLinkedList obj1=new SinglyLinkedList();
//        SinglyLinkedList obj2=new SinglyLinkedList();
//        obj1.insertAtLast(new Node(10));
//        obj1.display();
//    }
//}
