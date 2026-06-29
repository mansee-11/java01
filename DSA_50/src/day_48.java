//Find median in a row-wise sorted matrix

public class day_48 {
    public static int UpperB(int[]row,int target){
        int low=0;
        int high =row.length;
        while(low<high){
            int mid =low+(high-low)/2;
            if(row[mid]<= target) low =mid+1;
            else high = mid;
        }
        return low;
    }
    public static void main(String[] args){
        int[][] mat ={{1,3,5},{2,6,9},{3,6,9}};

        int low =Integer.MAX_VALUE;
        int high =Integer.MIN_VALUE;

        for(int i=0;i<mat.length;i++){
            low=Math.min(low,mat[i][0]);
            high=Math.max(high,mat[i][mat[0].length-1]);
        }

        int req=(mat.length * mat[0].length +1;)/2;
        while(low<high){
            int mid=low+(high-low)/2;
            int c=0;
            for(int i=0;i<mat.length;i++){
                c+=UpperB(mat[i],mid);
            }
            if(c<req) low=mid+1;
            else high =mid;
        }
        System.out.println(low);
    }
}
