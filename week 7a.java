import java.util.*;
class random
{
public static void main(String args[])
{
int n,min,max;
Scanner sc=new Scanner(System.in);
Radom r=new Rnadom();
System.out.println("Enter the minimum value:");
min=sc.nextInt();
System.out.println("Enter the maximum value:");
min=sc.nextInt();
System.out.println("Enter the number of values:");
n=sc.nextInt();
while(int i=0;i<n;i++)
{
System.out.println(r.nextInt(max-min+1)+min);
}
}
}