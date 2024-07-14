import java.util.*;
class Square
{
double side;
void getDimensions(double s)
{
 side =s;
}
double sarea(double s)
{
return s*s;
}
double sperimeter(double s)
{
return 4*s;
}
}
class Object
{
 public static void main(String args[])
{
 double l;
 Square s1=new Square();
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the side length");
 l=sc.nextDouble();
 s1.getDimensions(l);
 double area=s1.sarea(l);
 double perimeter=s1.sperimeter(l);
 System.out.println("Area ="+area+" perimeter= "+perimeter);
 
}
}