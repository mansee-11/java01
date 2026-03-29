//Remove duplicates from a string

import java.util.Scanner;
public class day_23 {
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String str,result="";

        System.out.println("enter the string :- ");
        str=sc.nextLine();

        for(char ch:str.toCharArray())
        {
            if(result.indexOf(ch)==-1)
            {
                result+=ch;
            }
        }

        System.out.println("new string is :- "+result);
    }
}
