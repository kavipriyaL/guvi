import java.util.*;
public class Seed
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int r,a;
        a=n;
        while(n!=0)
        {
            r=n%10;
            a=a*r;
            n=n/10;
        }
        System.out.println(a);
    }   
}
