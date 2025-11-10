import java.util.*;

public class lect05 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        /*
        String str="hello"; //normal sting creation immutable
        String str1="h";

        StringBuilder s=new StringBuilder("Manse"); //string creation mutable

        //use some in-built function

        s.append(" Asati");   //to add something after the created string
        System.out.println("append(): "+s);

        s.insert(4,'e');    //to insert something in between of created string
        System.out.println("insert(): "+s);

        s.replace(4,6,"i"); //to replace string with other
        System.out.println("replace(): "+s);

        s.deleteCharAt(6);  //to delete single char
        System.out.println("deleteCharAt(): "+s);

        s.delete(6,10);                   //to delete something from string
        System.out.println("delete(): "+s);

        System.out.println("reverse(): "+s.reverse());  //to reverse string

        System.out.println("length(): "+s.length());    //to find length

        System.out.println("capacity(): "+s.capacity());
        //to find capasity that how many char we can have in string

        // to reverse each word at their position;

        String str= sc.nextLine();
        String a[]=str.split(" ");
        StringBuilder str1=new StringBuilder();
        //can also use String str1="";
        for(String w:a)
        {
            StringBuilder s=new StringBuilder(w);
            s.reverse().append(" ");
            str1.append(s);
            //str1+=s
        }
        System.out.println(str1);

        //to compress string input-aabcca output-a2b1c2a1

        StringBuilder result= new StringBuilder();
        String str=sc.nextLine();
        int count=1;
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==str.charAt(i-1))
            {
                count++;
            }
            else
            {
                result.append(str.charAt(i-1)).append(count);
                count=1;
            }
        }
        result.append(str.charAt(str.length()-1)).append(count);
        System.out.println(result);
        */
        //to chek palindrome

        StringBuilder str1= new StringBuilder(sc.nextLine());
        StringBuilder str2=new StringBuilder(str1);
        str2.reverse();
        String s1=str1.toString();
        String s2=str2.toString();
        if(s1.equals(s2))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }

    }
}
