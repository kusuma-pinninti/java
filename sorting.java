import java.util.*;
class sorting
{
public static void main(String args[])
{
int n,i,j,min,max,temp;
System.out.println("Enter the size of array:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int array[]=new int[n];
System.out.println("Enter the elements:");
for(i=0;i<n;i++)
{
array[i]=sc.nextInt();
}
min=array[0];
max=array[0];
for(i=0;i<n;i++)
{
if(min>array[i])
{
min=array[i];
}
if(max<array[i])
{
max=array[i];
}
}
for(i=0;i<n;i++)
{
for(j=i;j<n;j++)
{
if(array[i]>array[j])
{
temp=array[i];
array[i]=array[j];
array[j]=temp;
}
}
}
System.out.println("Array after sorting is :");
for(i=0;i<n;i++)
{
 System.out.println(array[i]);
}
System.out.print("\nMinimum element in the array is "+min);
System.out.print("\nMaximum element of the array is "+max);
System.out.print("\n Second maximum element of the array is "+array[n-1]);
}
}