import java.util.*;
public class Player15
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        char c=s.charAt(1);
        char cc=Character.toUpperCase(c);
        String ss=s.substring(0,1);
        String sss=s.substring(2,s.length());
        System.out.print(ss+cc+sss);
       
    }
    
}
