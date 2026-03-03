//Find all pairs with a given sum(index)

import java.util.HashMap;
import java.util.Scanner;
public class day_13 {
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

        System.out.println("enter the sum:-");
        int target=sc.nextInt();

        System.out.print("pairs indices are:- ");
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int diff=target-a[i];
            if(map.containsKey(diff))
            {
                System.out.print("("+map.get(diff)+","+i+") ");
            }
            map.put(a[i],i);
        }

    }
}
