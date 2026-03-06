//Missing number in array [1 to n]

import java.util.Scanner;
public class day_15 {
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter no. of element array = ");
        int n=sc.nextInt();
        int []a=new int[n];
        System.out.println("enter elements one by one:- ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int txor=0,axor=0;
        for(int i=1;i<=n+1;i++)
        {
            txor^=i;
        }
        for(int i:a)
        {
            axor^=i;
        }

        System.out.println("missing no. is "+(txor^axor));
    }
}
