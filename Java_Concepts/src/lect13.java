import java.util.Arrays;
import java.util.Stack;

public class lect13 {
    public static void main(String[] args){
        int[] arr={100,80,60,70,60,75,85};
        int []  ans=new int[arr.length];

        Stack<Integer> st=new Stack<>();

        for(int i=arr.length-1;i>=0;i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - st.peek();
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
