//Search 2D matrix(leetcode 74)

public class day_46 {
    public static void main(String[] args){
        int [][] mat = {{1,3,4},{5,7,8},{11,16,18}};
        int target = 5;

        int low=0;
        int high=mat.length * mat[0].length -1;

        while (low<=high){
            int mid=low +(high-low)/2;

            int row = mid/mat[0].length;
            int col = mid%mat[0].length;

            if(mat[row][col]==target)
            {
                System.out.println("found");
                return;
            }
            else if (mat[row][col]<target) {
                low=mid+1;
            }
            else {
                high =mid-1;
            }
        }
    }
}
