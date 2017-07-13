import java.util.*;
public class Player213
{
    public static void main(String arggs[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        Set ss=new LinkedHashSet();
        char c;
        for(int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
        ss.add(c);
         }Iterator i=ss.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next());
        }
    }
    
}
