import java.util.*;
class random
{
public static void main(String args[])
{
int n,min=1,max=1;
Scanner sc=new Scanner(System.in);
Random r=new Random();
System.out.println("Enter the minimum value:");
min=sc.nextInt();
System.out.println("Enter the maximum value:");
max=sc.nextInt();
System.out.println("Enter the number of values:");
n=sc.nextInt();
for(int i=0;i<n;i++)
{
int num=r.nextInt(max-min+1)+min;
System.out.println(num);
}
}
}