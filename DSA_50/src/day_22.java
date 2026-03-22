//Check for palindrome

import java.util.Scanner;
public class day_22 {
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String str;
        System.out.print("enter the string:- ");
        str = sc.nextLine();

        boolean isp=true;
        for(int i=0,j=str.length()-1;i<j;i++,j--)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                isp=false;
                break;
            }
        }

        System.out.println(isp);
    }

}
