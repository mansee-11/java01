import java.util.Scanner;

// Sort an array of 0s, 1s and 2s (Dutch National Flag Problem)

public class day_04 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter no. of elements in array = ");
        int n=sc.nextInt();

        int[]arr=new int[n];
        System.out.println("enter elements of array one by one:-");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int low=0,mid=0 ,high=arr.length-1;

        while(high>=mid)
        {
            if(arr[mid]==0)
            {
                arr[low]=arr[low]+arr[mid];
                arr[mid]=arr[low]-arr[mid];
                arr[low]=arr[low]-arr[mid];
                low++;
                mid++;
            }
            else if (arr[mid]==2) {
                arr[mid]=arr[mid]+arr[high];
                arr[high]=arr[mid]-arr[high];
                arr[mid]=arr[mid]-arr[high];
                high--;
            }
            else{
                mid++;
            }
        }

        System.out.print("sorted array:- ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
