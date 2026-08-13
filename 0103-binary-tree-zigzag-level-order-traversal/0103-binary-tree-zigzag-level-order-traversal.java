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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();
        if(root == null) return ll;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean lTOr = true;
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> subll = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                TreeNode curr = q.poll();
                if(lTOr){
                    subll.add(curr.val);
                }
                else{
                    subll.add(0 , curr.val);
                }
                if(curr.left != null)q.offer(curr.left);
                if(curr.right != null)q.offer(curr.right);
            }
            ll.add(subll);
            lTOr = !lTOr;
        }
        return ll;
    }
}