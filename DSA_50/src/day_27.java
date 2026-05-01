//Longest common prefix

import java.util.Scanner;
public class day_27 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter two string - ");
        String s1=sc.next();
        String s2=sc.next();

        String result="";
        for(int i=0;i<s1.length();i++)
        {
            if(s2.length()>i && s1.charAt(i)==s2.charAt(i)) result+=s1.charAt(i);
            else break;
        }

        System.out.println("Longest common prefix = "+result);
    }
}
