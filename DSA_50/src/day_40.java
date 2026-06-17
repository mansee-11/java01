//matrix multiplication

public class day_40 {
    public static void main(String[] args){
        int[][] a={{1,2,3},{4,5,6}};
        int[][] b={{2,4,6},{1,3,5},{7,8,9}};
        if(a[0].length != b.length)
        {
            System.out.println("can't multiply theseee sorry!!!");
        }
        else{
            int[][]mat =new int[a.length][b[0].length];
            for(int i=0;i<mat.length;i++) //first matrix rows
            {
                for(int j=0;j<mat[0].length;j++) //second matrix columns
                {
                    for(int k=0;k<mat[0].length;k++){ //result colums
                        mat[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
