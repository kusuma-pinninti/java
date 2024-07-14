import java.util.*;
class GCD
{
  public static void main(String  args[])
{
  int a,b,gcd=1;
  System.out.println("Enter the first number");
  Scanner sc= new Scanner(System.in);
  a=sc.nextInt();
  System.out.println("Enter the second number");
  b=sc.nextInt();
  for(int i=1;i<a;i++)
  {
   if(a%i==0&&b%i==0)
   {
	gcd=i;
   }
  }
  System.out.print("gcd is"+gcd);

}

}