import java.util.*;
public class DublicateRemove 
{
    public static void main(String args[])
    {
        
        Scanner in=new Scanner(System.in);
        Set aa=new LinkedHashSet();
    
        String s=in.nextLine();
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
           aa.add(c[i]);
        }
            Iterator ii=aa.iterator();
            while(ii.hasNext())
            {
        System.out.print(ii.next());
            }
    }
    
}
