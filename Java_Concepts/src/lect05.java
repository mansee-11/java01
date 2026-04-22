import java.lang.classfile.constantpool.ClassEntry;
import java.util.Scanner;

public class lect05 {
    static int per(int [] a,int i,int sum){
        if(a.length==i)
        {
            return sum;
        }
        int x=per(a,i+1,sum+a[i]);
        int y= per(a,i+1,sum);
        return x+y;
    }
    static void binary(int n,String s)
    {
        if(n==s.length())
        {
            System.out.println(s);
            return;
        }
        binary(n,s+"0");
        binary(n,s+"1");
    }
    static void sub(String s,String r,int n)
    {
        if(s.isEmpty())
        {
            if (r.length()==n)
            {
                System.out.println(r);
            }
            return;
        }
        sub(s.substring(1),r+s.charAt(0),n);
        sub(s.substring(1),r,n);
    }
    static int msub(int[] a,int i,int sum)
    {
        if(a.length==i)
        {
            return sum;
        }
        int x=msub(a,i+1,sum+a[i]);
        int y=msub(a,i+1,sum);

        return (x>y)?x:y;
    }
    static void psub(String s,String r)
    {
        if(s.isEmpty())
        {
            boolean f=true;
            for(int i=0,j=r.length()-1;i<j;i++,j--)
            {
                if(r.charAt(i)!=r.charAt(j)) f=false;
            }
            System.out.println(r+" : "+f);
            return;
        }
        psub(s.substring(1),r+s.charAt(0));
        psub(s.substring(1),r);
    }
    static boolean esub(String s,String r){
        if(s.isEmpty())
        {
            return false;
        }
        if(s.length()==r.length())
        {
            return true;
        }
        return esub(s.substring(1),r+s.charAt(0));
    }
    static int evensum(int []a,int i,int sum,int count)
    {
        if(a.length==i)
        {
            if(sum%2==0) count+=1;
            return count;
        }
        int x=evensum(a,i+1,sum+a[i],count);
        int y=evensum(a,i+1,sum,count);
        return x+y;
    }
    static void asub(String s,String r)
    {
        if(s.isEmpty())
        {
            if(r.indexOf('a')!=-1 ||r.indexOf('A')!=-1) System.out.println(r);
            return;
        }
        asub(s.substring(1),r+s.charAt(0));
        asub(s.substring(1),r);
    }
    static int countasub(String s,int i,boolean b)
    {
        if(i==s.length())
        {
            return b?1:0;
        }
        int x=countasub(s,i+1,b ||s.charAt(i)=='a');
        int y=countasub(s,i+1,b);
        return x+y;
    }
    static int cmax(int []a,int i,int k,int count,int m)
    {
        if(a.length==i)
        {
            if(m<k) count+=1;
            return count;
        }
        int x=cmax(a,i+1,k,count,m*a[i]);
        int y=cmax(a,i+1,k,count,m);
        return x+y;
    }
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter no.of elements :- ");
        int n=sc.nextInt();

        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
//       System.out.println(per(a,0,0));
//        binary(3,"");
//        sub("abcde","",2);
//        System.out.println(msub(a,0,0));
//        psub("abca","");

//        System.out.println(esub("man",""));

//        System.out.println(evensum(a,0,0,0));
//        asub("abc","");
//        countasub("abc",0,false);
        System.out.println(cmax(a,0,5,0,1));
    }
}
