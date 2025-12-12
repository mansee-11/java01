
class Bank {
    int balance = 100;

    synchronized void widthraw(int amt) {
        System.out.println(Thread.currentThread().getName() + " is checking balance");
        if (balance >= amt) {
            System.out.println(Thread.currentThread().getName()+" is widrawing balance");
            balance = balance - amt;
            System.out.println("Balance left: " + balance);
        } else {
            System.out.println("Not enough balance");
        }
    }
}
class MyThread extends Thread{
    /*public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 1; i <= 5; i++) {
            System.out.println("downloading files" + (i * 20) + "%");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }*/
    Bank b;
    MyThread(Bank b){this.b =b;}
    public void run()
    {
        b.widthraw(100);
    }
}
public class lect21{
    public static void main(String[] agrs)
    {
        /*
        MyThread t1=new MyThread();
        t1.start(); //do not need to use run method it will be done

        for(int i=1;i<=5;i++)
        {
            System.out.println("timer"+i);
            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        try
        {
            t1.join(); //block second tread
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        */
        Bank b=new Bank();
        MyThread t1=new MyThread(b);
        MyThread t2=new MyThread(b);

        t1.setName("xyz");
        t2.setName("abc");
        t1.start();
        t2.start();
    }
}
