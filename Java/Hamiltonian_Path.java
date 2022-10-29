class Solution 
{ 
    boolean dfs(ArrayList<ArrayList<Integer>>adj, int i, int count, boolean [] visited){
        if(count==visited.length-1)
        {
            return true;
        }
        visited[i] = true;
        count += 1;
        for(int j : adj.get(i))
        {
            if(!visited[j])
            {
                if(dfs(adj,j,count,visited))
                {
                    return true;
                }
            }
        }
        visited[i] = false;
        count--;
        return false;
    }
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges) 
    { 
       ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
       for(int i=0;i<N+1;i++)
       {
           adj.add(new ArrayList<Integer>());
       }
       for(ArrayList<Integer> list : Edges)
       {
           int x = list.get(0);
           int y = list.get(1);
           adj.get(x).add(y);
           adj.get(y).add(x);
       }
       boolean visited[] = new boolean[N+1];
       int count = 1;
       for(int i=1;i<=N;i++)
       {
           if(dfs(adj,i,count,visited)) return true;
       }
       
       return false;
    }
} 
