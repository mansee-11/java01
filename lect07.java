import java.util.Scanner;

class Car{
    int a;
    String name;
    Car(int a,String name){                //constructor
        this.a=a;
        this.name=name;
        System.out.println("name: "+name);
        System.out.println("a: "+a);
    }
}

class bankaccount{
    Scanner sc=new Scanner(System.in);
    String accno,accholder;
    int balance;
    void wd()
    {
        System.out.println("enter ammount to  withdraw:-");
        int i=sc.nextInt();
        if(i>balance)
        {
            System.out.println("insufficient balance");
        }
        else
        {
            balance-=i;
            System.out.println("remaining balance= "+balance);
        }
    }
    void deposit()
    {
        System.out.println("enter ammount to deposite:-");
        int i=sc.nextInt();
        balance+=i;
        System.out.println("total balance after deposit = "+balance);
    }
}
public class lect07 {
    public static void main(String[] agrs){

        Car s1=new Car(1,"mansee");
        Car s2=new Car(2,"ansee");
        Car s3=new Car(3, "see");

        bankaccount b1=new bankaccount();
        bankaccount b2=new bankaccount();
        bankaccount b3=new bankaccount();
        b1.accholder="mansee";
        b1.accno="cs241185";
        b1.balance=1000000000;

        b2.accholder="mars";
        b2.accno="cs231153";
        b2.balance=2000000000;

        b3.accno="cs230507";
        b3.accholder="rup";
        b3.balance=1000000000;

        b1.wd();
        b2.wd();
        b3.wd();

        b1.deposit();
        b2.deposit();
        b3.deposit();
    }
}
