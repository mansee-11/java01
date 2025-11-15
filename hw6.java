class animal{
    void sound(){
        System.out.println("Animal make sound");
    }
}
class dog extends animal{
    @Override
    void sound(){
        System.out.println("dog barks");    //method overriding
    }
}
abstract class SHAPE{
    abstract void draw();

}
class CIRCLE extends SHAPE{
    @Override
    void draw() {
        System.out.println("circle is drawn");
    }
}
class SQUARE extends SHAPE{
    @Override
    void draw(){
        System.out.println("square is drawn");
    }
}
class Vehicle{
    void startengine(){
        System.out.println("engine started");
    }
}
class car1 extends Vehicle{
    @Override
    void startengine(){
        System.out.println("car engine started");
    }
}
class employ{
    void calculatesalary(int a)
    {
        System.out.println("salary is "+a);
    }
}
class semploy extends employ{
    @Override
    void calculatesalary(int a)
    {
        int x=10000;
        System.out.println("salary is "+(a+x));
    }
}
class per{
    String a;
    int b;
    void details()
    {
        System.out.println("name:- "+a);
        System.out.println("age:- "+b);
    }
}
class stu extends per{
    int grade;
    @Override
    void details()
    {
        System.out.println("name:- "+a);
        System.out.println("age:- "+b);
        System.out.println("grade:- "+grade);
    }
}
public class hw6 {
    public static void main(String[] agrs){
        /*
        animal a=new dog();
        a.sound();

        SHAPE s1=new CIRCLE();
        SHAPE s2=new SQUARE();

        s1.draw();
        s2.draw();

        car1 c=new car1();
        c.startengine();

        employ e1=new employ();
        employ e2=new semploy();
        e1.calculatesalary(50000);
        e2.calculatesalary(50000);
        */
        per p1=new per();
        stu p2=new stu();
        p1.a="mansee";
        p1.b=18;
        p2.a="manya";
        p2.b=15;
        p2.grade=9;

        p1.details();
        p2.details();
    }
}
