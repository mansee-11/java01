class function{
    //function overloading

    void fover(int a)
    {
        System.out.println("square of num= "+(a*a));
    }
    void fover(String a)
    {
        System.out.println(a);
    }
}
class calc{
    void sum(int a,int b)
    {
        System.out.println("sum = "+(a+b));
    }
    void sum(int a, int b ,int c)
    {
        System.out.println("sum = "+(a+b+c));
    }
    void sum(double a,double b)
    {
        System.out.println("sum = "+(a+b));
    }
    void sum(double a,double b,double c)
    {
        System.out.println("sum = "+(a+b+c));
    }
}
class shapes{
    void area(int r)
    {
        System.out.println("area of circle = "+(r*r*(3.14)));
    }
    void area(int a,int b)
    {
        System.out.println("area of quardilatral = "+(a*b));
    }
    void area(double b,double h)
    {
        System.out.println("area of triangle = "+((0.5)*b*h));
    }
}
class BOOKS{
    void details(String title,String author,int price)
    {
        System.out.println("title of book = "+title);
        System.out.println("author of book = "+author);
        System.out.println("price of book = "+price);
    }
    void details(String title,String author)
    {
        System.out.println("title of book = "+title);
        System.out.println("author of book = "+author);
    }
}
class disp{
    void array(int a[])
    {
        System.out.println("elements of array are:-");
        for(int i:a)
        {
            System.out.println(i);
        }

    }
    void array(String a[])
    {
        System.out.println("elements of array are:-");
        for(String i:a)
        {
            System.out.println(i);
        }

    }
    void array(int a[][])
    {
        System.out.println("elements of array are:-");
        for(int i[]:a)
        {
            for(int j:i)
            {
                System.out.println(j);
            }

        }

    }
}
public class hw5 {
    public static void main(String[] args){
        /*
        function f=new function();
        f.fover("mansee");
        f.fover(5);

        calc s=new calc();
        s.sum(2,5);
        s.sum(2,5,7);
        s.sum(1.1,2.3);
        s.sum(1.1,2.2,3.3);

        shapes a=new shapes();
        a.area(5);         //for circle
        a.area(2,3);    //for rectangle
        a.area(4,4);    //for square
        a.area(1.1,2.3);//for triangle

        BOOKS b=new BOOKS();
        b.details("forever you ","mansee",1123);
        b.details("forever you","mansee");
        */
        int []x={1,2,3,4,5};
        String []y={"mansee","manya","mars"};
        int[][]z={{1,2,3},{4,5,6},{7,8,9}};
        disp d=new disp();
        d.array(x);
        d.array(y);
        d.array(z);
    }
}
