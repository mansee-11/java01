//transpose of a matrix

public class day_36 {
    public static void main(String[] args){
        int[][] m={{3,9,0},
                   {4,6,7},
                   {1,2,3},
                   {2,4,6}};
        int[][]t=new int[m[0].length][m.length];

        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[0].length;j++)
            {
                t[j][i]=m[i][j];
            }
        }

        for(int i=0;i<t.length;i++)
        {
            for(int j=0;j<t[0].length;j++)
            {
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }
}
