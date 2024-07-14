import java.util.Scanner;
 class hierarchy {
 public static void main(String arg[])
 {
  Figure_3D array[]=new Figure_3D[3];
  array[0]=new Cylinder();
  array[1]=new Cone();
  array[2]=new Sphere();
for(int i=0;i<3;i++)
{
array[i].volume();
}
 }
 
}
class Figure_3D{
 void volume(){
 System.out.println("base class");
 }
 
}
class Cylinder extends Figure_3D{
int r,h;
 void volume(){
 Scanner a = new Scanner(System.in);
 System.out.println("enter radius of cylinder");
 r= a.nextInt();
 System.out.println("enter height of cylinder");
 h= a.nextInt();
 System.out.println("volume of cylinder is : "+3.14*r*r*h);
 }
 
}
class Cone extends Figure_3D{void volume(){
 Scanner a = new Scanner(System.in);
 System.out.println("enter radius of cone");
 int r= a.nextInt();
 System.out.println("enter height of cone");
 int h= a.nextInt();
 System.out.println("volume of cone is : "+(3.14*r*r*h)/3);
}
}
class Sphere extends Figure_3D{
 void volume(){
 Scanner a = new Scanner(System.in);
 System.out.println("enter radius of sphere");
 int r= a.nextInt();
 System.out.println("volume of sphere is : "+(4*3.14*r*r*r)/3);
 }
}
