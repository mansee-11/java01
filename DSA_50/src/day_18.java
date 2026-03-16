//flip-flop implementation for matrix with 5 no.of 5 digit
import java.util.Scanner;
public class day_18 {
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int [][]a=new int[5][5];
        for(int i=0;i<5;i++)
        {
            int e = sc.nextInt();
            for(int j=4;j>=0;j--)
            {
                a[i][j]=e%10;
                e/=10;
            }
        }

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(a[i][j]==0)
                {
                    a[i][j]=1;
                }
                else
                {
                    a[i][j]=0;
                }
            }
        }

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
