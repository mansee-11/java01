import java.util.HashMap;
import java.util.Scanner;

public class lect02 {
    static int fact(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    static boolean palindrome(String s,int i,int n)
    {
        if (i >= n) return true;
        if(s.charAt(i)!= s.charAt(n)) return false;
        return palindrome(s,++i,--n);
    }
    static void revstr(String s,int n)
    {
        if(n<0)
        {
            System.out.println();
            return;
        }
        System.out.print(s.charAt(n));
        revstr(s,n-1);
    }
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String str;
        System.out.print("enter strings :- ");
        str=sc.nextLine();
        /*
        //count of substring with same first and last char
        int count=0;

        for(int i=0;i<=str.length();i++)
        {
            for(int j=0;j<i;j++)
            {
                String s= str.substring(j,i);
                if(s.toCharArray()[0]==s.toCharArray()[s.length()-1])
                {
                    count++;
                }
            }
        }
        System.out.println("count of substring with same first and last char = "+count);

        int count=0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<=i;j++)
            {
                if(str.charAt(j)==str.charAt(i))
                {
                    count++;
                }
            }
        }
        System.out.println("count of substring with same first and last char = "+count);

        //remove a specific char from string

        char ch;
        System.out.print("enter a char:- ");
        ch=sc.next().charAt(0);

        String result="";
        for(char i: str.toCharArray())
        {
            if(i !=ch) result+=i;
        }
        System.out.println("string after removal = "+result);

        //max num from string
        char max=0;
        for(char i: str.toCharArray())
        {
            if("0123456789".indexOf(i)!=-1 && max<i)
            {
                max=i;
            }
        }
        System.out.println("max num in string is "+max);

        //input - aabbbcdaaeff output - abcdef

        String result="";
        result+=str.charAt(0);
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)!=str.charAt(i-1))
            {
                result+=str.charAt(i);
            }
        }
        System.out.println("string after removal = "+result);

        System.out.println("enter two number one by one:- ");
        String s1=sc.next() ,s2= sc.next();
        int num1=0,num2=0;
        for(char i:s1.toCharArray())
        {
            num1*=10;
            num1+=Character.getNumericValue(i);// or use i-'0' to convert fro ascii to num
        }
        for(char i:s2.toCharArray())
        {
            num2*=10;
            num2+=Character.getNumericValue(i);
        }
        System.out.println("multiplication is "+num1*num2);

        //check if string is a num or not
        boolean isnum=true;
        for(char i:str.toCharArray())
        {
            if("0123456789".indexOf(i)==-1)
            {
                System.out.println("not a number");
                isnum=false;
                break;
            }
        }
        if(isnum) System.out.println("yes it's a number");

        //most frequent character in whole string
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:str.toCharArray())
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0;
        char ch=' ';
        for(char i: map.keySet())
        {
            if(map.get(i)>max)
            {
                max=map.get(i);
                ch=i;
            }
        }
        System.out.println("char with max frequency is "+ch);

        //most frequent character adjecently
        int max=0,count=1;
        char ch=' ';
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==str.charAt(i-1))
            {
                count++;
            }
            else
            {
                if(count>max)
                {
                    max=count;
                    ch=str.charAt(i-1);
                    count=1;
                }
            }
        }
        System.out.println("char with max frequency = "+ch);
        */
        //factorial
        System.out.println(fact(5));

        //revstring
        revstr(str,str.length()-1);
        //palindrome
        System.out.println(palindrome(str,0,str.length()-1));
    }
}
