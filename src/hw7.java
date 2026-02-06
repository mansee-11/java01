import java.util.Scanner;

public class hw7 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int i,j,n,sum=0;
        int[][] a = new int[2][3];
        System.out.println("enter element one by one:-");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                n=sc.nextInt();
                a[i][j]=n;
            }
        }
        /*
        //sum of all elements
        System.out.println("element of array are:-");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println(a[i][j]);
                sum+=a[i][j];
            }
        }
        System.out.println("sum of all elements = "+sum);

        //to print sum of elements of row
        for(i=0;i<2;i++)
        {
            int Rsum=0;
            for(j=0;j<3;j++)
            {
                Rsum+=a[i][j];
            }
            System.out.println("sum of row "+i+" is "+Rsum);
        }
        //to print sum of column
        for(i=0;i<a[0].length;i++)
        {
            int Csum=0;
            for(j=0;j<a.length;j++)
            {
                Csum+=a[j][i];
            }
            System.out.println("sum of column "+i+" is "+Csum);
        }
        */
        //to print max and min element of array
        int max=a[0][0],min=a[0][0];
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                if(a[i][j]>max)
                {
                    max=a[i][j];
                }
                if(a[i][j]<min)
                {
                    min=a[i][j];
                }
            }
        }
        System.out.println("max element of array is "+max);
        System.out.println("min element of array is "+min);
    }
}
