//boundary traversal of matrix

public class day_44 {
    public static void main(String[] args){
        int [][] mat = {{1,3,4},{2,5,6},{7,0,8}};

        for(int i=0;i<mat[0].length;i++) {
            System.out.print(mat[0][i]+" ");
        }
        for(int i=1;i<mat.length;i++)
        {
            System.out.print(mat[i][mat[0].length-1]+" ");
        }
        for(int i=mat[0].length-2;i>=0;i--)
        {
            System.out.print(mat[mat.length-1][i]+" ");
        }
        for(int i=mat.length-2;i>0;i--)
        {
            System.out.print(mat[i][0]+" ");
        }
    }
}
