//Check if array is sorted and rotated

import java.util.Scanner;

public class day_09 {
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

        int count=0;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("array is sorted but not rotated");
        }
        else if(count==1)
        {
            System.out.println("array is sorted and rotated");
        }
        else
        {
            System.out.println("array is nither sorted nor rotated");
        }
    }
}
