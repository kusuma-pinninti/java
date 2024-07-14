import java.util.*;
class 2darray
{
int m,n;
Scanner sc=new scanner(System.in);
System.out.println("Enter the no of financial years");
m=sc.nextInt;
System.out.println("Enetr the no of items");
n=sc.nextInt;
int array=new int[m+1][n+1];
system.out.println("Enter the financial years");
for(i=1;i<=m;i++)
{
array[i][0]=sc.nextInt;
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
System.our.println("The total no of sales in all years are ");
for(i=0;i<=m;i++)
{
for(j=0;j<=n;j++)	
{
System.out.println(array[i][j]);

}