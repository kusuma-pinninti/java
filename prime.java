import java.util.*;
class PRIME
{
 public static void main(String args[])
{
 int a,i,count=0;
 System.out.println("Enter the number");
 Scanner sc=new Scanner(System.in);
 a=sc.nextInt();
 for(i=1;i<=a;i++)
 {
  if(a%i==0)
 {
  count++;
 }
}
 if(count==2)
{
 System.out.print(a+" is a prime number");
}
else 
{
 System.out.print(a+" is not a prime number");
}
}
}