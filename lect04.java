import java.util.*;

public class lect04 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        /*
        //to remove duplicate char from string

        String str="mansee";
        String nstr="";
        for(char ch:str.toCharArray())
        {
            if(nstr.indexOf(ch)==-1)
            {
                nstr+=ch;
            }
        }
        System.out.println(nstr);

        //to count frequency of each char in string

        String str="Banana";
        String nstr="";

        for(char ch:str.toCharArray()) {
            if (nstr.indexOf(ch) == -1) {
                nstr += ch;
                int n = 0;
                for (char c : str.toCharArray()) {
                    if (ch == c) {
                        n += 1;
                    }
                }
                System.out.println("frequency of " + ch + " in string=" + n);
            }
        }

        //to find largest word from a string

        System.out.println("enter a string:-");
        String str=sc.nextLine();
        String a[]=str.split(" ");
        String maxs="";
        int max=0;

        for(String s:a)
        {
            int n=0;
            for(char ch:s.toCharArray()) //we can use ch.length() insted of loop
            {
                n++;
            }
            if(n>max)
            {
                max=n;
                maxs=s;
            }

        }
        System.out.println("largest word in string = "+maxs+" no of alphabets = "+max);

        //to print no of words in a string

        System.out.println("enter a string:-");
        String str=sc.nextLine();
        String a[]=str.split(" ");
        int n= a.length();
        System.out.println("no of words = "+n);
        */
        //to check if both string aare alotrome

        System.out.println("enter two string one by one");
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        char[] c1 = s1.toCharArray(); //to convert in array
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);    //to sort array
        Arrays.sort(c2);

        String str1=new String(c1); //to convert in string from array
        String str2=new String(c2);

        if(str1.equals(str2))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}
