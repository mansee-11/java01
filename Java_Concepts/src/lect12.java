import java.util.Arrays;
import java.util.Stack;

public class lect12 {
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();

        int [] arr={4,5,2,10};
        int[] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            if(!st.isEmpty() && st.peek()<=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                ans[i]=-1;
            }
            else
            {
                ans[i]=st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(ans));


    }
}
