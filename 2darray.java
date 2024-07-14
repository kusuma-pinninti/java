import java.util.*;
class darray
{
public static void main(String args[])
{
int m,n,i,j,max,id=0,year=0,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of financial years");
m=sc.nextInt();
System.out.println("Enter the no of items");
n=sc.nextInt();
int array[][]=new int[m+1][n+1];
System.out.println("Enter the financial years");
for(i=1;i<=m;i++)
{
array[i][0]=sc.nextInt();
}
System.out.println("Enter the product ids");
for(i=1;i<=n;i++)
{
 array[0][i]=sc.nextInt();
}
for(i=1;i<=m;i++)
{
for(j=1;j<=n;j++)	
{
System.out.println("Enter the no of "+array[0][j]+" items sold in the year "+array[i][0]);
array[i][j]=sc.nextInt();

}
} 
System.out.println("The total no of sales in all years are ");
for(i=0;i<=m;i++)
{
for(j=0;j<=n;j++)
{
if(i==0&&j==0)
System.out.print("    ");
else
{
System.out.print(array[i][j]+" ");
}
}
System.out.println("\n");
}
max=array[1][1];
for(i=1;i<=m;i++)
{
for(j=1;j<=n;j++)
{
if(array[i][j]>max)
{
max=array[i][j];
id=array[0][j];
year=array[i][0];
}
}
}
System.out.println("Item "+id+" is "+"sold maximum in the year "+year);
}
}