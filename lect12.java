//encapsulation
class atm{
    private int totalbalance=1000000;          //getter
    public void grtB(){
        System.out.println("balance in account :- "+totalbalance);
    }
    public void deposite(int amount){       //setter
        if(amount>0){
            totalbalance+=amount;
            System.out.println("balance in account :- "+totalbalance);
        }
    }
    public void widthdrawal(int amount)     //setter
    {
        if(amount>0 && totalbalance>amount){
            totalbalance-=amount;
            System.out.println("balance in account :- "+totalbalance);
        }
        else{
            System.out.println("insufficient balance");
        }
    }
}
class youtube {
    private String channelname;
    private int subscriber,pass;

    public youtube(String channelname,int pass) {
        this.channelname = channelname;
        this.pass=pass;
        this.subscriber = 0;
    }

    public void getcname() {
        System.out.println("channel name :- " + channelname);
    }

    public void getsubscriber() {
        System.out.println("subscriber :- " + subscriber);
    }

    public void setsubscribe() {
        subscriber++;
    }

    public void setunsubscribe() {
        if (subscriber > 0) {
            subscriber--;
        } else {
            System.out.println("0 subscriber already");
        }
    }

    public void getboth(int x) {
        if(x==pass) {
            System.out.println("channel name :- " + channelname);
            System.out.println("subscriber :- " + subscriber);
        }
        else{
            System.out.println("password is wrong");
        }
    }
}
public class lect12 {
    public static void main(String[] args){
        //by defualt veriable declealerd in interface are final (can't be changed)
        // static method can't be overridden

        atm a=new atm();
        a.grtB();
        a.deposite(500000);
        a.widthdrawal(200000);

        //youtube channel creation
        youtube y=new youtube("mansee",1123);
        y.getcname();
        y.getsubscriber();
        y.setsubscribe();
        y.setsubscribe();
        y.setsubscribe();
        y.setunsubscribe();
        y.getboth(1123);
    }
}
