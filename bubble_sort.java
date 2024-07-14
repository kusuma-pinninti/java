import java.util.*;
class bubble_sort
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int n,i,j;
 System.out.print("Enter the size of the array");
 n=sc.nextInt();
 int array[]=new int[n];
System.out.print("Enter the array elements: \n");
for(i=0;i<n;i++)
{
array[i]=sc.nextInt();
}
System.out.print("Array after sorting is :\n");
for(i=0;i<n;i++)
{
for(j=0;j<n-i;j++)
{
if(array[j]>array[j+1])
{
 
}
}
}
}
}