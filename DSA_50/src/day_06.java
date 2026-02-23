import java.util.Scanner;
import java.util.HashSet;
//Union and Intersection of two arrays

public class day_06 {
    public static void main(String[] args){

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
        for(int i=0;i<n1;i++)
        {
            b[i]=sc.nextInt();
        }

        //union
        HashSet<Integer> set=new HashSet<>();

        for(int i:a)
        {
            set.add(i);
        }
        for(int i:b)
        {
            set.add(i);
        }
        System.out.println("union is:- "+set);

        //intersection
        HashSet<Integer> set2=new HashSet<>();
        HashSet<Integer> result=new HashSet<>();
        for(int i:a)
        {
            set2.add(i);
        }
        for(int i:b)
        {
            if(set2.contains(i))
            {
                result.add(i);
            }
        }

        System.out.println("intersection is:- "+result);
    }
}
