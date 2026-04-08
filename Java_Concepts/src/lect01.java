import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class lect01 {
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        /*
        String str1="Hello";
        String str2=new String("naman");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.length());
        System.out.println(str1.substring(1));
        System.out.println(str1.substring(1,4));
        System.out.println(str1.replace('H','c'));
        System.out.println(str1.equals(str2));
        System.out.println(str1.contains("world"));

        //to reverse
        String rev="";
        for(int i=str2.length()-1;i>=0;i--)
        {
            rev+=str2.charAt(i);
        }
        if(rev.equals(str2)) System.out.println("palindrome");
        else System.out.println("not palindrome");
        System.out.println("reverse string : "+rev);

        //to find strings are anagramus or not

        String s1,s2;
        System.out.println("enter two strings :- ");
        s1=sc.next();
        s2=sc.next();

        if(s1.length()==s2.length())
        {
            HashMap <Character,Integer> m1=new HashMap<>();
            HashMap <Character,Integer> m2=new HashMap<>();

            for(char i:s1.toCharArray())
            {
                m1.put(i,m1.getOrDefault(i,0)+1);
            }
            for(char i:s2.toCharArray())
            {
                m2.put(i,m2.getOrDefault(i,0)+1);
            }
            boolean flag=true;
            for(char i: m1.keySet())
            {
                if(!m2.containsKey(i) || !(m2.get(i).equals( m1.get(i))))
                {
                    System.out.println("not anagrams");
                    flag=false;
                    break;
                }
            }
            if(flag) System.out.println("anagrams");
        }
        else
        {
            System.out.println("not anagrams");
        }

        //to find strings are anagrams or not

        String s1,s2;
        System.out.println("enter two strings :- ");
        s1=sc.next();
        s2=sc.next();

        char[]a = s1.toCharArray();
        char[]b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b))
        {
            System.out.println("Anagrams");
        }
        else
        {
            System.out.println("Not Anagrams");
        }

        //to compress string
        String str;
        System.out.println("enter strings :- ");
        str=sc.nextLine();
        String nstr="";
        int count=1;
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==str.charAt(i-1))
            {
                count++;
            }
            else
            {
                nstr+=str.charAt(i-1);
                nstr+=count;
                count=1;
            }
        }
        System.out.println("compressed string = "+nstr);

        //first non repeating char
        String str;
        System.out.println("enter strings :- ");
        str=sc.nextLine();

        HashMap <Character,Integer> m1=new HashMap<>();
        for(char i:str.toCharArray())
        {
            m1.put(i, m1.getOrDefault(i, 0) + 1);
        }
        for(char i: str.toCharArray())
        {
            if(m1.get(i)==1)
            {
                System.out.println("first non repeating char is "+i);
                break;
            }
        }
        */
        //all substring
        String str;
        System.out.println("enter strings :- ");
        str=sc.nextLine();

        for(int i=0;i<=str.length();i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.println(str.substring(j,i));
            }
        }
    }
}
