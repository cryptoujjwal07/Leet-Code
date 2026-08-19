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
        HashMap<Integer , List<Integer>> map = new HashMap<>();
        solve(root , 0 , map);
        List<List<Integer>> ll = new ArrayList<>();
        for(int level = 0 ; level < map.size(); level++){
            ll.add(map.get(level));
        }

        return ll;

    }
    public void solve(TreeNode root , int level , HashMap<Integer , List<Integer>> map){
        if(root == null)return;

        map.putIfAbsent(level , new ArrayList<Integer>());
        map.get(level).add(root.val);
        solve(root.left , level+1 , map);
        solve(root.right , level+1 , map);
    }
}