//Cyclically rotate an array by one

import java.util.Scanner;

public class day_07 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter element in first array = ");
        int n=sc.nextInt();
        int []a=new int[n];
        System.out.println("enter elements one by one:- ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int e=a[0];
        for(int i=0;i<n-1;i++)
        {
            a[i]=a[i+1];
        }
        a[n-1]=e;

        System.out.print("rotated array:- ");
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}
