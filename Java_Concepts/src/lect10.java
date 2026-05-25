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
        Node slow=head,fast=head;
        while(slow.next!=null)
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