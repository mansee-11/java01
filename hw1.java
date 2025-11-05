import java.util.Scanner;

public class hw1{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        /*

        //to check odd even

        System.out.println("enter a nuber to check odd even ");
        int a= sc.nextInt();    //integer input

        if(a%2==0)
        {
            System.out.println(a+" is even number");
        }
        else
        {
            System.out.println(a+" is odd number");
        }

        // to check positive negative zero

        System.out.println("enter integer ");
        int a= sc.nextInt();    //integer input

        if(a>0)
        {
            System.out.println(a+" is positive integer");
        } else if (a<0)
        {
            System.out.println(a+" is negative integer");
        }
        else
        {
            System.out.println(a+" is zero integer");
        }

        // to find grater of two

        System.out.println("enter 1st integer ");
        int a= sc.nextInt();

        System.out.println("enter 2nd integer ");
        int b= sc.nextInt();

        if(a>b)
        {
            System.out.println(a+" is greater");
        }
        else if (a<b)
        {
            System.out.println(b+" is greater");
        }
        else
        {
            System.out.println("Both numbers are equal ");
        }

        // to check vowel consonant switch case

        System.out.println("enter a character");
        char c=sc.next().charAt(0);

        switch(c)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': {
                System.out.println("given char is vowel");
                break;
            }
            default:
            {
                System.out.println("given char is consonant");
            }
        }

        //to print n integer and sum of them

        System.out.println("enter integer to print till it:- ");
        int a= sc.nextInt();
        int s=0;

        for(int i=1;i<=a;i++)
        {
            System.out.println(i);
            s+=i;
        }
        System.out.println("sum of first "+a+" integers is "+s);

        // to print table of n

        System.out.println("enter a number to print its table:-");
        int a= sc.nextInt();
        int t=0;
        for(int i=0;i<10;i++)
        {
            t=t+a;
            System.out.println(t);
        }

        //to check given number is divisible by 5 &11

        System.out.println("enter a number to check divisiblility by 5 & 11");
        int a= sc.nextInt();
        if(a%5==0 && a%11==0)
        {
            System.out.println(a+" is divisible by 5 and 11");
        }
        else if (a%5==0)
        {
            System.out.println(a+" is divisible by 5 only");
        }
        else if (a%11==0) {
            System.out.println(a+" is divisible by 11 only");
        }
        else
        {
            System.out.println(a+" is neither divisible by 5 nor by 11");
        }

        //to do type casting float to int

        System.out.println("enter a float:-");
        float b= sc.nextFloat();
        int a=(int)b;
        System.out.println(a);
        System.out.println(b);

        //to check num is multiple of 3 or not

        System.out.println("enter a number to check if it is multiple of 3:-");
        int n= sc.nextInt();
        boolean a=true;
        if(n%3!=0)
        {
            a=false;
        }
        System.out.println(a);

        //to print ascii of a char

        System.out.println("enter a character");
        char c=sc.next().charAt(0);
        int a=c;
        System.out.println( a+" is ascii of the char");

        //to print factorial

        System.out.println("enter a number");
        int f=1,i, c=sc.nextInt();

        for(i=c;i>0;i--)
        {
            f=f*i;
        }
        System.out.println("factorial is "+f);

        //to reverse a number using while loop

        System.out.println("enter a number");
        int i,r=0,c=sc.nextInt();

        while(c!=0)
        {
            i=c%10;
            r=r*10+i;
            c=c/10;
        }
        System.out.println("reversed number is "+r);

        //to check weather no is prime or not

        System.out.println("enter a number");
        int i=-1, n=sc.nextInt();
        if(n==1 || n==0)
        {
            System.out.println("1 & 0 are nither prime nor composite");
        }
        else
        {
            for(i=2;i<=(n/2);i++)
            {
                if(n%i==0)
                {
                    System.out.println("number is composite");
                    break;
                }
            }
        }
        if(i>(n/2))
        {
            System.out.println("number is prime");
        }
        */
        // to make simple calculator for 2 numbers

        int i=1;
        while(i==1)
        {
            System.out.println("enter first num :-");
            int x=sc.nextInt();

            System.out.println("enter second num :-");
            int y=sc.nextInt();

            System.out.println("1 = sum\n2 = sub\n3 = multiply\n4 = divide\n5 = exit\nEnter your choice :-");
            int c=sc.nextInt();

            switch(c)
            {
                case 1:
                {
                    System.out.println("sum is "+(x+y));
                    break;
                }
                case 2:
                {
                    System.out.println("sub is "+(x-y));
                    break;
                }
                case 3:
                {
                    System.out.println("multiply is"+(x*y));
                    break;
                }
                case 4: {
                    if (y == 0) {
                        System.out.println("not defined");
                    } else {
                        System.out.println("divide is" + (x / y));
                    }
                    break;
                }
                case 5:
                {
                    i=0;
                    break;
                }
                default: System.out.println("wrong choice input");

            }
        }
    }

}
