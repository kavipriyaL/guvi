import java.util.*;
public class Player174 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        Set<String> a1=new HashSet();
        Set<String> a2=new HashSet();
        String[] sp1=s1.split(" ");
        String sp2[]=s2.split(" ");
        a1.addAll(Arrays.asList(sp1));
        a2.addAll(Arrays.asList(sp2));
        a2.removeAll(a1);
         Iterator ii=a2.iterator();
        System.out.println("1:"+ii.next());
        a2.clear();
        a2.addAll(Arrays.asList(sp2));
        a1.removeAll(a2);
        Iterator i=a1.iterator();
        while(i.hasNext())
        System.out.println("2:"+i.next());
    }
    
}
