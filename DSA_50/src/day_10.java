//Leaders in an array

import java.util.Scanner;
public class day_10 {
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

        System.out.print("leaders in array are:- ");
        int max=a[n-1];
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]>=max)
            {
                max=a[i];
                System.out.print(max+" ");
            }
        }
    }
}
