import java.util.*;
class RIGHT_TRIANGLE
{
 public static void main(String args[])
{
 int n,i,j,k;
 Scanner input=new Scanner(System.in);
 System.out.print("Enter no of rows");
 n=input.nextInt();
 for(i=1;i<=n;i++)
{
 for(j=1;j<=i;j++)
{
 System.out.print("* ");
}
System.out.print("\n");
}
}
}