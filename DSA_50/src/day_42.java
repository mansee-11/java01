//print diagonals of matrix

import javax.xml.transform.Source;

public class day_42 {
    public static void main(String[] args){
        int [][] mat = {{1,3,4},{2,5,6},{7,0,8}};

        for(int i=0;i<mat.length;i++)
        {
            System.out.println(mat[i][i]);
        }
        for(int i=0;i<mat.length;i++)
        {
            System.out.println(mat[i][mat.length-1-i]);
        }
    }
}
