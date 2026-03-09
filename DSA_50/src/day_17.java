//Find intersection of two sorted arrays

import java.util.ArrayList;
import java.util.Scanner;
public class day_17 {
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter element in first array = ");
        int n1=sc.nextInt();
        int []a=new int[n1];
        System.out.println("enter elements one by one:- ");
        for(int i=0;i<n1;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.print("enter element in second array = ");
        int n2=sc.nextInt();
        int []b=new int[n2];
        System.out.println("enter elements one by one:- ");
        for(int i=0;i<n2;i++)
        {
            b[i]=sc.nextInt();
        }

        ArrayList<Integer> result=new ArrayList<>();
        int i=0,j=0;
        while(i<n1 && j<n2) {
            if (a[i] == b[j]) {
                result.add(a[i]);
                i++;
                j++;
            }
            else if (a[i] > b[j]) {
                j++;
            }
            else
            {
                i++;
            }
        }

        System.out.print("Intersection is: "+result);
    }
}
