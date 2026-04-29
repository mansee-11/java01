import java.sql.SQLOutput;
import java.util.Arrays;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class lect08 {
    public static int steps(int n,int s)
    {
        if(n==1)
        {
            return s;
        }
        int x=steps(n-1,s+1);
        if(n%2==0) x=min(x,steps(n/2,s+1));
        if(n%3==0) x=min(x,steps(n/3,s+1));
        return x;
    }
    public static int steps(int n,int[] dp)
    {
        if(n==1) return 0;
        if(dp[n]!=-1) return dp[n];
        int x=steps(n-1,dp);
        if(n%2==0) x=min(x,steps(n/2,dp));
        if(n%3==0) x=min(x,steps(n/3,dp));
        dp[n]=x+1;
        return dp[n];
    }
    public static int no_steps(int n,int s)
    {
        if(n==0) return s+1;
        int x= no_steps(n-1,s);
        if(n>=2)  x+=no_steps(n-2,s);
        return x;
    }
    public static int no_steps(int n,int[] dp)
    {
        if(n==0) return 1;
        if(dp[n]!= 0) return dp[n];
        int x= no_steps(n-1,dp);
        if(n>=2)  x+=no_steps(n-2,dp);
        dp[n]=x;
        return dp[n];
    }
    public static int max_sum(int[]a,int x,int i)
    {
        if(i>=a.length) return x;
        int y=max_sum(a,x,i+1);
        int z=max_sum(a,x+a[i],i+2);
        return max(y,z);
    }
    public static int max_sum(int []a,int[]dp,int i)
    {
        if(i>=a.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int x=max_sum(a,dp,i+1);
        int y=a[i]+max_sum(a,dp,i+2);
        dp[i]=max(x,y);
        return dp[i];
    }
    public static int decode_str(String s,int[] dp,int i)
    {
        if(i==s.length()) return 1;
        if(s=="0") return 0;
        if(dp[i] != -1) return dp[i];
        int one =decode_str(s,dp,i+1);
        int two=0;
        if(i+1 <s.length())
        {
            int num=(s.charAt(i)-'0' + s.charAt(i+1)-'0');
            if(num<=26) two=decode_str(s,dp,i+2);
        }
        return dp[i]=one+two;
    }
    public static void main(String[] args){
        int n=10;
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
//        System.out.println(steps(10,0));
//        System.out.println(steps(n,dp));
//        System.out.println(no_steps(5,0));
        n=5;
        dp=new int[n+1];
        Arrays.fill(dp,0);
//        System.out.println(no_steps(n,dp));

        int[] arr={2,1,4,9};
        dp=new int[arr.length];
        Arrays.fill(dp,-1);
//        System.out.println(max_sum(arr,0,0));
//        System.out.println(max_sum(arr,dp,0));

        String s="121";
        dp=new int[s.length()];
        Arrays.fill(dp,-1);
        System.out.println(decode_str(s,dp,0));

    }
}
