import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
public class lect17 {
    public static void main(String[] args){

        /*HashSet<Integer> set=new HashSet<>();     //do not contain duplicate value
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set);


        //if array have duplicat element or not
        int arr[]={1,2,3};
        int n=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr)
        {
            n++;
            if(!set.add(i))
            {
                System.out.println("have duplicate value");
                break;
            }
        }
        if(n==arr.length)
        {
            System.out.println("no duplicate element");
        }

        //to find common element from two array

        int arr[]={1,2,3,4};
        int arr1[]={1,2,4,5};
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> result=new HashSet<>();

        for(int x:arr)
        {
            set.add(x);
        }
        for(int y:arr1)
        {
            if(set.contains(y))
            {
                result.add(y);
            }
        }
        System.out.println(result);

        LinkedHashSet<Integer> set=new LinkedHashSet<>(); //insertion ordered
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set);

        TreeSet<Integer> set=new TreeSet<>();
        set.add(5);
        set.add(3);
        System.out.println(set);

        //sliding window print max sum of sub array
        Scanner sc=new Scanner(System.in);
        int arr[] ={1,2,3,5,2};
        int k,sum=0,maxsum=0;
        System.out.print("enter no. of element in one window:- ");
        k=sc.nextInt();

        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        maxsum=sum;
        for(int i=0,j=k;i<arr.length-k;i++,j++)
        {
            sum+=arr[j];
            sum-=arr[i];
            if(maxsum<sum) maxsum=sum;
        }
        System.out.println(maxsum);
        */

        //to find duplicat in sub set using hashset
        Scanner sc=new Scanner(System.in);
        int arr[] ={1,3,4,5,2};
        int k,j,i;
        HashSet<Integer> set=new HashSet<>();
        System.out.print("enter no. of element in one window:- ");
        k=sc.nextInt();
        for(i=0;i<k;i++)
        {
            if(set.contains(arr[i]))
            {
                System.out.println("duplicate value present in subset");
                break;
            }
            else set.add(arr[i]);
        }
        if(i==k)
        {
            for(i=0,j=k;i<arr.length-k;i++,j++)
            {
                if(set.contains(arr[j]))
                {
                    System.out.println("duplicate value present");
                    break;
                }
                else
                {
                    set.add(arr[j]);
                    set.remove(arr[i]);
                }
            }
            if(i==arr.length-k) System.out.println("no duplicate value present");
        }
    }
}
