import java.util.*;
public class Reverselist
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        List<Integer> aa=new ArrayList<Integer>();
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            aa.add(a[i]);
        }
        Collections.reverse(aa);
        System.out.println(aa);
    }
    
}
