import p1.*;
import p2.A;
class a{
    final void show()
    {
        System.out.println("MANSEE");
    }
}
class b extends a{
    /*@Override
    void show()     //can't override because final keyword is used
    {
        System.out.println("hello");
    }
    */
}
public class lect13 {
    public static void main(String[] args) {
        show s = new show();
        s.concept(5);
        show2 s2=new show2();
        s2.sum(11,23);
        A s3=new A();
        s3.multi(2,5);
    }
}
