import java.util.*;
class ARITHMETIC
{
public static void main(String args[])
{
int a,b;
char choice;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the first number :");
a=sc.nextInt();
System.out.print("Enter the second number :");
b=sc.nextInt();
System.out.print("+,-,*,/,%\n");
System.out.print("Enter your choice ");
choice=sc.next().charAt(0);
switch(choice)
{
 case '+':
  System.out.print("Sum is "+(a+b)+".");
  break;
case '-':
 System.out.print("Difference is "+(a-b)+".");
 break;
case '*':
System.out.print("Product is "+(a*b)+".");
break;
case '/':
System.out.print("Quotient is "+(a/b)+".");
break;
case '%':
System.out.print("Remainder is "+(a%b)+".");
break;
default:
System.out.print("Enter correct choice.");

}



}
}