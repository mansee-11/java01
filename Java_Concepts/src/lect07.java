import java.util.Scanner;

public class lect07 {
    public static void sum_equal(int []a,int k,int r,int i,String b)
    {
        if(i==a.length)
        {
            if(r==k) System.out.println(b);
            return;
        }
        sum_equal(a,k,r+a[i],i+1,b+a[i]);
        sum_equal(a,k,r,i+1,b);
    }
    public static void sum_equal(int []a,int k,int r,int i,int[] b,int size)
    {
        if(i==a.length)
        {
            if(r==k)
            {
                for(int j=0;j<size;j++)
                {
                    System.out.print(b[j] +" ");
                }
                System.out.println();
            }
            return;
        }
        b[size] = a[i];
        sum_equal(a,k,r+a[i],i+1,b,size+1);
        sum_equal(a,k,r,i+1,b,size);
    }
    public static int count_sum_equal(int []a,int k,int r,int i)
    {
        if(i==a.length)
        {
            if(r==k) return 1;
            return 0;
        }
        int x=count_sum_equal(a,k,r+a[i],i+1);
        int y=count_sum_equal(a,k,r,i+1);
        return x+y;
    }
    public static void per(String s,String r)
    {
        if(s.isEmpty())
        {
            System.out.println(r);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            String result=s.substring(0,i)+s.substring(i+1);
            per(result,r+ch);
        }
    }
    public static void main(String[] args){
        int[]arr={1,1,2,3,1};
        int []b=new int[arr.length];
//        sum_equal(arr,3,0,0,"");
//        sum_equal(arr,3,0,0,b,0);
//        System.out.println(count_sum_equal(arr,3,0,0));
        per("abc","");
    }
}
