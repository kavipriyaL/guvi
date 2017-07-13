import java.util.*;
public class Player206 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        char c;
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            c=s.charAt(i);
            if(Character.isLowerCase(c))
                System.out.print(Character.toUpperCase(c));
            else if(Character.isUpperCase(c))
                System.out.print(Character.toLowerCase(c));
        }
    }
}
