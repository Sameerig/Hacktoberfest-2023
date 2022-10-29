class Solution{
    static ArrayList<Integer> downwardDigonal(int N, int A[][])
    {
        // code here 
         ArrayList<Integer> ans=new ArrayList<>();
        //before diagonal including middile diagonal
        for(int i=0; i<N; i++)
        {
            int t=0;
            for(int j=i; j>=0; j--)
            {
                ans.add(A[t][j]);
                t++;
            }
        }
        //after diagonal excluding middile diagonal
        for(int i=1; i<N; i++)
        {
            int t=i;
            for(int j=N-1; j>=i; j--)
            {
                ans.add(A[t][j]);
                t++;
            }
        }
        return ans;
    }
    
}
