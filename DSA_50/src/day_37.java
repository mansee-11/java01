//Rotate matrix by 90 degrees clockwise && merge interval

import java.util.Arrays;

public class day_37 {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[][] result=new int[intervals.length][2];
        int j=0;
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<=end)
            {
                end=Math.max(end,intervals[i][1]);
            }
            else
            {
                result[j][0]=start;
                result[j][1]=end;
                j++;

                start=intervals[i][0];
                end=intervals[i][1];
            }
        }

        result[j][0]=start;
        result[j][1]=end;
        return Arrays.copyOf(result,j+1);
    }
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
                t[j][i]=m[m.length-1-i][j];
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
       int[][] result= merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        for(int[]i:result)
        {
            for (int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        result=merge(new int[][]{{4,7},{1,4}});
        for(int[]i:result)
        {
            for (int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
