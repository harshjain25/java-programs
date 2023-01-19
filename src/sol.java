public class sol {
    public TreeNode lowestCommonAncestor(TreeNoderoot, TreeNode p, TreeNode q){
        if(root==null){
            return root;
        }
        if(root==p || root==q){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left!=null && right!=null){
            return root;
        }
    }
    public static void main(String[] args) {
        
    }
}
