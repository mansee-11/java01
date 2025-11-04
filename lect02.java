import java.util.Scanner;

public class lect02 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        /*

        System.out.println("Taking Input");

        System.out.println("enter integer ");
        int a= sc.nextInt();    //integer input

        System.out.println("enter double ");
        double b=sc.nextDouble();   //double input

        System.out.println("enter single word");    //word input
        String c=sc.next();     //S should be capital in String,System,Scanner

        sc.nextLine(); // to buffer clear

        System.out.println("enter full line");
        String d=sc.nextLine(); //sentence input

        System.out.println("integer :"+a);
        System.out.println("double: "+b);
        System.out.println("word: "+c);
        System.out.println("sentence: "+d);

        */

        /*
        // Type Casting

        byte a=5;
        short b=a;  //automatic type casting or internal type casting
        int c=b;    //automatic type casting or internal type casting
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        short d=130;
        byte e= (byte)d;    //forcefully type casting data will be loss
        System.out.println(e);
        */
        /*
        // creating Array
        int a[]={1,2,3,4,5};
        for (int i=0;i<a.length;i++) {  //length is a functin or method
            System.out.println(i);
        }
        System.out.println(a);  //to print specific element at known index
        */
        // string
        String str="MANSEE"; //sring is immutable
        System.out.println(str.charAt(1));  //to print a char at specific index
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }
        for(int j =str.length()-1;j>=0;j--)
        {
            System.out.println(str.charAt(j));
        }
        String str1;
        str1=str.concat(" ASATI");
        System.out.println(str1);

        String s,s1;
        s="hello";
        s1="hello";
        System.out.println(s==s1);

        s=new String("hello");
        s1=new String("hello");
        System.out.println(s==s1);

        // to check palindrome

        boolean isp =true;
        String x="NAMAN";
        char[] ch=x.toCharArray();
        for(int i=ch.length-1,j=0;i>j;i--,j++) {
            if (x.charAt(j) != x.charAt(i)) {
                isp = false;
            }
        }
            System.out.println(isp);
    }
}
