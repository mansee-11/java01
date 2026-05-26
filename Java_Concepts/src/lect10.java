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
    void rev()
    {
        Node temp=head,prev=null,next=null;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        head=prev;
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