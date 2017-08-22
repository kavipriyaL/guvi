import java.util.*;
public class Player158
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList();
        int n=in.nextInt();
        int aa[]=new int[n];
        for(int i=0;i<n;i++)
        {
            aa[i]=in.nextInt();
            a.add(aa[i]);
        }
        int s=in.nextInt();
        int ss=in.nextInt();
        a.add(s,ss);
        Iterator r=a.iterator();
        while(r.hasNext())
        {
            System.out.print(r.next()+" ");
        }
    }
    
}
