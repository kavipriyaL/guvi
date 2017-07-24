import java.util.*;
public class Player177
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String sp[]=s.split(" ");
        ArrayList tt=new ArrayList();
        for(int i=0;i<sp.length;i++)
        {
            String ss=sp[i];
            tt.clear();
            for(int j=0;j<ss.length();j++)
            {
                
                char c=ss.charAt(j);
                tt.add(c);
                if(Character.isAlphabetic(c))
                   Collections.sort(tt);
            }
                Iterator r=tt.iterator();
                while(r.hasNext())
                {
                    System.out.print(r.next());
                 }
             System.out.print(" ");  
        }
    }  
}
