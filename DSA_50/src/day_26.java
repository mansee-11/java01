//Count and say problem

import java.util.Scanner;

public class day_26 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter no. of terms:- ");
        int n=sc.nextInt();

        String s="1";
        for(int i=2;i<=n;i++)
        {
            String r="";
            int x=1;
            for(int j=1;j<s.length();j++)
            {
                if(s.charAt(j)==s.charAt(j-1)){
                    x+=1;
                }
                else
                {
                    r+=x;
                    r+=s.charAt(j-1);
                    x=1;
                }
            }
            r+=x;
            r+=s.charAt(s.length()-1);
            s=r;
        }
        System.out.println(s);
    }
}
