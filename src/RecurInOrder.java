public class RecurInOrder {

    private TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree() {
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
//        TreeNode fifth=new TreeNode(5);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
//        second.right=fifth;
    }
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        RecurInOrder rio=new RecurInOrder();
        rio.createBinaryTree();
        rio.inorder(rio.root);
    }
}