//import java.util.*;
//public class createLevelOrder {
//    private Node root;
//    Scanner sc=new Scanner(System.in);
//    public CreateLevelOrder(){
//        this.root=CreateTree();
//
//    }
//    private Node CreateTree(){
//        Queue<Node> q=new LinkedList<>();
//        Node nn=new Node();
//        int val=sc.nextInt();
//        nn.val=val;
//        root =nn;
//        q.add(nn);
//        while(!q.isEmpty()){
//            Node rv=q.remove();
//            int c1=sc.nextInt();
//            int c2=sc.nextInt();
//            if(c1!=-1){
//                Node node=new Node();
//                node.val=c1;
//                rv.left=node;
//                q.add(node);
//            }
//            if(c2!=-1){
//                Node node=new Node();
//                node.val=c2;
//                rv.right=node;
//                q.add(node);
//            }
//        }
//        return root;
//    }
//    public class Diapair{
//        int ht=-1;
//        int d=0;
//    }
//    public int
//}
