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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> ll = new ArrayList<>();
        inOrder(root , ll);

        int l = 0;
        int r = ll.size() - 1;

        while (l < r) {
            int sum = ll.get(l) + ll.get(r);
            if(sum == k){
                return true;
            }
            else if(sum < k){
                l++;
            }
            else{
                r--;
            }
        }
        return false;
    }
    void inOrder(TreeNode root , ArrayList<Integer> ll){
        if(root == null)return;
        inOrder(root.left , ll);
        ll.add(root.val);
        inOrder(root.right , ll);
    }
    
}