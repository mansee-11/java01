import java.util.Scanner;

public class lect03 {
    static int sum=0;
    static int count=0;
    static int gcd=1;
    static int power(int a,int b){
        if(b==1)
        {
            return a;
        }
        return a*power(a,b-1);
    }
    static void rev(int n)
    {
        if(n==0)
        {
            System.out.println();
            return;
        }
        count++;
        sum+=n%10;
        System.out.print(n%10);
        rev(n/10);
    }
    static int gcd(int a,int b){
        if(b==0)
        {
            return a;
        }
        return gcd(b,b%a);
    }
    static int getCount(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n%10 == 0)
        {
            return 1+getCount(n/10);
        }
        return getCount(n/10);
    }
    static int getsum(int []a,int n)
    {
        if(n==0)
        {
            return a[0];
        }
        return a[n]+getsum(a,n-1);
    }
    static int getmax(int [] a,int i)
    {
        if(i==0)
        {
            return a[0];
        }
        if(a[i]>getmax(a,i-1)) return a[i];
        else return getmax(a,i-1);
    }
    static boolean getkey(int []a,int n,int k)
    {
        if(n<0)
        {
            return false;
        }
        if(a[n]==k) return true;
        return getkey(a,n-1,k);
    }
    static int getesum(int a[],int n)
    {
        if(n<0)
        {
            return 0;
        }
        if(a[n]%2==0) return a[n]+getesum(a,n-1);
        return getesum(a,n-1);
    }
    static void change(int [] a,int n)
    {
        if (n<0) return;
        a[n]=(a[n]==2)? 5:a[n];
        change(a,n-1);
    }
    static boolean checkp(int []a,int n)
    {
        if(n<0) return true;
        if(a[n]<0) return false;
        return checkp(a,n-1);
    }
    static int vowelc(String s,int n)
    {
        if(n<0) return 0;
        if("ABCDEabcde".indexOf(s.charAt(n))!=-1) return 1+vowelc(s,n-1);
        return vowelc(s,n-1);
    }
    static void changecase(String s,int n)
    {
        if(n==s.length()) return;
        System.out.print(s.charAt(n)-32);
        changecase(s,n+1);
    }
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//        System.out.print("enter two numbers :- ");
//        int x,n;
//        x=sc.nextInt();
//        n=sc.nextInt();
//        System.out.println("calculation is "+power(x,n));
//        rev(n);
//        System.out.println("sum of digits = "+sum);
//        System.out.println("count of digits = "+count);
//        System.out.println("gcd is "+gcd(x,n));
//        System.out.println("count of zero = "+getCount(n));
//        System.out.print("enter the no of elements :- ");
//        int n=sc.nextInt();
//        int [] arr=new int[n];
//        System.out.println("enter elements one by one:- ");
//        for(int i=0;i<n;i++)
//        {
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("sum of all elements = "+getsum(arr,n-1));
//        System.out.println("max of array = "+getmax(arr,n-1));
//        System.out.print("enter element to search = ");
//        int key=sc.nextInt();
//        System.out.println("key present = "+getkey(arr,n-1,key));
//        System.out.println("even sum = "+getesum(arr,n-1));
//        change(arr,n-1);
//        for(int i=0;i<n;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }

//        System.out.println("all positive :"+checkp(arr,n-1));
        System.out.print("enter a string :- ");
        String str=sc.nextLine();
//        vowelc(str,str.length()-1);
        changecase(str,0);
    }
}
