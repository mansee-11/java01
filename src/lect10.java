/*class A{
    void eat(){
        System.out.println("whatever they get");
    }
    void happy(){
        System.out.println("when they get food");
    }
}
class Dog1 extends A{
    void eat(){
        System.out.println("food");
    }
    void sleep(){
        System.out.println("After eating food");
    }
}*/
abstract class shape{
    abstract void area();
}
class circle extends shape{
    void area() {
        System.out.println("3.14*r*r");
    }
}
class rectangle extends shape{
    void area(){
        System.out.println("a*b");
    }
}
abstract class A{
    abstract void eat();
}
class cat extends A{
    void eat(){
        System.out.println("kitkat");
    }
}
public class lect10 {
    public static void main(String[] agrs){
        /*
        Dog1 d1=new Dog1();  //child class using parent class functions
        d1.eat();            //function overriding
        d1.happy();
        d1.sleep();

        A d2=new Dog1();    //upper casting
        d2.eat();           //can use only overriden functions of child class
        d2.happy();         //can use all function of parent class

        Dog1 d3=(Dog1) d2;  //lower casting
        d3.sleep();         //can also use other function of child class
        */
        //abstractions - showing only essential parts to user
        //we can not create object of abstract class

        A c1=new cat(); //upper casting possible
        c1.eat();
        cat c2 =new cat();
        c2.eat();
        //A c3=new A(); not possible

        shape s1=new circle();
        s1.area();

        shape s2=new rectangle();
        s2.area();
    }
}
