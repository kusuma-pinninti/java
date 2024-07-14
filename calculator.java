import java.util.*;
class calculator
{
static int count;
calculator()
{
count++;
}
static double powerInt(int num1,int num2)
{
return Math.pow(num1,num2);
}
static double powerDouble(double num1,double num2)
{
return Math.pow(num1,num2);
}
public static void main(String args[])
{
int num1,num2;
double num11,num22;
System.out.println("Enter the integer values :");
Scanner sc=new Scanner(System.in);
num1=sc.nextInt();
num2=sc.nextInt();
System.out.println("num1 to the power of num2 is "+powerInt(num1,num2));
System.out.println("Enter the decimal values ");
num11=sc.nextDouble();
num22=sc.nextDouble();
System.out.println("num1 to the power of num2 is "+powerDouble(num11,num22));
System.out.println("Number of objects created are "+count);
}
}
