//class InsertAtStart {
//    //Represents the node of list.
//    public class Node{
//        int data;
//        Node next;
//        public Node(int data) {
//            this.data = data;
//        }
//    }
//
//    //Declaring head and tail pointer as null.
//    public Node head = null;
//    public Node tail = null;
//
//    //This function will add the new node at the end of the list.
//    public void addAtStart(int data){
//        //Create new node
//        Node newNode = new Node(data);
//        //Checks if the list is empty.
//        if(head == null) {
//            //If list is empty, both head and tail would point to new node.
//            head = newNode;
//            tail = newNode;
//            newNode.next = head;
//        }
//        else {
//            //Store data into temporary node
//            Node temp = head;
//            //New node will point to temp as next node
//            newNode.next = temp;
//            //New node will be the head node
//            head = newNode;
//            //Since, it is circular linked list tail will point to head.
//            tail.next = head;
//        }
//    }
//
//    public void addAtEnd(int data){
//        //Create new node
//        Node newNode = new Node(data);
//        //Checks if the list is empty.
//        if(head == null) {
//            //If list is empty, both head and tail would point to new node.
//            head = newNode;
//            tail = newNode;
//            newNode.next = head;
//        }
//        else {
//            //tail will point to new node.
//            tail.next = newNode;
//            //New node will become new tail.
//            tail = newNode;
//            //Since, it is circular linked list tail will points to head.
//            tail.next = head;
//        }
//    }
//
//    //Displays all the nodes in the list
//    public void display() {
//        Node current = head;
//        if(head == null) {
//            System.out.println("List is empty");
//        }
//        else {
//            System.out.println("Adding nodes to the start of the list: ");
//            do{
//                //Prints each node by incrementing pointer.
//                System.out.print(" "+ current.data);
//                current = current.next;
//            }while(current != head);
//            System.out.println();
//        }
//    }
//
//    public void addInMid(int data){
//        Node newNode = new Node(data);
//        //Checks if the list is empty.
//        if(head == null){
//            //If list is empty, both head and tail would point to new node.
//            head = newNode;
//            tail = newNode;
//            newNode.next = head;
//        }
//        else{
//            Node temp,current;
//            //Store the mid-point of the list
//            int count = (size % 2 == 0) ? (size/2) : ((size+1)/2);
//            //temp will point to head
//            temp = head;
//            current= null;
//            for(int i = 0; i < count; i++){
//                //Current will point to node previous to temp.
//                current = temp;
//                //Traverse through the list till the middle of the list is reached
//                temp = temp.next;
//            }
//
//            //current will point to new node
//            current.next = newNode;
//            //new node will point to temp
//            newNode.next = temp;
//        }
//        size++;
//    }
//
//    public void deleteStart() {
//        //Checks whether list is empty
//        if(head == null) {
//            return;
//        }
//        else {
//            //Checks whether contain only one element
//            //If not, head will point to next element in the list and tail will point to new head.
//            if(head != tail ) {
//                head = head.next;
//                tail.next = head;
//            }
//            //If the list contains only one element
//            //then it will remove it and both head and tail will point to null
//            else {
//                head = tail = null;
//            }
//        }
//    }
//
//    public void deleteEnd() {
//        //Checks whether list is empty
//        if(head == null) {
//            return;
//        }
//        else {
//            //Checks whether contain only one element
//            if(head != tail ) {
//                Node current = head;
//                //Loop will iterate till the second last element as current.next is pointing to tail
//                while(current.next != tail) {
//                    current = current.next;
//                }
//                //Second last element will be new tail
//                tail = current;
//                //Tail will point to head as it is a circular linked list
//                tail.next = head;
//            }
//            //If the list contains only one element
//            //Then it will remove it and both head and tail will point to null
//            else {
//                head = tail = null;
//            }
//        }
//    }
//
//    public void deleteMid() {
//        Node current, temp;
//        //Checks whether list is empty
//        if (head == null) {
//            return;
//        } else {
//            //Store the mid position of the list
//            int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
//            //Checks whether head is equal to tail or not, if yes then list has only one node.
//            if (head != tail) {
//                //Initially temp will point to head;
//                temp = head;
//                current = null;
//                //Current will point to node previous to temp
//                //If temp is pointing to node 2 then current will points to node 1.
//                for (int i = 0; i < count - 1; i++) {
//                    current = temp;
//                    temp = temp.next;
//                }
//
//                if (current != null) {
//                    //temp is the middle that needs to be removed.
//                    //So, current node will point to node next to temp by skipping temp.
//                    current.next = temp.next;
//                    //Delete temp;
//                    temp = null;
//                }
//                //Current points to null then head and tail will point to node next to temp.
//                else {
//                    head = tail = temp.next;
//                    tail.next = head;
//                    //Delete temp;
//                    temp = null;
//                }
//
//            }
//            //If the list contains only one element
//            //then it will remove it and both head and tail will point to null
//            else {
//                head = tail = null;
//            }
//        }
//        size--;
//
//    }
//
//    public void reverse(Node current) {
//        //Checks if the next node is head, if yes then prints it.
//        if(current.next == head) {
//            System.out.print(" "+current.data);
//            return;
//        }
//        //Recursively calls the reverse function
//        reverse(current.next);
//        System.out.print(" "+current.data);
//    }
//
//    public static void main(String[] args) {
//        InsertAtStart cl = new InsertAtStart();
//
//        //Adding 1 to the list
//        cl.addAtStart(1);
//        cl.display();
//        //Adding 2 to the list
//        cl.addAtStart(2);
//        cl.display();
//        //Adding 3 to the list
//        cl.addAtStart(3);
//        cl.display();
//        //Adding 4 to the list
//        cl.addAtStart(4);
//        cl.display();
//    }
//}
//
//public class CLL2 {
//}
