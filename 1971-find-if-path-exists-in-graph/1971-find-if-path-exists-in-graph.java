class Solution{
    public boolean validPath(int n,int[][] edges,int source,int destination){
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        boolean[] vis=new boolean[n];
        return dfs(source,destination,adj,vis);
    }
    public boolean dfs(int node,int dest,ArrayList<ArrayList<Integer>> adj,boolean[] vis){
        if(node == dest)return true;
        vis[node]=true;
        for(int nbr:adj.get(node)){
            if(!vis[nbr]){
                if(dfs(nbr,dest,adj,vis))return true;
            }
        }
        return false;
    }
}