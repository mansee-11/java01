//Check if two strings are anagrams

import java.util.Arrays;
import java.util.Scanner;

public class day_25 {
    static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        String s1,s2;
        System.out.println("enter two strings:- ");
        s1=sc.next();
        s2=sc.next();

        char []a=s1.toCharArray();
        char []b=s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b))
        {
            System.out.println("strings are anagrams");
        }
        else
        {
            System.out.println("Strings are not anagrams");
        }
    }
}
