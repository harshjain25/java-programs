//public class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode() {}
//      TreeNode(int val) { this.val = val; }
//      TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//          this.left = left;
//          this.right = right;
//      }
//  }
//public class balancedbinarytree {
//    public boolean isBalanced(TreeNode root){
//        boolean left=isBalanced(root.left);
//        boolean right=isBalanced(root.right);
//        boolean isbal=Math.abs(ht(root.left)-ht(root.right))<=1;
//        return left && right && isbal;
//
//    }
//    public int ht(TreeNode root){
//        if(root==null){
//            return -1;
//        }
//        int lh=ht(root.left);
//        int rh=ht(root.right);
//        return Math.max(lh,rh)+1;
//
//    }
//}
