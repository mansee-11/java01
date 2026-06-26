//Pascal's Triangle

public class day_45 {
    public static void main(String[] args){
        int [][] mat = new int[5][5];

        for(int i=0;i<5;i++) {
            for(int j=0;j<=i;j++)
            {
                if(j == 0 || j == i)
                {
                    mat[i][j]=1;
                }
                else {
                    mat[i][j] = mat[i-1][j-1]+mat[i-1][j];
                }
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
