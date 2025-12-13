import java.util.*;

/*
class myThread implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class lect22 {
    public static void main(String[] args){
        myThread task=new myThread();
        Thread t1=new Thread(task);
        Thread t2=new Thread(task);

        t1.start();
        t2.start();
    }
}
*/
public class lect22 {
    public static void main(String[] agrs) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(10);
        list.add(12);

        //to filter data using one condition
        List<Integer> res = list.stream().filter(n->n>60).toList();

        //to perform a task on all element of array
        List<Integer> mapres = list.stream().map(n->n*2).toList();

        //to print the end result after doning one operation on array
        int sum = list.stream().reduce(0,(a,b)->a+b);

        //to find greater then 5,and sum only odd value

        List<Integer> res1 = list.stream().filter(n->n>5 && n%2!=0).toList();

        int sum1 = res1.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum1);

        //to skip the element till given limit
        List<Integer> skip=list.stream().skip(2).toList();

        //to only check till the given limit
        List<Integer> limit=list.stream().limit(5).toList();

        //to sort the array assending
        List<Integer> asorted=list.stream().sorted((a,b)->a-b).toList();
        System.out.println(asorted);

        //to sort the array descending
        List<Integer> dsorted=list.stream().sorted((a,b)->b-a).toList();
        System.out.println(dsorted);
    }
}