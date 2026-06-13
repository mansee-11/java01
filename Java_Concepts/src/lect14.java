import java.util.Stack;

public class lect14 {
    public static void main(String[] args){
        String str="/hello/../hii";
        String[] folder =str.split("/");
        Stack <String> st=new Stack<>();
        for(String f:folder)
        {
            if(f.equals("") || f.equals("."))
            {
                continue;
            }
            else if (f.equals("..")) {
                if(!st.isEmpty())
                {
                    st.pop();
                }
            }
            else{
                st.push(f);
            }
        }
        System.out.println(st);
    }
}
