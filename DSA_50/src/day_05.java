import java.util.Scanner;

// Move all negative numbers to beginning and positive to end

public class day_05 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter no. of elements in array = ");
        int n=sc.nextInt();

        int[]arr=new int[n];
        System.out.println("enter elements of array one by one:-");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
         int neg=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                int x=arr[i];
                for(int j=i;j>neg;j--)
                {
                    arr[j]= arr[j-1];
                }
                arr[neg]=x;
                neg++;
            }
        }
        System.out.println("elements are:= ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
