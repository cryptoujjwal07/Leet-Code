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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();
        if(root == null)return ll;
        Queue<TreeNode> st = new LinkedList<>();
        st.offer(root);
        while(!st.isEmpty()){
            int level = st.size();
            List<Integer> subll = new ArrayList<>();
            for(int i =0  ; i < level ; i++){
                TreeNode p = st.poll();
                subll.add(p.val);
                if(p.left != null)st.offer(p.left);
                if(p.right != null)st.offer(p.right);
            }
            ll.addFirst(subll);
        }
        return ll;
    } 
}