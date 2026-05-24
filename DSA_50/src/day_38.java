//Search in a row-wise and column-wise sorted matrix

public class day_38 {
    static void main(String[] args){
        int[][] m={{1,4,7,11},{2,5,8,12},{3,6,9,16}};
        int key=21;

        int i=0,j=m[0].length-1;
        while (i<m.length && j>=0)
        {
            if(m[i][j]==key)
            {
                System.out.println("found at index:- "+i+","+j);
                break;
            }
            else if (m[i][j]<key)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        if(i==m.length ||j<0) System.out.println("element not found");
    }
}
