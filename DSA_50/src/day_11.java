//Rearrange array in alternating positive & negative items

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class day_11 {
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

        ArrayList<Integer> ptv=new ArrayList<>();
        ArrayList<Integer> ntv=new ArrayList<>();
        for(int i:a)
        {
            if(i<0) ntv.add(i);
            else ptv.add(i);
        }

        Iterator <Integer> pi = ptv.iterator();
        Iterator <Integer> ni = ntv.iterator();
        System.out.println(ptv.size()+" "+ ntv.size());
        if(ptv.size()>=ntv.size())
        {
            for(int i=0;i<n;i++)
            {
                if(i%2!=0 && ni.hasNext())
                {
                    a[i]=ni.next();
                }
                else{
                    a[i]=pi.next();
                }
            }
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                if(i%2!=0 && pi.hasNext())
                {
                    a[i]=pi.next();
                }
                else{
                    a[i]=ni.next();
                }
            }
        }

        System.out.print("arranged array = ");
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}
