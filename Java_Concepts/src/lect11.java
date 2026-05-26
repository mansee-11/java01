public class lect11 {
    public static void main(String[] args){
        Linklist s=new Linklist();
        Linklist l=new Linklist();
        l.insert(1);
        s.insert(2);
        l.insert(3);
        s.insert(4);
        s.insert(5);
        l.insert(6);
        s.insert(7);
        l.insert(1);
        l.insert(2);
        l.print();
//        s.print();
//        if(l.loop())
//        {
//            System.out.println("loop detected");
//        }
//        else
//        {
//            System.out.println("loop not detected");
//        }
//        l.checkloop();
//        l.nth_last(3);
//        l.merge_two(l.head,s.head);
    }
}
