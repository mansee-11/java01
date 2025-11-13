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
}*/
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
        */
        //circle class
        circle c1=new circle();
        circle c2=new circle();

        c1.radius=23;
        c2.radius=11;

        c1.area();
        c1.circumference();

        c2.area();
        c2.circumference();
    }
}
