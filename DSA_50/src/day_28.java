//Convert string to integer (like atoi)

import java.util.Scanner;

public class day_28 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter string to convert in string");
        String s=sc.nextLine();

        int num=0,sign=1;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)-'0'>=0 && s.charAt(i)-'0'<=9)
            {
                if(num >= Integer.MAX_VALUE / 10 &&  s.charAt(i)-'0'> 7)
                {
                    num=Integer.MAX_VALUE;
                    break;
                }
                num*=10;
                num+=s.charAt(i)-'0';
            }
            else if (s.charAt(i)==' ' && num==0)
            {
                continue;
            }
            else if(s.charAt(i)=='+' || s.charAt(i)=='-')
            {
                if(s.charAt(i)=='-') sign=-1;
            }
            else
            {
                break;
            }
        }
        num*=sign;
        System.out.println(num);
    }
}
