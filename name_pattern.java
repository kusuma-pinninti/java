import java.util.*;
class name_pattern
{
public static void main(String args[])
{
int n,i,min,max,temp;
System.out.println("Enter the size of array:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
inr array[]=new int[n];
System.out.println("Enter the elements:");
for(i=0;i<n;i++)
{
array[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(array[i]>array[j])
{
temp=array[i];
array[i]=array[j];
array[j]=temp;
}
}
}
for(i=0;i<n;i++)
{
 System.out.println(array[i]);
}
}
}