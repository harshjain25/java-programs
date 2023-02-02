//public class diameterOfBinarytree {
//    public int diameterOfBinarytree(TreeNode root){
//        if(root==null){
//            return 0;
//        }
//        int ld=diameterOfBinarytree(root.left);
//        int rd=diameterOfBinarytree(root.right);
//        int sd=ht(root.left)+ht(root.right)+2;
//        return Math.max(ld,Math.max(rd,sd));
//    }
//    public int ht(TreeNode root){
//        if(root==null){
//            return -1;
//        }
//        int lh=ht(root.left);
//        int rh=ht(root.right);
//        return Math.max(lh,rh)+1;
//    }
//}
