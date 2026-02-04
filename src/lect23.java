//to get majority element from array(element arriving n/2+1 times)
public class lect23 {
    public static int majority(int[] nums)
    {
        int count=0;
        int ans=0;
        for(int i:nums) {
            if (count == 0) {
                ans = i;
            }
            if (i == ans) {
                count++;
            } else {
                count--;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int []arr={2,2,3,2,5};
        System.out.println(majority(arr));
    }
}
