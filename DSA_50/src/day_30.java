//Valid Palindrome after removing at most one character

public class day_30 {
    public static String r_palindrome(String s,String r,int n){
        if(n==s.length()) return "not possible";
        boolean flag=true;
        for (int i = 0, j = r.length() - 1; i < j; i++, j--) {
            if (r.charAt(i) != r.charAt(j)) {
                flag=false;
                break;
            }
        }
        if(flag) return "possible: "+r;
        else return r_palindrome(s,s.substring(0,n)+s.substring(n+1),n+1);
    }
    public static boolean is_palindrome(String s,int i,int j)
    {
        if(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static boolean valid_palindrome(String s)
    {
        for(int i=0,j=s.length()-1;i<j;i++,j--)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return(is_palindrome(s,i+1,j) || is_palindrome(s,i,j-1));
            }
        }
        return true;
    }
    public static void main(String[] args){

        String s="naeman";
        boolean flag=true;
        System.out.println(r_palindrome(s,s,0));
        System.out.println(valid_palindrome(s));
    }
}
