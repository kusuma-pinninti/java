package report;
import pack1.*;
import java.util.*;
class person implements sports
{
public void display()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your favourite sport: ");
String name=sc.next();
System.out.println("Your favourite sport is "+name);
}
}
class main
{
public static void main(String args[])
{
Student s1=new Student();
s1.get_details();
person s2=new person();
s2.display();


}
}