//Print all permutations of a string

import java.util.Scanner;
public class day_24 {
    static void per(String s,String result){
        if(s.length()==0)
        {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String remaining = s.substring(0, i) + s.substring(i + 1);
            per(remaining, result + ch);
        }
    }
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter a string:- ");
        String str=sc.next();

        per(str,"");
    }
}
