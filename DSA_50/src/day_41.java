//Set entire row and column to 0 if any element is 0

public class day_41 {
    public static void main(String[] args){
        int [][] mat={{1,3,4,0},{2,5,6,8},{7,0,8,9}};
        int m=mat.length,n=mat[0].length;
        boolean col=false,row=false;
        for(int i=0;i<m;i++)
        {
            if (mat[i][0] == 0) {
                col = true;
                break;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(mat[0][i]==0){
                row=true;
                break;
            }
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(mat[i][j]==0)
                {
                    mat[i][0]=0;
                    mat[0][j]=0;
                }
            }
        }

        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++){
                if(mat[i][0]==0 || mat[0][j]==0) mat[i][j]=0;
            }
        }
        if(col)
        {
            for(int i=0;i<m;i++)
            {
                mat[i][0]=0;
            }
        }
        if(row){
            for(int j=0;j<n;j++)
            {
                mat[0][j]=0;
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
