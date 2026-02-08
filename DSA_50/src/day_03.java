import java.util.Arrays;
import java.util.Scanner;

//Find the 'Kth' max and min element of an array

public class day_03 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter no. of elements in array = ");
        int n=sc.nextInt();

        int[]arr=new int[n];
        System.out.println("enter elements of array one by one:-");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("enter the value of k: ");
        int k=sc.nextInt();
        System.out.println("kth max is : "+arr[arr.length-k]);
        System.out.println("kth min is : "+arr[k-1]);
    }
}