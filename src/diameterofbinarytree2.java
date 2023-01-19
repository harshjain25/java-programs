public class diapair{
    int ht=-1;
    int d=0;
}
public class diameterofbinarytree2 {
    public int diameterofbinarytree2(TreeNode root){
        return diameter(root).d;
    }
    public diapair diameter(TreeNode root){
        if(root==null){
            return new diapair();
        }
        diapair ldp=diameter(root.left);
        diapair rdp=diameter(root.right);
        diapair sdp=new diapair();
        int sd=ldp.ht+rdp.ht+2;
        sdp.d=Math.max(ldp.d,Math.max(rdp.d,sd));
        sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
        return sdp;
    }
}
