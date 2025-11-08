import javax.lang.model.type.NullType;
import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        //to print sum of all elements of array

        System.out.println("enter no of element in array:-");
        int n=sc.nextInt();
        int[] a= new int[n];
        int i,e,sum=0;

        System.out.println("enter element of array one by one:-");
        for(i=0;i<n;i++)
        {
            e=sc.nextInt();
            a[i]=e;
            sum+=e;
        }
        System.out.println("sum of all elements of array ="+sum);

        //to print find max of array

        System.out.println("enter no of element in array:-");
        int n=sc.nextInt();
        int[] a= new int[n];
        int i,e,max= -4000;

        System.out.println("enter element of array one by one:-");
        for(i=0;i<n;i++)
        {
            e=sc.nextInt();
            a[i]=e;
        }
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("max of array="+max);

        //to fin no of odd even element in array

        System.out.println( "enter no of element in array:-");
        int n=sc.nextInt();
        int[] a= new int[n];
        int i,e,on=0,en=0;

        System.out.println("enter element of array one by one:-");
        for(i=0;i<n;i++)
        {
            e=sc.nextInt();
            a[i]=e;
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                en+=1;
            }
            else {
                on+=1;
            }
        }
        System.out.println("no.of odd elements = "+on);
        System.out.println("no. of even elements = "+en);

        //to search a element from array

        System.out.println( "enter no of element in array:-");
        int n=sc.nextInt();
        int[] a= new int[n];
        int i,e;

        System.out.println("enter element of array one by one:-");
        for(i=0;i<n;i++)
        {
            e=sc.nextInt();
            a[i]=e;
        }
        System.out.println("enter element to search:-");
        e=sc.nextInt();

        for(i=0;i<n;i++)
        {
            if(a[i]==e)
            {
                System.out.println("index of given element is "+i);
                break;
            }
        }
        if(i>=n)
        {
            System.out.println("element no found");
        }
        */
        //to print reversed array

        System.out.println( "enter no of element in array:-");
        int n=sc.nextInt();
        int[] a= new int[n];
        int i,e;

        System.out.println("enter element of array one by one:-");
        for(i=0;i<n;i++)
        {
            e=sc.nextInt();
            a[i]=e;
        }
        System.out.println("reversed array");
        for(i=n-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}
