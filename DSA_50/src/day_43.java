//snake pattern printing

public class day_43 {
    public static void main(String[] args){

        int [][] mat = {{1,3,4},{2,5,6},{7,0,8}};

        for(int i=0;i<mat.length;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<mat[0].length;j++)
                {
                    System.out.print(mat[i][j]+" ");
                }
            }
            else
            {
                for(int j=mat[0].length-1;j>=0;j--)
                {
                    System.out.print(mat[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
