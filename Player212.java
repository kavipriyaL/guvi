import java.util.*;
public class Player212 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        float c1=in.nextFloat();
        float r1=in.nextFloat();
        float r2=in.nextFloat();
        float t1=in.nextFloat();
        float t2=in.nextFloat();
        Circle(c1);
        Rectangle(r1,r2);
        Triangle(t1,t2);
    }
    static void Circle(float r)
    {
        System.out.println("Area of the Circle"+r*r*3.14);
    }
    static void Rectangle(float a,float b)
    {
        
        System.out.println("Area of the Rectangle"+a*b);
    }
   static void Triangle(float l,float b)
    {
        float k=l*b;
        System.out.println("Area of the triangle"+k/2);
    }
    
}
