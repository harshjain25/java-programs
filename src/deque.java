//public class deque {
//    class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//        }
//    }
//
//    class DEqueue {
//        static Node head;
//
//        public static boolean isEmpty() {
//            Node temp = head;
//            if (temp == null)
//                return true;
//            else
//                return false;
//        }
//
//        public static void insertFront(int x) {
//            Node n = new Node(x);
//            n.next = head;
//            head = n;
//        }
//
//        public static void insertRear(int a) {
//            Node n = new Node(a);
//            if (head == null)
//                head = n;
//            else {
//                Node temp = head;
//                while (temp.next != null) {
//                    temp = temp.next;
//                }
//                temp.next = n;
//            }
//        }
//
//        public static void deleteFront() {
//            Node temp = head;
//            if (temp == null)
//                return;
//            else {
//                head = head.next;
//            }
//        }
//
//        public static void deleteRear() {
//            Node temp = head;
//            if (temp == null)
//                return;
//            else if (temp.next == null)
//                head = null;
//            else {
//                while (temp.next.next != null) {
//                    temp = temp.next;
//                }
//                temp.next = null;
//            }
//        }
//
//        public static int getRear() {
//            Node temp = head;
//            if (temp == null)
//                return -1;
//            else if (temp.next == null)
//                return temp.data;
//            else {
//                while (temp.next.next != null) {
//                    temp = temp.next;
//                }
//                return temp.next.data;
//            }
//        }
//
//        public static int getFront() {
//            Node temp = head;
//            if (temp == null)
//                return -1;
//            else
//                return temp.data;
//        }
//
//        public static void main(String[] args) {
//            isEmpty();
//            insertFront(5);
//            insertRear(6);
//            insertFront(7);
//            insertRear(8);
//            deleteFront();
//            deleteRear();
//            System.out.println(getFront());
//            System.out.println(getRear());
//        }
//    }
//}
