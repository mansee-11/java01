//sort an array with only 0s,1s & 2s
import java.util.Scanner;
public class lect24 {
    public static void sort(int []arr)
    {
        int low=0,mid=0,high=arr.length-1;

        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if (arr[mid]==1)
            {
                mid++;
            }
            else if(arr[mid]==2)
            {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);


        System.out.println("enter no of element in array = ");
        int n=sc.nextInt();

        int []arr=new int[n];

        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            arr[i]=a;
        }
        sort(arr);

        System.out.println("sorted array:-\n");
        for(int i:arr)
        {
            System.out.println(i+" ");
        }
    }
}
