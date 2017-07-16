import java.util.*;
public class Player173 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String s1=in.nextLine();
        String sp1[]=s.split(" ");
        String sp2[]=s1.split(" ");
        HashSet<String> ss=new HashSet<String>();
        HashSet<String> sss=new HashSet<String>();
        for(int i=0;i<sp1.length;i++)
        {
        ss.add(sp1[i]);
        }
        for(int i=0;i<sp2.length;i++)
             sss.add(sp2[i]);
        ss.removeAll(sss);
        Iterator i=ss.iterator();
        while(i.hasNext())        
        System.out.println(i.next());
    }
    
}
