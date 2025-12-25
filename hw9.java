public class hw9 {
    public static boolean canjump(int [] nums)
    {

        int reach=0;
        for(int i=0;i<nums.length;i++)
        {
            if (i > reach)
            {
                return false;
            }

            if(reach < (i+nums[i]) )
            {
                reach=i+nums[i];
            }

            if (reach >= (nums.length-1) )
            {
                return true;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        int []arr={2,2,3,2,5};
        System.out.println(canjump(arr));
    }
}
