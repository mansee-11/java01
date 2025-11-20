//multiple inheritance not possible this way
        /*
        class A{
            void eat(){
                System.out.println("food");
            }
        }
        class B{
            void eat(){
                System.out.println("khana");
            }
        }
        class C extends A,B{
            int c;
        }
        */
//to use multiple inheritance we use interface(fully abstraction)
interface x{    //constructor can not be made in interface
    abstract void login();
}
interface y{
    abstract void login();
}
class z implements x,y{   //the child class should implement all the funcions of interface
    public void login(){
        System.out.println("multiple inheritace");
    }
}

// to use default method in interface
interface vehicle {
    default void start(){
        System.out.println("vehicle is starting");
    }
}
class cars implements vehicle{
    void use(){
        System.out.println("to understand defult method");
    }
}

interface walkable{
    void walk();
}
interface runnable{
    void run();
}
class human implements walkable,runnable{
    public void walk(){
        System.out.println("can walk");
    }
    public void run(){
        System.out.println("can run");
    }
}
public class lect11 {
    public static void main(String[] args){

        z s1=new z();
        s1.login();

        cars c1=new cars();
        c1.use();
        c1.start();

        human h=new human();
        h.run();
        h.walk();
    }
}
