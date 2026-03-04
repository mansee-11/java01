//all the Subarray with given sum (Two pointer / Sliding window)

import java.util.Scanner;
public class day_14 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter no. of element array = ");
        int n=sc.nextInt();
        int []a=new int[n];
        System.out.println("enter elements one by one:- ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("enter the sum:-");
        int target=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            int sum=a[0];
            for(int j=1;j<i;j++)
            {
                sum+=a[j];
            }
            if(sum==target)
            {
                System.out.println("subarray with given sum is ("+0+","+(i-1)+")");
            }
            for(int k=i,l=0;k<n;k++,l++)
            {
                sum+=a[k];
                sum-=a[l];
                if(sum==target)
                {
                    System.out.println("subarray with given sum is ("+(l+1)+","+k+")");
                }
            }
        }
    }
}
