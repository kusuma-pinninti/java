import java.util.*;
class Area
{
 public static void main(String args[])
{
 float radi,area,perimeter;
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter the radius :");
 radi=sc.nextFloat();
 area=3.14f*radi*radi;
 perimeter=2*3.14f*radi;
 System.out.print("Area of circle is "+area);
 System.out.print("\nPerimeter of circle is "+perimeter);
 
}
}