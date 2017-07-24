import java.util.*;
public class Player176 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        int c1=0,c2=0,i=0;
        String sp1[]=s1.split(" ",s1.length());
        String sp2[]=s2.split(" ",s2.length());
        ArrayList a1=new ArrayList();
        ArrayList a2=new ArrayList();
        for(i=0;i<sp1.length-1;i++)
        {
            String k=sp1[i];
            String kk=sp1[i]+1;
            char ccc=kk.charAt(i);
            char cc=k.charAt(i);
             a1.add(cc);
             a2.add(ccc);
        }
        a1.removeAll(a2);
        if(a1.isEmpty() )
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
        a1.clear();
        a2.clear();
        for(i=0;i<sp2.length;i++)
        {
             String k=sp2[i];
            String kk=sp2[i]+1;
            char ccc=kk.charAt(i);
            char cc=k.charAt(i);
             a1.add(cc);
             a2.add(ccc);
        }
        a1.removeAll(a2);
        if(a1.isEmpty())
            System.out.println("TRUE");
        else
            System.out.println("FALSE"); 
    }
}
