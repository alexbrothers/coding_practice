package leetcode.contests.biweeklyeightytwo;

public class EvaluateBooleanTree {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean evaluateTree(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val == 0 ? false : true;
        }
        return root.val == 2 ? evaluateTree(root.left) || evaluateTree(root.right) : evaluateTree(root.left) && evaluateTree(root.right);
    }

}
