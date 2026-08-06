//Spiral traversal of a matrix

public class day_49 {
    public static void main(String[] args){
        int[][] mat={{1,2,3,4},
                {16,17,18,5},
                {15,24,19,6},
                {14,23,20,7},
                {13,22,21,8},
                {12,11,10,9}};
        int m=mat.length,n=mat[0].length;
        int top=0,bottom=m-1,left=0,right=n-1;

        while(top<=bottom && left<=right)
        {
            int i;

            for(i=left;i<=right;i++)
            {
                System.out.print(mat[top][i] +" ");
            }
            top+=1;

            for(i=top;i<=bottom;i++)
            {
                System.out.print(mat[i][right]+" ");
            }
            right-=1;

            if(top<=bottom)
            {
                for(i=right;i>=left;i--)
                {
                    System.out.print(mat[bottom][i]+" ");
                }
                bottom-=1;
            }
            if(left<=right)
            {
                for(i=bottom;i>=top;i--)
                {
                    System.out.print(mat[i][left]+" ");
                }
                left+=1;
            }
        }
    }
}