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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null)return ll;
        queue.offer(root);
        queue.offer(null);
        List<Integer> level = new ArrayList<>();


        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            if(curr == null){
                ll.add(level);
                level = new ArrayList<>();

                if(!queue.isEmpty()){
                    queue.offer(null);
                }
            }
            else{
                level.add(curr.val);
                if(curr.left != null)queue.offer(curr.left); 
                if(curr.right != null)queue.offer(curr.right); 
            }
        }
        return ll;
    }
}