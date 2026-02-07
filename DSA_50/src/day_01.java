import java.util.Scanner;
// maximum and minimum element in an array
public class day_01 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("enter no. of elements in array = ");
        int n=sc.nextInt();

        int[]arr=new int[n];
        System.out.println("enter elements of array one by one:-");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0] , min=arr[0];

        for(int i:arr)
        {
            if(i<min)
            {
                min=i;
            }
            if(i>max)
            {
                max=i;
            }
        }

        System.out.println("max element is: "+max);
        System.out.println("min element is: "+min);
    }
}