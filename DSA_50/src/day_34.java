//Check if a string is a rotation of another string

public class day_34 {
    public static void main(String[] args){
        String s1="mansee",s2="nseema";

        if(s1.length()==s2.length() && (s1+s1).contains(s2))
        {
            System.out.println("one string is rotation of another string");
        }
        else
        {
            System.out.println("no");
        }
    }
}
