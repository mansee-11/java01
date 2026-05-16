//Group anagrams together

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class day_33 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no of strings: ");
        int n= sc.nextInt();
        String[] a=new String[n];
        System.out.println("enter stings one by one:- ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.next();
        }
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        
        for(String i: a)
        {
            char []b=i.toCharArray();
            Arrays.sort(b);
            String c = Arrays.toString(b);
            if(!map.containsKey(c))
            {
                map.put(c,new ArrayList<>());
            }
            map.get(c).add(i);
        }

        for(String i:map.keySet())
        {
            System.out.println(map.get(i));
        }
    }
}
