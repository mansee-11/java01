import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.ListIterator;

public class lect19
{
    static void VoteAge(int age)
    {
        if(age<18)
        {
            throw new IllegalArgumentException("NOT ELIGIBLE");
        }
    }
    static void riskymethod() throws ArithmeticException
    {
        System.out.println("riskey method start");
        int result=10/0;
        System.out.println(result);

        System.out.println("riskeymethod end");
    }
    public static void main(String[] args)
    {
        /*
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(2);

        ListIterator<Integer> it2=list.listIterator();

        int x=list.size()/2;
        int c=0;
        while(it2.hasNext())
        {
            Integer y=it2.next();
            c++;
            if(c>x)
            {
                System.out.println(y);
            }
        }

        //exception handling
        System.out.println("hello jii");
        try
        {
            int a=5;
            int b=0;
            int c=a/b;
            System.out.println(c);
            int arr[]={1,2,3};
            System.out.println(arr[5]);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("will always runs");
        }
        System.out.println("bye bye");

        //voting age check
        try
        {
            VoteAge(15);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try
        {
            VoteAge(19);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        */
        //throws
        try
        {
            riskymethod();
        }
        catch(Exception e)
        {
            System.out.println("main mai handel hoga: "+ e);
        }
        System.out.println("program continue");

        //find maxsum arr;
        int k=3,sum=0,maxsum=0;
        int a[]={5,-3,0,6,3,7};
        for(int i=0; i<k; i++)
        {
            sum+=a[i];
        }
        maxsum=sum;
        for(int i=0,j=k;j<a.length;i++,j++)
        {
            sum+=a[j];
            sum-=a[i];
            if(maxsum<sum)
            {
                maxsum=sum;
            }
        }
        System.out.println(maxsum);
    }
}
