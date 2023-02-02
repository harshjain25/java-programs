public class validateBST {
    public class TreeNode {
        int val;
        Insert_BST.TreeNode left;
        Insert_BST.TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, Insert_BST.TreeNode left, Insert_BST.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class bstpair{
        boolean isbst=true;
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
    }
    class Solution{
        public boolean isValidBST(TreeNode root){
            return validbst(root).isbst;
        }
        public bstpair validbst(TreeNode root){
            if(root==null){
                return new bstpair();
            }
            bstpair lbp=validbst(root.left);
            bstpair rbp=validbst(root.right);
            bstpair sbp=new bstpair();
            sbp.max=Math.max(lbp.max,Math.max(rbp.max,root.val));
            sbp.min=Math.min(lbp.min,Math.min(rbp.min,root.val));
            if(lbp.isbst && rbp.isbst && lbp.max<root.val && rbp.min>root.val){
                sbp.isbst=true;
            }
            else{
                sbp.isbst=false;
            }
            return sbp;
        }
    }
}
