import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*class student implements Comparable<student>{
    int rolln;
    String name;

    public student(int rolln, String name)
    {
        this.rolln=rolln;
        this.name=name;
    }
    public int compareTo(student s1)
    {
        return this.rolln - s1.rolln;
    }
    public String toString()
    {
        return this.name+ " "+this.rolln;
    }
}
public class lect16 {
    static void fun(int a){
        if(a>0){
            fun(--a);
            System.out.println(a);
            fun(--a);
        }
    }
    public static void main(String[] args){
         //fun(4);
        ArrayList<student> list=new ArrayList<>();
        list.add(new student(23,"mars"));
        list.add(new student(11,"mansee"));
        Collections.sort(list);
        System.out.println(list);

    }
}*/
class student1{
    String name;
    int rolln;
    public student1(int rolln,String name)
    {
        this.name=name;
        this.rolln=rolln;
    }
    public String toString()
    {
        return rolln+ " "+ name;
    }
}
class namesorted implements Comparator<student1>{
    public int compare(student1 s1,student1 s2)
    {
        return s1.name.compareTo(s2.name);
    }
}
public class lect16{
    public static void main(String[] args){
        ArrayList<student1> list=new ArrayList<>();
        list.add(new student1(23,"mars"));
        list.add(new student1(11,"mansee"));
        Collections.sort(list,new namesorted());
        for(student1 s:list)
        {
            System.out.println(s.rolln+ " "+s.name);
        }

    }
}
