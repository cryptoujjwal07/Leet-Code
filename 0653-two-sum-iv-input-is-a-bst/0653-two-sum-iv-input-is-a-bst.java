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

        for(int i =0 ; i < ll.size()-1 ; i++){
            int sum = 0;
            for(int j = i+1 ; j < ll.size() ; j++){
                sum += ll.get(i) + ll.get(j);
                if(sum == k){
                    return true;
                }
                else{
                    sum = 0;
                }
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