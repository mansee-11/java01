import java.util.Arrays;

public class lect09 {
    public static void pair(int n,boolean[]used,String s)
    {
        int i=1;
        while(i<used.length && used[i])
        {
            i++;
        }
        if(i==used.length)
        {
            System.out.println(s);
            return;
        }
        used[i]=true;
        pair(n,used,s+"("+i+")");
        used[i]=false;
        int j=i+1;
        while(j<=n)
        {
            if(!used[j])
            {
                used[j]=true;
                used[i]=true;
                pair(n,used,s+"("+i+","+j+")");
                used[j]=false;
                used[i]=false;
            }
            j++;
        }
    }
    public static int pair(int n,int[] dp)
    {
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];
        dp[n]=pair(n-1,dp)+(n-1)*pair(n-2,dp);
        return dp[n];
    }
    public static void k_sum(int []n,int k,int i,int j,String s)
    {
        if(i==n.length)
        {
            if(j==k) System.out.println(s);
            return;
        }
        k_sum(n,k,i+1,j+n[i],s+n[i]);
        k_sum(n,k,i+1,j,s);
    }
    public static int k_sum(int[]arr,int[][]dp,int i,int k){
        if(k==0) return 1;
        if(i == arr.length) return 0;
        if(dp[i][k] !=-1) return dp[i][k];
        int x=0;
        if(arr[i]<=k) x= k_sum(arr,dp,i+1,k-arr[i]);
        int y=k_sum(arr,dp,i+1,k);
        dp[i][k]=x+y;
        return dp[i][k];
    }
    public static int ways(int[][]n,int[][]dp,int i,int j)
    {
        if(i==n.length-1 && j==n[0].length-1)
        {
            return 1;
        }
        if(n[i][j]==1) return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int x=0,y=0;
        if (i+1<n.length) x=ways(n,dp,i+1,j);
        if(j+1<n[0].length) y=ways(n,dp,i,j+1);
        dp[i][j]=x+y;
        return dp[i][j];
    }
    public static void main(String[] args)
    {
       /* int n=4;
//        pair(n,new boolean[n+1],"");

        int[]dp = new int[n+1];
        Arrays.fill(dp,-1);
//        System.out.println(pair(n,dp));

        int []nums={3,5,8,4,6,3,2};
        dp=new int[nums.length];
//        k_sum(nums,6,0,0,"");

        int[][]dp=new int[100][100];
        for(int[]row: dp) Arrays.fill(row,-1);
        int []nums={3,5,8,4,6,3,2};
        System.out.println(k_sum(nums,dp,0,6));*/

        int [][]a={{0,0,0},{0,1,0},{0,0,0}};
        int[][]dp=new int[a.length][a[0].length];
        for(int[]row:dp)
        {
           Arrays.fill(row,-1);
        }
        System.out.println(ways(a,dp,0,0));
    }
}
