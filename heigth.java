import java.util.*;
public class heigth 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int aa[]=new int[n];
        int bb[]=new int[n];
        int k=in.nextInt();
        for(int i=0;i<n;i++)
        {
            aa[i]=in.nextInt();
         }
        Arrays.sort(aa);
        System.out.println(aa[3]);
        System.out.println(aa[k-1]);
        
    }
}
