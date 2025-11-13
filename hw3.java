//to save 3student data using  class

/*class student {
    String name;
    int rollno,marks;
    void disp() {
        System.out.println("name = " + name);
        System.out.println("roll number = " + rollno);
        System.out.println("marks = " + marks);
    }
}
class rectangle{
    int length,bredth;
    void area()
    {
        System.out.println("area of the rectangle is "+(length*bredth));
    }
    void perameter()
    {
        System.out.println("parameter of rectangle is "+(2*(length+bredth)));
    }
}
class circle{
    double  radius;
    void area()
    {
        System.out.println("area of circle is "+(3.14)*radius*radius);
    }
    void circumference()
    {
        System.out.println("circumference of circle is "+(3.14)*2*radius);
    }
}

class book{

    String title,author;
    int price;
    void discount()
    {
        price-=(price/10);
        System.out.println("price after discount:- "+price);
    }
    void disp()
    {
        System.out.println("title:- "+title);
        System.out.println("author:- "+author);
        System.out.println("price:- "+price);
    }
}*/

class movie{
    String name;
    int rating,relyear;
    void disp()
    {
        if(relyear>2020)
        {
            System.out.println("name:- "+name);
            System.out.println("rating:- "+rating);
            System.out.println("release year:- "+relyear);
        }
    }
}
public class hw3 {
    public static void main(String[] agrs) {
        /*
        //to make object of student class

        student s1=new student();
        student s2=new student();
        student s3=new student();
        s1.name="mansee";
        s1.rollno=11;
        s1.marks=100;

        s2.name="manya";
        s2.rollno=23;
        s2.marks=80;

        s3.name="mars";
        s3.rollno=7;
        s3.marks=34;

        s1.disp();
        s2.disp();
        s3.disp();

        //to make object of rectangle class
        rectangle r1=new rectangle();
        rectangle r2=new rectangle();

        r1.bredth=20;
        r1.length=45;

        r2.bredth=11;
        r2.length=23;

        r1.area();
        r1.perameter();

        r2.area();
        r2.perameter();

        //circle class
        circle c1=new circle();
        circle c2=new circle();

        c1.radius=23;
        c2.radius=11;

        c1.area();
        c1.circumference();

        c2.area();
        c2.circumference();

        //book class
        book b1=new book();
        book b2=new book();

        b1.title="Forever You";
        b1.author="mansee";
        b1.price=1123;

        b2.title= "Letting Go";
        b2.author="mars";
        b2.price=257;

        b1.disp();
        b2.disp();

        b1.discount();
        */
        //movie class
        movie m1=new movie();
        movie m2=new movie();
        movie m3=new movie();
        movie m4=new movie();
        movie m5=new movie();

        m1.name="xyz";
        m2.name="abc";
        m3.name="qrs";
        m4.name="efg";
        m5.name="lmn";

        m1.rating=4;
        m2.rating=2;
        m3.rating=5;
        m4.rating=2;
        m5.rating=5;

        m1.relyear=2007;
        m2.relyear=2006;
        m3.relyear=2021;
        m4.relyear=2011;
        m5.relyear=2023;

        m1.disp();
        m2.disp();
        m3.disp();
        m4.disp();
        m5.disp();
    }
}
