import java.util.*;
class PRIMES
{
 public static void main(String args[])
{
 int a,i,count=0,j;
 System.out.println("Enter the number");
 Scanner sc=new Scanner(System.in);
 a=sc.nextInt();
 System.out.print("Prime numbers upto given number are");
 for(i=2;i<=a;i++)
{
count=0;
for(j=1;j<=i;j++)
{
 if(i%j==0)
{
count++;
}
}
if(count==2)
{
 System.out.println(i);
}
}
}
}