//public class BinarySearchTre {
//    class Node{
//        int key;
//        Node left,right;
//        public Node(int item){
//            key=item;
//            left=right=null;
//        }
//    }
//    public Node root;
//    BinarySearchTree(){
//        root=null;
//    }
//    BinarySearchTree(int value){
//        root=new Node(value);
//    }
//    public void insert(int key) {
//        root = insertrec(root,key);
//    }
//    public Node insertrec(Node root,int key){
//        if(root==null){
//            root=new Node(key);
//            return root;
//        }
//        if(key<root.key){
//            root.left=insertrec(root.left,key);
//        }
//        else if(key>root.key){
//            root.right=insertrec(root.right,key);
//        }
//        return root;
//    }
//    public void traverse() {
//        inorderrec(root);
//    }
//    public void inorderrec(Node root){
//        if(root!=null){
//            inorderrec(root.left);
//            System.out.println(root.key);
//            inorderrec(root.right);
//        }
//    }
//    public Node search(Node root,int key){
//
//        if(root==null || root.key==key){
//            return root;
//        }
//        if(root.key<key){
//            return search(root.right,key);
//        }
//        else{
//            return search(root.left,key);
//        }
//    }
//    public void isprime(int key){
//
//    }
//
//    public static void main(String[] args) {
//        BinarySearchTree bst=new BinarySearchTree();
////        Node root=new Node(10);
//        bst.insert(50);
////        bst.root=new Node(10);
//        bst.insert(30);
//        bst.insert(20);
//        bst.insert(40);
//        bst.insert(70);
//        bst.insert(60);
//        bst.insert(80);
//
//        bst.traverse();
//
//        Node value=bst.search(bst.root,20);
//        System.out.println(value.key);
//    }
//}
