import java.util.Scanner;

public class lect03 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        /*
        //sting in-built functions

        String str= " Mansee ";

        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.substring(4));
        System.out.println(str.substring(2,6));
        System.out.println(str.indexOf('M'));

        // to compare two strings

        String str="hello";
        String str1="hello";                //true because memory alloted to str 1 and str is same
        System.out.println(str==str1);      // we are comparing refrence veriable not string

        String s=new String("hello"); //two diffrent memory are allocated to s and s1
        String s1=new String("hello");
        System.out.println(s==s1);           // false we are comparing variable location which is not same
        System.out.println(s.equals(s1));   //now comparing values which is true

        //to check palindrome

        String a="naman";
        String b="";
        for(int i=a.length()-1;i>=0;i--)
        {
            b+=a.charAt(i);
        }
        if(a.equals(b))
        {
            System.out.println("palindrome string");
        }
        else
        {
            System.out.println("Not palindrome");
        }

        // to split string and convert it in array

        String str="java cpp c js py ";
        String a[]=str.split(" ");

        for(String s:a)
        {
            System.out.println(s);
        }
        */
        //to count no. of vowels and consonant

        String str="java cpp c js py ";

        int v=0,c=0;
        for(char s:str.toCharArray())
        {
           if("aeiouAEIOU".indexOf(s)!=-1)
           {
               v++;
           }
           else
           {
               c++;
           }
        }
        System.out.println("no. of vowel = "+v);
        System.out.println("no. of consonants = "+c);
    }
}
