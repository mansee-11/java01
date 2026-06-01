public class lect11 {
    public static void main(String[] args){
        Linklist s=new Linklist();
        Linklist l=new Linklist();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.insert(6);
        l.insert(7);
        l.insert(8);
//        l.insert(9);
//        s.insert(7);
//        l.insert(1);
//        l.insert(2);
//        l.print();
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

//        Node add=l.rev_add(l.head,s.head);
//        while(add!=null)
//        {
//            System.out.print(add.data+" ");
//            add=add.next;
//        }

//        l.del_specific(l.head.next);
//        l.group_diffrent();
//        l.even_odd();
        l.print();
//        Node x=l.rev_range(l.head,3,8);
//        while(x!=null)
//        {
//            System.out.print(x.data+" ");
//            x=x.next;
//        }
//        l.change_l_f();
//        l.print();
        l.rev_pair();
        l.print();
    }
}
