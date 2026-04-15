import java.util.Scanner;

public class lect04 {
    static int fab(int n)
    {
        if(n==0 || n==1) return n;
        return fab(n-1)+fab(n-2);

    }
    static void substr(String p,String s)
    {
        if(s.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch=s.charAt(0);

        substr(p+ch,s.substring(1));
        substr(p,s.substring(1));
    }
    static int subcount(String s)
    {
        if(s.isEmpty())
        {
            return 1;
        }
       return subcount(s.substring(1)) + subcount(s.substring(1));
    }
    static void binary(String b,int n)
    {
        if(n==0)
        {
            System.out.println(b);
            return;
        }
        binary(b+"0",n-1);
        binary(b+"1",n-1);
    }
    static void ht(String b,int n)
    {
        if(n==0)
        {
            System.out.println(b);
            return;
        }
        ht(b+"h",n-1);
        ht(b+"t",n-1);
    }
    static void path(String str,int r,int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(str);
            return;
        }
        if(r>1) path(str+"d",r-1,c);
        if(c>1) path(str+"r",r,c-1);
    }
    static void grid(String b,int n,int m,int i,int j)
    {
        if(i==n && j==m)
        {
            System.out.println(b);
            return;
        }
        if(j<m) grid(b+"r",n,m,i,j+1);
        if(i<n) grid(b+"d",n,m,i+1,j);
    }
    static void stairs(String s,int n)
    {
        if(n==0)
        {
            System.out.println(s);
            return;
        }
        if(n>=2)stairs(s+"2",n-2);
        if(n>=1)stairs(s+"1",n-1);
    }
    static int path(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        return path(n-1)+path(n-2);
    }
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);

//        System.out.println(fab(5));
//        substr("","abc");
//        System.out.println(subcount("abc"));
//        binary("",3);
//        ht("",2);
//        grid("",2,2,1,1);
        stairs("",5);
        System.out.println(path(5));
    }
}
