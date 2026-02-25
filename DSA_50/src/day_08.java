//Kadane's Algorithm - Maximum Subarray Sum

import java.util.Scanner;

public class day_08 {
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

        int sum=a[0],max=a[0];
        for(int i=1;i<n;i++)
        {
            if(sum+a[i] > a[i])
            {
                sum+=a[i];
            }
            else
            {
                sum=a[i];
            }
            if(max<sum)
            {
                max=sum;
            }
        }

        System.out.println("Maximum Subarray Sum = "+max);
    }
}
