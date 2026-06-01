class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Linklist{
    Node head;
    void insert(int data){
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        Node temp= head;
        while (temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
    }
    void insert_b(int data)
    {
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    void print(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    void delete(int data){
        if(head==null){
            return;
        }
        head=head.next;
    }
    void search(int data)
    {
        Node temp=head;
        while (temp!=null && temp.data !=data)
        {
            temp=temp.next;
        }
        if(temp==null) System.out.println("not found");
        else System.out.println("Found yehhhhh!!!!!!");
    }
    Node  rev(Node head)
    {
        Node temp=head,prev=null,next=null;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        head=prev;
        return head;
    }

    void midterm(){
        Node slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("mid term is "+slow.data);
    }
    void checkloop(){
        if(head==null)
        {
            System.out.println("loop not detected");
            return;
        }
        Node slow=head,fast=head.next;
        while(slow.next!=null && fast!=null)
        {
            if(slow.data==fast.data){
                System.out.println("loop detected");
                return;
            }
            if(fast.next==null)
            {
                slow=slow.next;
                fast=slow.next.next;
            }
            else fast=fast.next;
        }
        System.out.println("no loop dtected");
    }
    boolean loop(){
        if(head==null)
        {
            return false;
        }
        Node slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow.data==fast.data)
            {
                return true;
            }
        }
        return false;
    }
    void nth_last(int n){
        Node first=head,second=head;
        for(int i=0;i<n;i++)
        {
            if(first==null)
            {
                System.out.println("list empty");
            }
            first=first.next;
        }
        while(first!=null)
        {
            first=first.next;
            second=second.next;
        }
        System.out.println("nth from last is "+second.data);
    }

    void merge_two(Node h1,Node h2)
    {
        while(h1!=null && h2!=null)
        {
            if(h1.data<h2.data)
            {
                System.out.print(h1.data+" ");
                h1=h1.next;
            }
            else
            {
                System.out.print(h2.data+" ");
                h2=h2.next;
            }
        }
        while(h1!=null)
        {
            System.out.print(h1.data+" ");
            h1=h1.next;
        }
        while(h2!=null)
        {
            System.out.print(h2.data+" ");
            h2=h2.next;
        }
    }
    Node rev_add(Node h1,Node h2){
        Node dummy=new Node(0);
        Node temp=dummy;
        int carry=0;
        Node temp1=h1,temp2=h2;
        while(temp1!=null && temp2!=null || carry!=0)
        {
            int sum=carry;
            if(temp1!=null)
            {
                sum+=temp1.data;
                temp1=temp1.next;
            }
            if(temp2!=null)
            {
                sum+=temp2.data;
                temp2=temp2.next;
            }
            carry=sum/10;
            Node newnode=new Node(sum%10);
            temp.next=newnode;
            temp=temp.next;
        }
        return dummy;
    }
    void del_specific(Node temp)
    {
        if(temp == null || temp.next == null) return;
        temp.data=temp.next.data;
        temp.next=temp.next.next;
    }
    void group_diffrent()
    {
        Node temp=head;
        Node zero=new Node(-1);
        Node one=new Node(-1);
        Node two=new Node(-1);

        Node t1=zero,t2=one,t3=two;

        while(temp!=null){
            if(temp.data==0)
            {
                t1.next=temp;
                t1=t1.next;
            }
            else if(temp.data==1)
            {
                t2.next=temp;
                t2=t2.next;
            }
            else
            {
                t3.next=temp;
                t3=t3.next;
            }
            temp=temp.next;
        }
        t1.next=one.next;
        t2.next=two.next;
        head=zero.next;
    }
    void even_odd(){
        Node even=new Node(-1);
        Node odd=new Node(-1);
        Node e=even,o=odd;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data%2==0)
            {
                e.next=temp;
                e=e.next;
            }
            else
            {
                o.next=temp;
                o=o.next;
            }
            temp=temp.next;
        }
        o.next=even.next;
        head=odd.next;
    }
    long getnum(Node head){
        long num=0;
        while (head != null)
        {
            num=num*10+head.data;
            head=head.next;
        }
        return num;
    }

    Node rev_range(Node head,int x,int y)
    {
//        Node temp=head;
//        while(temp.data!=x)
//        {
//            temp=temp.next;
//        }
//        Node p=temp;
//        Node ttemp=head;
//        while(ttemp.data!=y)
//        {
//            ttemp=ttemp.next;
//        }
//        Node prev=ttemp.next,next=null;
//        while( temp!=null || temp!=ttemp.next){
//            next=temp.next;
//            temp.next=prev;
//            prev=temp;
//            temp=next;
//        }
//        p.next=prev;

        Node dummy = new Node(0);
        dummy.next=head;
        Node prev=dummy;

        for(int i=1;i<x;i++)
        {
            prev=prev.next;
        }
        Node current =prev.next;
        for(int i=0;i<y-x;i++)
        {
            Node next=current.next;
            current.next= next.next;
            next.next=prev.next;
            prev.next=next;
        }
        return dummy.next;
    }
    void change_l_f()
    {
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next.next=head;
        head=temp.next;
        temp.next=null;
    }
    void rev_pair(){
        Node temp=head,current =head;
        Node dummy=new Node(0);
        Node prev=dummy;
        int n=0;
        while(temp.next!=null && temp.next.next.next!=null)
        {
            current=temp.next;
            if(n%2==0)
            {
                temp.next=temp.next.next.next;
            }
            else{
                temp.next=prev;
            }
            prev=temp;
            temp=current;
//            temp.next=temp.next.next;
//            temp.next.next=temp;
//            temp=current.next.next;
        }
        head=dummy.next;
    }
}

public class lect10{
    public static void main(String[] args){
        Linklist l=new Linklist();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.print();
        l.insert_b(6);
        l.insert(7);
        l.print();
        l.search(4);
        l.search(10);
//        l.rev();
//        l.print();
        l.midterm();
    }
}