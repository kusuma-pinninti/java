package pack1;
import java.util.*;
public class Student
{
String name;
int roll_no;
Scanner sc=new Scanner(System.in);
public void get_details()
{
System.out.println("Enter name: ");
name=sc.nextLine();
System.out.println("Enter your roll number: ");
roll_no=sc.nextInt();
System.out.println(" name :"+name+"\nRoll number :"+roll_no);

}
}