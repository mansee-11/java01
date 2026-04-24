import java.util.*;
/* public class Optimise{
     static int fib(int n,int[]dp){
         if(n<=1){
             return n;
         }
         if(dp[n]!=-1){
             return dp[n];
         }
         dp[n]=fib(n-1, dp)+fib(n-2, dp);
         return dp[n];
     }
     public static void main(String[]args){
         int n=6;
         int[]dp=new int[n+1];
         Arrays.fill(dp,-1);
         System.out.println(fib(n, dp));
     }
 }*/

/*  public class Optimise{
     static int stair(int n,int[]dp){
          if(n==0 ||n==1){
              return 1;
          }
          if(dp[n]!=-1){
             return dp[n];
          }
         dp[n]=stair(n-1,dp)+stair(n-2,dp);
         return dp[n];
      }
      public static void main(String[] args) {
          int n=3;
          int[]dp=new int[n+1];
          Arrays.fill(dp, -1);
         System.out.println(stair(n, dp));
     }
 }*/

/* public class lect06{
     static int countDigit(int n,int[]dp){
         if(n==0){
             return 1;
         }
          if(dp[n] != -1) return dp[n];
          dp[n]=1+countDigit(n/10,dp);
          return dp[n];
     }
     public static void main(String[]args){
         int n=345;
         int[]dp=new int[n+1];
         Arrays.fill(dp,-1);
         System.out.println(countDigit(n, dp));
     }
 }*/

/* public class Optimise{
     static int sum(int n,int[]dp){
         if(n==0){
             return 1;
         }
          if (dp[n] != -1) {
             return dp[n];
         }
          dp[n]=n%10+sum(n/10,dp);
         return dp[n];
     }
      public static void main(String[]args){
         int n=123;
         int[]dp=new int[n+1];
         Arrays.fill(dp,-1);
         System.out.println(sum(n, dp));
     }
 }*/

public class lect06 {

/*    static String revString(String s, String[] dp, int i) {
        if (i < 0)
            return " ";

        if (dp[i] != null)
            return dp[i];

        dp[i] = s.charAt(i) + revString(s, dp, i - 1);
        return dp[i];
    }*/
    static String ways(String str,String[] dp){
        if(str.length() == 0) return "";
        int len = str.length()-1;
        if(dp[len] != null) return dp[len];
        dp[len]=ways(str.substring(1),dp)+str.charAt(0);
        return dp[len];
    }
    static int ways(String str,int i, int[] dp)
    {
        if(i==str.length()) return 1;
        if(dp[i] != -1) return dp[i];
        int x=ways(str,i+1,dp);
        int y=ways(str,i+1,dp);
        dp[i]=x+y;
        return dp[i];
    }
    static int slength(String str,int [] dp)
    {
        if(str.equals("")) return 0;
        int len = str.length();
        if(dp[len] !=-1)
        {
            return dp[len];
        }
        dp[len] = 1+slength(str.substring(1),dp);
        return dp[len];
    }
    static int count(int n,int [] dp)
    {
        if(n == 0) return 0;
        if(dp[n] !=-1) return dp[n];
        if(n%10 == 0)
        {
            dp[n] = 1+count(n/10,dp);
        }
        else
        {
            dp[n] = count(n/10,dp);
        }
        return dp[n];
    }
    static int vcount(String str,int i,int[] dp)
    {
        if(i == str.length()) return 0;
        if(dp[i] !=-1) return dp[i];
        char ch=str.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            dp[i]=1+vcount(str,i+1,dp);
        }
        else
        {
            dp[i]=vcount(str,i+1,dp);
        }
        return dp[i];
    }
    public static void main(String[] args) {
        String s = "hello";
//        String[] dp = new String[s.length()];
//        System.out.println(revString(s, dp, s.length() - 1));
//        System.out.println(ways(s,dp));
        String str="abc";
        int[] dp=new int[str.length()+1];
        Arrays.fill(dp,-1);
        int i=0;
//        System.out.println(ways(str,i,dp));
//        System.out.println(count(1203040500,dp));

    }
}