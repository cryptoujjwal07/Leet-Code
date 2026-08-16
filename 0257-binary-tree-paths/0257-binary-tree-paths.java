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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ll = new ArrayList<>();
        if(root == null)return ll;
        dfs(root , "" , ll);
        return ll;
    }
    void dfs(TreeNode root , String s , List<String> ll){
        if(root == null)return;
        s += root.val;

        if(root.left == null && root.right == null){
            ll.add(s);
            return;
        }

        s+= "->";
        dfs(root.left , s , ll);
        dfs(root.right , s , ll);
    }
}