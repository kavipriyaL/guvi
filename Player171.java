import java.util.*;
public class Player171
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
       ArrayList<String> a=new ArrayList<String>();
        String s=in.nextLine();
        String sp[]=s.split(" ");
        for(int i=0;i<sp.length;i++)
        {
            a.add(sp[i]);
        }
        String ss1="",ss2="";
        for(int i=0;i<sp.length-1;i++)
        {
          if(sp[i].equalsIgnoreCase("And"))
          {
              ss1=sp[i-1];
              ss2=sp[i+1];
              Collections.swap(a,i+1,i-1);
          }
        }
        Iterator r=a.iterator();
        while(r.hasNext())
        System.out.print(r.next()+" ");
    }
  }
