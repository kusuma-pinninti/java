import java.util.*;
class vehicle
{
String veh;
vehicle(String veh)
{
this.veh=veh;
}
}
class brand extends vehicle
{
String bran;
brand(String veh,String bran )
{
super(veh);
this.bran=bran;
}
}
class cost extends brand
{
int cost;
cost(String veh,String bran,int cost)
{
super(veh,bran);
this.cost=cost;
}
void display()
{
System.out.println("Type of the vehicle is "+veh);
System.out.println("Brand of the vehicle is :"+bran);
System.out.println("cost of the vehicle is :"+cost);
}
}
class Test
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String veh,bran;
int cos;
System.out.println("Enter the type of  vehicle :");
veh=sc.nextLine();
System.out.println("Enter the vehicle brand :");
bran=sc.nextLine();
System.out.println("Enter the vehicle cost :");
cos=sc.nextInt();
cost v1=new cost(veh,bran,cos);
v1.display();
}
}