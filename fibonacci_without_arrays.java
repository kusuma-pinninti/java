import java.util.*;
class fibonacci
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
int n,temp,n1,n2,i;
System.out.print("Enter the number of fibonacci series numbers you want to print");
n=sc.nextInt();
n1=0;
n2=1;
if(n==1)
{
System.out.println(n1);
}
else if(n==2)
{
System.out.print(n1+"\n"+n2);
}
else
{
System.out.print(n1+"\n"+n2+"\n");
for(i=3;i<=n;i++)
{
 temp=n1+n2;
 System.out.println(temp);
 n1=n2;
 n2=temp;
}
}
}
}
