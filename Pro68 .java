import java.util.*;
public class Pro68 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String f_name=in.nextLine();
        String l_name=in.nextLine();
        String pin=in.nextLine();
        StringBuffer br=new StringBuffer(pin);
        String h=br.reverse().toString();
        int n=in.nextInt();
        int l1=f_name.length();
        int l2=l_name.length();
        ArrayList<Integer> aa=new ArrayList();
        aa.add(l1);
        aa.add(l2);
        int k=Collections.max(aa);
        int k1=Collections.min(aa);
        if(f_name.length()==k && k1<=k)
        {
          System.out.print(f_name.charAt(0));
          System.out.print(l_name);
        }
        else
        {
            System.out.print(l_name.charAt(0));
          System.out.print(f_name);
        
        }            
        char s=h.charAt(n-1);
        System.out.print(s);
        char ss=pin.charAt(n-1);
        System.out.println(ss);
        
    }
    
}
