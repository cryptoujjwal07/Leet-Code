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
        //base con.
        if(root == null)return ll;

        queue.offer(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> subll = new ArrayList<>();
            for(int i = 0 ; i < level ; i++){
                if(queue.peek().left != null)queue.offer(queue.peek().left);
                if(queue.peek().right != null)queue.offer(queue.peek().right);

                subll.add(queue.poll().val);
            }
            ll.add(subll);
        }
        return ll;

    }
}