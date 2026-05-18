//Check if one string is a subsequence of another

public class day_35 {
    public static boolean subsequence(String s,String r,String x)
    {
        if(s.isEmpty())
        {
            if(r.equals(x))
            {
                return true;
            }
            return false;
        }
        boolean i=subsequence(s.substring(1),r,x+s.charAt(0));
        boolean j=subsequence(s.substring(1),r,x);
        return (i||j);
    }
    public static void main(String[] args){
        String s="abc",r="ab";
        System.out.println(subsequence(s,r,""));

        int i=0;
        int j=0;
        while(s.length()>i && r.length()>j)
        {
            if(s.charAt(i)==r.charAt(j))
            {
                j++;
            }
            i++;
        }
        if(j==r.length()) System.out.println(true);
        else System.out.println(false);
    }
}
