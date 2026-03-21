//Reverse a string

import java.util.Scanner;
public class day_21 {
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String str;
        System.out.print("enter the string:- ");
        str = sc.nextLine();

        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }

        System.out.println("reveresed string is "+rev);
    }
}
