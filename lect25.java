//to search an element in rotated sorted array

import java.util.Scanner;

public class lect25 {
    public static int search(int []arr,int target)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(arr[low]<=arr[mid])
            {
                if(arr[low]<=target && arr[mid]>target)
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            else
            {
                if(arr[high]>=target && arr[mid]<target)
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] agrs)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter no. of element in array:- ");
        int n=sc.nextInt();

        int [] a=new int[n];

        System.out.println("enter elements of array one by one:- ");
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            a[i]=x;
        }
        System.out.println("Enter the target value to search:- ");
        int t=sc.nextInt();

        System.out.println("target value is at the index:= "+search(a,t));
    }
}
