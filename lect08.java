class Animal
{
    void eat()
    {
        System.out.println("food");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("bhau bhau");
    }
}
class Puppy extends Dog
{
    void sleep()
    {
        System.out.println("neend is important");
    }
}

public class lect08 {
    public static void main(String[] args) {
        Dog s1=new Dog();
        s1.eat();
        Puppy s2=new Puppy();
        s2.sleep();
        s2.bark();
        s2.eat();
    }

}
