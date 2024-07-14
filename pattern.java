import java.util.*;
class PATTERN
{
 public static void main(String arg[])
{
 int n,i,j,k;
 System.out.print("Enter the no of rows ");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 for(i=1;i<=n;i++)
{
 for(j=1;j<=n-i;j++)
{
 System.out.print(" ");
}
for(k=1;k<=i;k++)
{
 System.out.print("* ");
}
System.out.print("\n");
}

}
}