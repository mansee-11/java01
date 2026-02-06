public class lect09 {
    int add(int arr[][]){
        int sum=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] agrs){

        int arr[][]={{1,2},{3,4}};
        lect09 s1=new lect09();
        int val= s1.add(arr);
        System.out.println(val);
    }

}
