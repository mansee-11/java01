// Implement strstr()(substring search) & product excptSelf

import java.util.Arrays;

public class day_29 {
    public static int[] productExceptSelf(int[] nums) {
        int []a=new int[nums.length];
        int m=1;
        a[0]=m;
        for(int i=1;i<nums.length;i++)
        {
            m=m*nums[i-1];
            a[i]=m;
        }
        m=1;
        for(int i=nums.length-2;i>=0;i--)
        {
            m*=nums[i+1];
            a[i]*=m;
        }
        return a;
    }
    static void main(String[] args){
        String s1="mississippi" ,s2="issip";
        int s=-1;
        for(int i=0;i<s1.length()-s2.length();i++)
        {
            int j;
            for(j=0;j<s2.length();j++)
            {
                if(s1.charAt(i+j)!=s2.charAt(j)) break;
            }
            if(j==s2.length())
            {
                s=i;
                break;
            }
        }
        System.out.println("substr index : "+s);
        /*int[] nums={1,2,3,4};
        int [] result=productExceptSelf(nums);
        for(int i:result)
        {
            System.out.print(i+" ");
        }*/
    }
}
