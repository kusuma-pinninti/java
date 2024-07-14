import java.util.*;
class Area
{
double sarea(double r)
{
return 3.14*r*r;
}
double area(double s)
{
return s*s;
}
double sarea(double l,double b)
{
return l*b;
}
double area(double b,double h)
{
return 0.5*b*h;
}
}
class Shape
{
public static void main(String args[])
{
System.out.println("1.Circle\n2.Square\n3.Rectangle\n4.Triangle\n5.Exit\n");
while(true)
{
System.out.println("Enter your choice to find out the area of a shape\n");
Scanner sc=new Scanner(System.in);
int choice;
choice=sc.nextInt();
Area s1=new Area();
if(choice==5)
break;
switch(choice)
{
case 1:
{
double r;
System.out.println("Enter the radius of the circle :");
r=sc.nextDouble();
System.out.println("Area of circle is "+s1.sarea(r));
break;
}
case 2:
{
double s;
System.out.println("Enter the side length of the square :");
s=sc.nextDouble();
System.out.println("Area of square is "+s1.area(s));
break;
}
case 3:
{
double l,b;
System.out.println("Enter the length and breadth of the reactangle :");
l=sc.nextDouble();
b=sc.nextDouble();
System.out.println("Area of the rectangle is :"+s1.sarea(l,b));
break;
}
case 4:
{
double b,h;
System.out.println("Enter the breadth and height of the triangle :");
b=sc.nextDouble();
h=sc.nextDouble();
System.out.println("Area of the triangle is :"+s1.area(b,h));
break;
}
}
}
}
}
