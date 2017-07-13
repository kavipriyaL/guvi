import java.util.*;
public class Player191 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int c=0;
        for(int i=n;c<=20;i++)
        {
            if(i%4==0)
            {
                System.out.println(i);
                c++;
            }
            
        }
    }
    
}
