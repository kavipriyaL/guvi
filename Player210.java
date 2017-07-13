import java.util.*;
public class Player210 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int len=Integer.toString(n).length();
        int r=0;
        TreeSet<Integer> s=new TreeSet<Integer>();
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            s.add(r);
        }
        Iterator i=s.iterator();
        while(i.hasNext())
        {
        System.out.print(i.next());
        }
    }
    
}
