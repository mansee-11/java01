import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class lect18 {
    public static void main(String[] args){

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(2);
        /*
        Iterator<Integer> it= list.iterator();
        while(it.hasNext())
        {
            Integer x=it.next();
            System.out.println(x);
            if(x==6)
            {
                it.remove();
            }
        }
        System.out.println(list);
        */

        ListIterator<Integer> it2=list.listIterator();
        /*
        while(it2.hasPrevious())
        {
            Integer x=it2.previous();
            System.out.println(x);
        }

        //change odd elements with -1
        System.out.println(list);
        while(it2.hasNext())
        {
            Integer x=it2.next();
            if(x%2!=0) {
                it2.set(-1);
            }
        }
        System.out.println(list);

        //to print half elements of list forward and backward
        int x=list.size()/2+1;
        int c=0;
        while(c<x && it2.hasNext())
        {
            System.out.println(it2.next());
            c++;
        }
        while (it2.hasPrevious() && c>=0)
        {
            System.out.println(it2.previous());
            c--;
        }

        //to get absolute value
        System.out.println(list);
        while(it2.hasNext())
        {
            Integer x= it2.next();
            if(x<0)
            {
                Integer y=0-x;
                it2.set(y);
            }
        }
        System.out.println(list);
        */

        //to remove smaller elements then target from array that are before target

        Integer target=5;
        while(it2.hasNext())
        {
            if(it2.next()== target)
            {
                break;
            }
        }
        while(it2.hasPrevious())
        {
            if(it2.previous()<target)
            {
                it2.remove();
            }
        }
        System.out.println(list);
    }
}
