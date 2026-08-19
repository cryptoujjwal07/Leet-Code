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
 */class Solution {
    class Pair {
        TreeNode node;
        int row;
        int col;
        Pair(TreeNode node, int row, int col) {
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        HashMap<Integer, ArrayList<int[]>> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0, 0));
        int min = 0;
        int max = 0;
        while(!q.isEmpty()){
            Pair curr = q.poll();
            TreeNode node = curr.node;
            int row = curr.row;
            int col = curr.col;
            map.putIfAbsent(col, new ArrayList<>());
            map.get(col).add(new int[]{row, node.val});
            min = Math.min(min, col);
            max = Math.max(max, col);
            if (node.left != null) {
                q.add(new Pair(node.left, row + 1, col - 1));
            }
            if (node.right != null) {
                q.add(new Pair(node.right, row + 1, col + 1));
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int col = min; col <= max; col++){
            ArrayList<int[]> list = map.get(col);
            if (list == null) continue;
            Collections.sort(list, (a, b) ->{
                if (a[0] != b[0]) {
                    return a[0] - b[0];
                }
                return a[1] - b[1];
            });
            List<Integer> temp = new ArrayList<>();
            for (int[] p : list) {
                temp.add(p[1]);
            }
            ans.add(temp);
        }
        return ans;
    }
}