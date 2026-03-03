//Count the number of occurrences of an element

import java.util.Scanner;
public class day_12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter no. of element array = ");
        int n=sc.nextInt();
        int []a=new int[n];
        System.out.println("enter elements one by one:- ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("enter the element to get it's occurrence = ");
        int e=sc.nextInt();
        int count=0;
        for(int i:a)
        {
            if(i==e) count++;
        }

        if(count>0) System.out.println("occurrence of element is "+count);
        else System.out.println("element not found");
    }
}
