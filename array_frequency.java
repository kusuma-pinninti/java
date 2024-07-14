import java.util.*;
class Array_frequency
{
public static void main(String args[])
{
char array[]=new char[20],temp;
int i,j,n,count;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the array size :");
n=sc.nextInt();
System.out.print("Enter the array elements :\n");
for(i=1;i<=n;i++)
{
 array[i]=sc.next().charAt(0);
}
System.out.print("Array elements are :\n");
array[0]='\0';
for(i=1;i<=n;i++)
{
 System.out.print(array[i]+" ");
}
for(i=1;i<=n;i++)
{
for(j=i;j<=n;j++)
{
if(array[i]>=array[j])
{
temp=array[i];
array[i]=array[j];
array[j]=temp;
}
}
}
System.out.print("\nElement  Frequency\n");
for(i=1;i<=n;i++)
{
count=0;
for(j=i;j<=n;j++)
{
if(array[i]==array[j]&&array[i]!=array[i-1])
count++;
}
if(count!=0)
System.out.println(array[i]+"       "+count);
}
}
}