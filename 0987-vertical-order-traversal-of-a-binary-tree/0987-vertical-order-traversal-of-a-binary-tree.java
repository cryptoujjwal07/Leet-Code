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
    class pair{
        TreeNode node;
        int row;
        int col;
        pair(TreeNode node , int row , int col){
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }    
    public List<List<Integer>> verticalTraversal(TreeNode root){
        TreeMap<Integer , TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root , 0 , 0));

        while(!q.isEmpty()){
            pair p = q.poll();
            TreeNode node = p.node;
            int row = p.row;
            int col = p.col;
            //col
            map.putIfAbsent(col , new TreeMap<>());
            //row with col
            map.get(col).putIfAbsent(row , new PriorityQueue<Integer>());
            //both with val of node
            map.get(col).get(row).add(node.val);

            //left
            if(node.left != null) q.add(new pair(node.left , row+1 , col - 1));
            if(node.right != null) q.add(new pair(node.right , row+1 , col +1));
        }

        List<List<Integer>> ll= new ArrayList<>();
        for(TreeMap<Integer , PriorityQueue<Integer>> rows : map.values()){
            List<Integer> subll = new ArrayList<>();
            for(PriorityQueue<Integer> pq : rows.values()){
                while(!pq.isEmpty()){
                    subll.add(pq.poll());
                }
            }
            ll.add(subll);
        }
        return ll;
    }
}