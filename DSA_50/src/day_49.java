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

        while(!(top>=bottom) && !(left>=right))
        {
            int i;
            for(i=left;i<=right;i++) System.out.print(mat[top][i] +" ");
            for(i=top+1;i<=bottom;i++) System.out.print(mat[i][right]+" ");
            for(i=right-1;i>=left;i--) System.out.print(mat[bottom][i]+" ");
            for(i=bottom-1;i>top;i--) System.out.print(mat[i][left]+" ");
            top+=1;
            bottom-=1;
            left+=1;
            right-=1;
        }
    }
}