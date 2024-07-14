import java.util.*;
class Arrayprime
{
public static void main(String args[])
{
int array[]=new int[20],i,j,n,count,prime=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the array size :");
n=sc.nextInt();
System.out.print("Enter the array elements :\n");
for(i=0;i<n;i++)
{
 array[i]=sc.nextInt();
}
System.out.print("Array elements are :\n");
for(i=0;i<n;i++)
{
 System.out.print(array[i]+" ");
}
for(i=0;i<n;i++)
{
count=0;
 for(j=1;j<=array[i];j++)
{
if(array[i]==2)
{
continue;
}
else
{
 if(array[i]%j==0)
{
count++;
}
}
}
if(count==2)
{
prime++;
System.out.print( array[i]+" is a prime number.\n");
}
}
if(prime==0)
{
System.out.print("\nNo prime numbers are found.");
}

}
}