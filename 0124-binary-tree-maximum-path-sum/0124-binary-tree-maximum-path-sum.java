/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxPathSum(TreeNode root) {
        int[] maxVal = new int[1];
        maxVal[0] = Integer.MIN_VALUE;
        MaxPathSum(root , maxVal);
        return maxVal[0];
    }
    private int MaxPathSum(TreeNode root , int[] maxVal){
        if(root == null)return 0;
        int lp = Math.max(0 , MaxPathSum(root.left , maxVal));
        int rp = Math.max(0 , MaxPathSum(root.right , maxVal));

        maxVal[0] = Math.max(maxVal[0] , lp + rp + root.val);
        return Math.max(lp , rp) + root.val;
    }
}