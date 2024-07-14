import java.util.*;
class FIBONACCI
{
 public static void main(String args[])
{
 int a,i;
 int array[]=new int[100];
 System.out.println("Enter the number upto which you want the fibonacci series");
 Scanner sc=new Scanner(System.in);
 a=sc.nextInt();
 array[0]=1;array[1]=1;
 for(i=2;i<a;i++)
{
array[i]=array[i-1]+array[i-2];
}
System.out.print("Fibonacci series is :");
for(i=0;i<a;i++)
{
System.out.println(array[i]);
}
}
}