import java.util.ArrayList;

public class lect14 {
    public static void main(String[] args){

        //int is a datatype
        //integer is a class use class in dynamic array
        ArrayList<Integer> list =new ArrayList<>();     //to create array dynamically
        list.add(7);    //to insert element
        list.add(11);
        list.add(1,23);        //to insert element at specific index
        System.out.println(list.indexOf(11));
        System.out.println(list);           //to print whole array
        System.out.println(list.get(2));    //to print specific element

    }
}
