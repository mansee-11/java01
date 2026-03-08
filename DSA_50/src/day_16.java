//Find duplicate number in array

import java.util.HashSet;
import java.util.Scanner;
public class day_16 {
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

        HashSet<Integer> set=new HashSet<>();
        for(int i:a)
        {
            if(!set.add(i))
            {
                System.out.println("duplicate no is "+i);
                break;
            }
        }
    }
}
