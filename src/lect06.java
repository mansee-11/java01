class car{
    String name1="hello";    //we can use instant variable in instant function without making object
    void concept1()
    {
        System.out.println(name1);
    }

    String name2="hello";
    static void concept2() {
        //System.out.println(name2);  we can't use instant variable in static function without creating object
        car obj1=new car();
        System.out.println(obj1.name2); //to use instant variable in static function
    }
}

public class lect06 {

    //it is main class because main function is inside it
    int data=20;
    static int a=10;

    void concept(){ //use static keyword before the function header it will become static function
        System.out.println("instant function");
    }
    public static void main(String[] agrs) {

        //we use ststic before main so that we can call it without making any object

        System.out.println(a);  //we can access static variable directly

        //System.out.println(data); cant use instant variable directly

        lect06 obj= new lect06();   //making object to call instant variable
        System.out.println(obj.data);   //only this way we can use instant variable
        System.out.println(obj.a);  //can also use static variable by this method

        obj.concept();  //to call instant function

        //concept(); if the function is static

        car obj2=new car(); //to use function or variable out of main class
        obj2.concept1();
        obj2.concept2();
    }
}
