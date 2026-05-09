// Compress the string

public class day_31 {
    public static void main(String[] args){
        String s="aabbcdddeaac";
        String r="";
        int n=1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                n+=1;
            }
            else
            {
                r+=s.charAt(i-1);
                r+=n;
                n=1;
            }
        }
        r+=s.charAt(s.length()-1);
        r+=n;
        System.out.println(r);
    }
}
