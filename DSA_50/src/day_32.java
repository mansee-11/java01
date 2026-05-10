//Longest substring without repeating characters

import java.util.HashSet;

public class day_32 {
    public static void main(String[] args){
        String s="aabcdebefcdexya";
        String x="",r="";
        for(char i:s.toCharArray())
        {
            if(x.indexOf(i)!=-1)
            {
                x=x.substring(x.indexOf(i)+1);
            }
            x+=i;
            if(r.length()<x.length()) r=x;
        }
        System.out.println(r);
    }
}
