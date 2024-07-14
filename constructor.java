import java.util.*;
class details
{ String name;
int roll;
details()
{
Scanner sc=new Scanner(System.in);
name=sc.nextLine();
roll=sc.nextInt();
}
details(String name,int roll)
{
this.name=name;
this.roll=roll;
}
}
class constructor
{
public static void main(String args[])
{
System.out.print("Enter your name and roll number");
details s1=new details();
System.out.println("roll number is "+s1.roll);
System.out.println("Name is "+s1.name);
details s2=new details("Ashwini",2);
System.out.println("roll number is "+s2.roll);
System.out.println("Name is "+s2.name);
}
}