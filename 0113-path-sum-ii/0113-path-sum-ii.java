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
    public List<List<Integer>> pathSum(TreeNode root, int ts) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> subll = new ArrayList<>();
        solve(root , ts , ll , subll);
        return ll;
    }
    void solve(TreeNode root , int ts ,List<List<Integer>>ll , List<Integer> subll ){
        if(root == null)return;
        subll.add(root.val);
        if(root.left == null && root.right == null){
            if(ts == root.val){
                ll.add(new ArrayList<>(subll));
            }
        }
        solve(root.left ,ts-root.val , ll , subll);
        solve(root.right ,ts-root.val , ll , subll);

        subll.remove(subll.size()-1);
    }
}