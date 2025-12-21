import java.util.ArrayList;
import java.util.Scanner;

public class hw11 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int i=0,j=0;
        ArrayList<Integer> list =new ArrayList<>();
        while(i<nums1.length && j<nums2.length)
        {
            if( nums1[i]<nums2[j])
            {
                ++i;
            }

            else if(nums1[i]>nums2[j])
            {
                ++j;
            }
            else
            {
                list.add(nums1[i]);
                j++;
                i++;
            }
        }
        int x=list.size();
        int []result=new int[x];
        for(int k=0;k<x;k++)
        {
            result[k]=list.get(k);
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);


        System.out.println("enter no of element in first array = ");
        int n=sc.nextInt();

        int []arr=new int[n];

        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            arr[i]=a;
        }

        System.out.println("enter no of element in second array = ");
        int m=sc.nextInt();

        int []arr2=new int[m];

        for(int i=0;i<m;i++)
        {
            int a=sc.nextInt();
            arr2[i]=a;
        }

        int[] intersect = intersect(arr, arr2);

        System.out.println("intersection of arrays[including duplicate elements]:-\n");
        for(int i:intersect)
        {
            System.out.println(i+" ");
        }
    }
}
