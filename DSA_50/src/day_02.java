import java.util.Scanner;

//Reverse an array in place

public class day_02 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("enter no. of elements in array = ");
        int n=sc.nextInt();

        int [] arr=new int[n];
        System.out.println("enter elements of array one by one:-");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0,j=arr.length-1;i<j;i++,j--)
        {
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
        }

        System.out.print("Reversed array is :- ");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
