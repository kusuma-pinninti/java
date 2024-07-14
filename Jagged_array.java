import java.util.*;
class Jagged_array
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int n,i,j,count;
System.out.print("Enter the no of rows");
n=sc.nextInt();
int array[][]=new int[n][];
for(i=0;i<n;i++)
{
array[i]=new int[i+1];
}
count=0;
for(i=0;i<array.length;i++)
{
for(j=0;j<array[i].length;j++)
{
array[i][j]=count++;
}
}
System.out.println("Jagged array is :");
for(i=0;i<array.length;i++)
{
for(j=0;j<array[i].length;j++)
{
System.out.print(array[i][j]+" ");
}
System.out.print("\n");
}
}
}