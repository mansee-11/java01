//jump game II

public class day_50 {
    public static void main(String[] args){
        int [] nums= new int[]{2, 3, 1, 1, 4};
        int jump=0,current=0,last=0;

        for(int i=0;i<nums.length-1;i++)
        {
            last=Math.max(last,i+nums[i]);

            if(i==current)
            {
                jump++;
                current=last;
            }
        }
        System.out.println("no. of jums = "+jump);
    }
}
