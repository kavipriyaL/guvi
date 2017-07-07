import java.util.*;
public class SumDigitPalindrome
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int r,s=0;
        while(a!=0)
        {
            r=a%10;
            s=s+r;
            a=a/10;
        }
        String ss=Integer.toString(s);
        StringBuilder br=new StringBuilder(ss);
        String k=br.reverse().toString();
        //String kk=Integer.toString(a);
        if(k.equals(ss))
        {
            System.out.println("Palindrome");
        }
        else 
        {
            System.out.println("Not palidrome");
        }
    }
    
}
