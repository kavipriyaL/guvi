
import java.util.*;
public class NonRepeattt
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            if(a[i]==a[i+1])
            {
                System.out.print(a[i]);
                break;
            }
        }
    }
    
}
