//maximum product subarray

import java.util.Scanner;
public class day_20 {
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

        int pro=a[0],max=a[0];
        for(int i=1;i<n;i++)
        {
            if(pro*a[i] > a[i])
            {
                pro*=a[i];
            }
            else
            {
                pro=a[i];
            }
            if(max<pro)
            {
                max=pro;
            }
        }

        System.out.println("Maximum product subarray = "+max);
    }
}
