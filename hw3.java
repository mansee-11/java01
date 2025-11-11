//to save 3student data using  class

class student {
    String name;
    int rollno,marks;
    void disp() {
        System.out.println("name = " + name);
        System.out.println("roll number = " + rollno);
        System.out.println("marks = " + marks);
    }
}
public class hw3 {
    public static void main(String[] agrs) {
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
    }
}
