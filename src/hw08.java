class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length=nums1.length+nums2.length;
        int []nums3=new int[length];
        for(int i=0;i<nums1.length;i++)
        {
            nums3[i]=nums1[i];
        }
        for(int i=nums1.length,j=0;j<nums2.length;i++,j++)
        {
            nums3[i]=nums2[j];
        }
        for(int i=0;i<length;i++)
        {
            for(int j=0;j<length;j++)
            {
                if(nums3[i]>nums3[j])
                {
                    int x=nums3[i];
                    nums3[i]=nums3[j];
                    nums3[j]=x;
                }
            }
        }
        if(nums3.length%2==0)
        {
            double x;
            x=nums3[nums3.length/2]+nums3[(nums3.length-1)/2];
            x/=2;
            return x;

        }
        double x=nums3[(nums3.length-1)/2];
        return x;
    }
    public static void main(String[] args){
        int[]a={2,3};
        int []b={1,4};
        System.out.println(findMedianSortedArrays(a,b));
    }
}
