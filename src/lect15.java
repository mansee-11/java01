import java.util.HashMap;

public class lect15 {
    public static void main(String[] args){
        /*

        HashMap<Integer,Integer> map=new HashMap<>();   //like dictionary in python
        map.put(11,23);
        map.put(5,2);
        System.out.println(map);
        System.out.println(map.get(11));    //get the value of key
        System.out.println(map.getOrDefault(3,100)); //if not found then print defualt value
        System.out.println(map.containsKey(3));

        //to print frequency of elements of array
        int a[]={1,2,3,2,1};
        HashMap<Integer,Integer> maparr=new HashMap<>();
        for(int i:a)
        {
            maparr.put(i,maparr.getOrDefault(i,0)+1);
        }
        System.out.println(maparr);

        // to print first non repeating char from string
        String s="mansee";
        HashMap<Character,Integer> maparr=new HashMap<>();
        for(char i:s.toCharArray())
        {
            maparr.put(i,maparr.getOrDefault(i,0)+1);
        }
        for(char i: s.toCharArray())
        {
            if(maparr.get(i)==1)
            {
                System.out.println("first non repeating char = "+ i);
                break;
            }
        }

        //target sum 9
        HashMap<Integer,Integer> maparr=new HashMap<>();
        int []a={2,7,5,15,11};
        int target=9;
        for(int i=0;i<a.length;i++)
        {
            int diff = target - a[i];
            if(maparr.containsKey(diff)){
                System.out.println("first index: "+maparr.get(diff)+" second index: "+i);
                break;
            }
            maparr.put(a[i],i);
        }
        */
        String str1="mansee",str2="ansem";
        HashMap<Character,Integer> maparr=new HashMap<>();
        HashMap<Character,Integer> maparr2=new HashMap<>();
        for(char i:str1.toCharArray())
        {
            maparr.put(i,maparr.getOrDefault(i,0)+1);
        }
        for(char i:str2.toCharArray())
        {
            maparr2.put(i,maparr2.getOrDefault(i,0)+1);
        }
        for(char i:maparr2.keySet()) {
            if (maparr.containsKey(i) && maparr.get(i) .equals(maparr2.get(i))) {
                continue;
            } else {
                System.out.println("No");
                break;
            }
        }


    }
}
