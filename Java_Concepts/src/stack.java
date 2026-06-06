import java.util.*;
public class stack {
    static Stack<Integer> bottomAdd(int n,Stack<Integer> st){
        Stack<Integer> temp=new Stack<>();
        while(!st.isEmpty())
        {
            temp.push(st.pop());
        }
        st.push(n);
        while(!temp.isEmpty())
        {
            st.push(temp.pop());
        }
        return st;
    }
    static Stack<Integer> revStack(Stack<Integer> st){
        Stack<Integer> temp=new Stack<>();
        while(!st.isEmpty())
        {
            temp.push(st.pop());
        }
        return  temp;
    }
    public static void main(String[] args){

        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
//
//        System.out.println("Removed value: "+st.pop());
//        System.out.println(st.peek());
//        System.out.println(st.isEmpty());
//        System.out.println(st.size());
//        System.out.println(st);

        Stack<Character> r=new Stack<>();
        String rev="";
        String str="mansee";
        int size=0;
        for(char i: str.toCharArray())
        {
            r.push(i);
        }
//        while(!r.isEmpty())
//        {
//            rev+=r.pop();
//            size+=1;
//        }
//        System.out.println("reversed string : "+rev);
//
//        if(str==rev)
//        {
//            System.out.println("palindrome");
//        }
//        else{
//            System.out.println("not palindrome");
//        }

//        System.out.println("size of string is "+ size);

//        Stack <Character> t=new Stack<>();
//        t.addAll(r);
//        while(!r.isEmpty())
//        {
//            t.push(r.pop());
//        }
//        while(t.peek()!=peek)
//        {
//            t.push(t.pop());
//        }
//        char s='r';
//        while(!r.isEmpty()){
//            char x=r.pop();
//            if(x==s)
//            {
//                System.out.println("found");
//                break;
//            }
//        }
//        if(r.isEmpty()){
//            System.out.println("not found");
//        }

        //or

//        if(r.contains(s))
//        {
//            System.out.println("found");
//        }
//        else{
//            System.out.println("not found");
//        }

//        int max=st.peek(),min=st.peek();
//        st.pop();
//        while(!st.isEmpty())
//        {
//            int x=st.pop();
//            if(x>max)
//            {
//                max=x;
//            }
//            if(x<min)
//            {
//                min=x;
//            }
//        }
//        System.out.println("minimum = "+min);
//        System.out.println("maximum = "+max);

        st=bottomAdd(6,st);
        System.out.println(st);
        st=revStack(st);
        System.out.println(st);
    }
}
